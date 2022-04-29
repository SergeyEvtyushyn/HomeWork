package HomeWork4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class DataContainer<E> {

    private E[] data;
    private E[] data1;
    public E i;

    public DataContainer (E[] data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataContainer<?> that = (DataContainer<?>) o;
        return Arrays.equals(data, that.data) && Arrays.equals(data1, that.data1) && i.equals(that.i);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(i);
        result = 31 * result + Arrays.hashCode(data);
        result = 31 * result + Arrays.hashCode(data1);
        return result;
    }

    public int addData(E data) {
        if (this.data.length == 0 || this.data[this.data.length - 1] != null ){
          this.data = Arrays.copyOf(this.data, this.data.length + 1);
        }
        if(this.data[this.data.length - 1] != null){
            System.out.println("Место кончилось"); //TODO заменить....
        }

        this.data[this.data.length - 1] = data;
       return add(this.data.length - 1);
    }


    public E[] getData() {
        return this.data;
    }
    
    public E get(int i) {
        E tmp = null;
            if (i < 0 || i > this.data.length - 1) { // TODO Доделать с null'ом
                System.out.println("Элемента с таким номером не существует");
             } else {
                tmp = data[i];
                System.out.println("Элемент на позиции " + i + ": " + tmp);
            }
         return tmp;
    }

    public boolean delete(int index){

        if (index < 0 || index > this.data.length - 1) {
            System.out.println("Не удалось удалить элемент. Индекс за границами массива.");
            return false;
        } else {
            this.data1 = Arrays.copyOf(this.data, this.data.length - 1);

            System.arraycopy(this.data, 0, this.data1, 0, index);
            System.arraycopy(this.data, index + 1, this.data1, index, this.data.length - index - 1);
            System.out.println(Arrays.toString(this.data1));
            return true;
        }
    }


    public boolean delete(E data) {
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i].equals(data)) {
                return delete(i);
            }
        }
        System.out.println("Не удалось удалить элемент. Совпадений не найдено.");
        return false;

    }

    public void sort(Comparator<E> cmp){
        for (int i = 0; i < this.data.length - 1; i++) {
            for (int j = 0; j < this.data.length - 1; j++) {
                if (cmp.compare(this.data[j], this.data[j+1]) > 0 ){
                    E tmp = this.data[j];
                    this.data[j] = this.data[j+1];
                    this.data[j+1] = tmp;
                }

            }

        }
    }


    @Override
    public String toString() {

        StringBuilder stringData = new StringBuilder("{ ");
        boolean needComma = false;
        for (int j = 0; j < this.data.length - 1; j++) {
            if (this.data[j] != null){
                if (needComma){
                    stringData.append(", ");
                } else {
                    needComma = true;
                }

                stringData.append(this.data[j]);
            }
        }

        stringData.append(" }");
        return stringData.toString();
    }



    public static int add(int i){
       // int x = i;
       //System.out.println("Добавлен элемент на позицию " + i);
       return i;
   }


}
