package HomeWork1;

public class PoBitMinus {
    public static void main(String[] args) {
        int a = -42; // -42 = 11111111111111111111111111010110
        int b = -15; // -15 = 11111111111111111111111111110001
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        {
            int x = a | b; //Оператор OR
            System.out.println("Значение для " + a + " OR " + b + " составляет: " + x); // x= 11111111111111111111111111110111
            System.out.println(Integer.toBinaryString(x));
        }

        {
            int y = a & b; // Оператор AND
            System.out.println("Значение для " + a + " AND " + b + " составляет: " + y); // y = 11111111111111111111111111010000
            System.out.println(Integer.toBinaryString(y));
        }

        {
            int XOR = a ^ b; // Оператор XOR
            System.out.println("Значение для " + a + " XOR " + b + " составляет: " + XOR); // XOR = 100111
            System.out.println(Integer.toBinaryString(XOR));
        }

        {
        int NOTa = ~a; // Оператор NOT для a
        int NOTb = ~b; // Оператор NOT для b
        System.out.println("Значение оператора NOT для " + a + " составляет " + NOTa + ", для " + b + " составляет " + NOTb);
        // NOTa = 101001, NOTb = 1110
            System.out.println(Integer.toBinaryString(NOTa));
            System.out.println(Integer.toBinaryString(NOTb));
        }
        {
            byte z = 2;
            int shiftA = a << z; // Оператор сдвиг влево на z позиций для a
            int shiftB = b << z; // Оператор сдвиг влево на z позиций для b
            System.out.println("Значение сдвига влево на " + z + " позиции для " + a + " составляет " + shiftA + ", для " + b + " составляет " + shiftB);
            // shiftA = 11111111111111111111111101011000 , shiftB = 11111111111111111111111111000100
            System.out.println(Integer.toBinaryString(shiftA));
            System.out.println(Integer.toBinaryString(shiftB));
        }
        {
            byte zr = 1;
            int shiftAr = a >> zr; // Оператор сдвиг вправо на zr позиций для a
            int shiftBr = b >> zr; // Оператор сдвиг вправо на zr позиций для b
            System.out.println("Значение сдвига вправо на " + zr + " позиции для " + a + " составляет " + shiftAr + ", для " + b + " составляет " + shiftBr);
            // shiftAr = 11111111111111111111111111101011, shiftBr = 11111111111111111111111111111000
            System.out.println(Integer.toBinaryString(shiftAr));
            System.out.println(Integer.toBinaryString(shiftBr));
        }

        {
            byte zr_ = 3;
            int shiftAr_ = a >>> zr_; // Оператор сдвиг вправо без учета знака на zr_ позиций для a
            int shiftBr_ = b >>> zr_; // Оператор сдвиг вправо без учета знака на zr_ позиций для b
            System.out.println("Значение сдвига вправо без учета знака на " + zr_ + " позиции для " + a + " составляет " + shiftAr_ + ", для " + b + " составляет " + shiftBr_);
            // shiftAr_= 11111111111111111111111111010, shiftBr_ = 11111111111111111111111111110
            System.out.println(Integer.toBinaryString(shiftAr_));
            System.out.println(Integer.toBinaryString(shiftBr_));
        }

        {
            int a1 = a;
            int b1 = b;
            byte z1 = 2;

            a <<= z1; // Составной оператор сдвига влево на z1 позиций для a
            b <<= z1; // Составной оператор сдвига влево на z1 позиций для b
            System.out.println("Значение сдвига влево на " + z1 + " позиции для " + a1 + " составляет " + a + ", для " + b1 + " составляет " + b);
            // a = 11111111111111111111111101011000, b = 11111111111111111111111111000100
            System.out.println(Integer.toBinaryString(a));
            System.out.println(Integer.toBinaryString(b));
        }

    }
}
