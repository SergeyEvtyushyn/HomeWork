package HomeWork4;

import java.util.Arrays;
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

    public void addData(E data) {
        if (this.data.length == 0 || this.data[this.data.length - 1] != null ){
          this.data = Arrays.copyOf(this.data, this.data.length + 1);
        }
        if(this.data[this.data.length - 1] != null){
            System.out.println("Место кончилось"); //TODO заменить....
        }

        this.data[this.data.length - 1] = data;
        add(this.data.length - 1);
    }


    public E[] getData() {
        return data;
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


    public boolean deleteeq(E data) {
        int index;

        for (int i = 0; i < this.data.length; i++) {
            boolean isEquals = this.data[i].equals(data);
            if (isEquals) {
                index = i;
                this.data1 = Arrays.copyOf(this.data, this.data.length - 1);
                System.arraycopy(this.data, 0, this.data1, 0, index);
                System.arraycopy(this.data, index + 1, this.data1, index, this.data.length - index - 1);
                System.out.println(Arrays.toString(this.data1));
                return true;

            } else {
                System.out.println("Не удалось удалить элемент. Совпадений не найдено.");
                return false;
            }
        }
       return true;
    }

   public static int add(int i){
       // int x = i;
       System.out.println("Добавлен элемент на позицию " + i);
       return i;
   }


}
