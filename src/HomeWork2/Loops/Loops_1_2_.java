package HomeWork2.Loops;

public class Loops_1_2_ {


    public static long count(String m) {

//      String s = null;

//      for (String arg : m) {
//          s = arg;

//      }

        char[] arr = m.toCharArray();

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

        return res;
    }
}
