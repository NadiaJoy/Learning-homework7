import java.lang.reflect.Array;
import java.util.Random;

public class Calculation {
    public static void main(String[] args) {
        int size = 9;

        int[] myArray = new int[size];
        Random rd = new Random();
        for (int i = 0; i < size; i++) {
            myArray[i] = rd.nextInt();
            //System.out.println(i + " " +myArray[i]);
        }

        int[] myArray10 = new int[10];
        for (int i = 0; i < myArray10.length; i++) {
            myArray10[i] = i + 1;
            //System.out.println(i + " " + myArray10[i]);
        }

        int[] myArrayEven = new int[5];
        int j = 0;
        for (int i = 0; i < myArray10.length; i++) {
            if (myArray10[i] % 2 == 0) {
                myArrayEven[j] = myArray10[i];
                j++;
            }
        }
        int a = 0;
        while (a < myArrayEven.length) {
            System.out.println(a + " " +myArrayEven[a]);
            a++;
        }
    }
}

