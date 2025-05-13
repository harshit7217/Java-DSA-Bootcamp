import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int a[] = {3,4,4,6,7,9,9,10};
        int b[] = removeDuplicates(a);

        System.out.println(Arrays.toString(b));
    }

    // remove duplicates from sorted array
    // input = 3,4,4,6,7,9,9,10
    // output = 3,4,6,7,9,10

    public static int[] removeDuplicates(int a[]) {
       int p2 = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                a[p2++] = a[i];
            }
        }
        
        return Arrays.copyOf(a, p2);
    }


}
