package HomeWork2.Loops;

public class Loops_1_2 {
    public static void main(String[] args) {

        String s = null;

        for (String arg : args) {
            s = arg;

        }

        char[] arr = s.toCharArray();
        //System.out.println(arr.length);

        int res = 1;
        int i =0;
        while (i < arr.length - 1) {
            int l = Integer.parseInt(String.valueOf(arr[i]));
            System.out.print(l + " * ");
            res = res * l;
            i++;
            if (i == arr.length - 1) {
                int l1 = Integer.parseInt(String.valueOf(arr[i]));
                System.out.print(l1);
                res = res * l1;
            }
        }
        System.out.println(" = " + res);


    }
}
