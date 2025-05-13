import java.util.Arrays;

class Demo2 {
    public static void main(String[] args) {
        
        int a[] = {3,5,7,9,11};
        System.out.println("Linear Search");
        System.out.println(getElem(a, 9));
        System.out.println("Binary Search");
        System.out.println(binarySearch(a, 5));
        int b[] = {3,7,10,9,1,2};
        bubbleSort(b);
    }

    // linear Search
    public static int getElem(int a[], int elem) {

        for(int i=0; i<a.length; i++)  {
            if(elem == a[i]) {
                return i+1;
            }
        }
        return -1;
    }

    // binary search
    public static int binarySearch(int a[], int ele) {
       int l = 0;
       int r = a.length-1;

       while(l<=r){
        int mid = (l+r)/2;
        if(a[mid] == ele) {
            return mid;
        }else if(ele>a[mid]) {
            l = mid + 1;
        }else if(ele<a[mid]){
            r = mid - 1;
        }
       }
       return -1;
    }

    // sorting
    // bubble Sort
    public static void bubbleSort(int a[]) {
        boolean swapped = false;
        for(int j=0; j<a.length; j++) {
            swapped = false;
            for(int i=0; i<a.length-1; i++) {
                if(a[i]>a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
                swapped = true;
            }
            
            }
            if(swapped == false) {
                break;
            }
        }
        System.out.println(Arrays.toString(a));
    }


}