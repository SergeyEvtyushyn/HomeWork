package HomeWork1;

public class PoBit {
    public static void main(String[] args) {
        int a = 42; // 42 = 101010
        int b = 15; // 15 = 1111

        int x = a | b; //Оператор OR
        System.out.println("Значение для " + a + " OR " + b + " составляет: " + x); // x= 101111


        int y = a & b; // Оператор AND
        System.out.println("Значение для " + a + " AND " + b + " составляет: " + y); // y = 1010


        int XOR = a ^ b; // Оператор XOR
        System.out.println("Значение для " + a + " XOR " + b + " составляет: " + XOR); // XOR = 100101


        int NOTa = ~a; // Оператор NOT для a
        int NOTb = ~b; // Оператор NOT для b
        System.out.println("Значение оператора NOT для " + a + " составляет " + NOTa + ", для " + b + " составляет " + NOTb);
        // NOTa = 11111111111111111111111111010101, NOTb = 11111111111111111111111111110000


        byte z = 2;
        int shiftA = a << z; // Оператор сдвиг влево на z позиций для a
        int shiftB = b << z; // Оператор сдвиг влево на z позиций для b
        System.out.println("Значение сдвига влево на " + z + " позиции для " + a + " составляет " + shiftA + ", для " + b + " составляет " + shiftB);
        // shiftA = 10101000 , shiftB = 111100


        byte zr = 1;
        int shiftAr = a >> zr; // Оператор сдвиг вправо на zr позиций для a
        int shiftBr = b >> zr; // Оператор сдвиг вправо на zr позиций для b
        System.out.println("Значение сдвига вправо на " + zr + " позиции для " + a + " составляет " + shiftAr + ", для " + b + " составляет " + shiftBr);
        // shiftAr = 10101, shiftBr = 111


         byte zr_ = 3;
         int shiftAr_ = a >>> zr_; // Оператор сдвиг вправо без учета знака на zr_ позиций для a
         int shiftBr_ = b >>> zr_; // Оператор сдвиг вправо без учета знака на zr_ позиций для b
         System.out.println("Значение сдвига вправо без учета знака на " + zr_ + " позиции для " + a + " составляет " + shiftAr_ + ", для " + b + " составляет " + shiftBr_);
         // shiftAr_= 101, shiftBr_ = 1



        int a1 = a;
        int b1 = b;
        byte z1 = 2;

        a <<= z1; // Составной оператор сдвига влево на z1 позиций для a
        b <<= z1; // Составной оператор сдвига влево на z1 позиций для b
        System.out.println("Значение сдвига влево на " + z1 + " позиции для " + a1 + " составляет " + a + ", для " + b1 + " составляет " + b);
        // a = 10101000, b = 111100

    }
}
