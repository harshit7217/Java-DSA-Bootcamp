import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int a[] = {5,4,2,3,8};

        reverseArray(a, 5);
    }

    public static void reverseArray(int a[], int n){
        int p1 = 0;
        int p2 = n-1;

        while(p1<p2) {
            int temp = a[p1];
            a[p1] = a[p2];
            a[p2] = temp;
            p1++;
            p2--;
        }

        System.out.println(Arrays.toString(a));
    }
}
