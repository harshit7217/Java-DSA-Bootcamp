public class Day3Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial using Loops : ");
        getFacto(4);
        System.out.println("Factorial using recursive : "+getFactorial(5));
        System.out.println("Display a numbers");
        displayNums(10);
        System.out.println("Fibonacci Series :");
        for(int i=0; i<10; i++){
            System.out.println(getFibo(i));
        }
    }

    public static void getFacto(int n){
        int fact = 1;
        for(int i= 1; i<=n; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
// Non tail recursive
    public static int getFactorial(int n){
        // base condition
        if(n==1)
            return 1;
        
        // recursive case
        return n*getFactorial(n-1);
        
    }
// tail recursive
    public static void displayNums(int n){
        if(n==1){
            System.out.println(n);
        }else{
            System.out.println(n);
            displayNums(n-1);
        }
    }

    // Fibonacci Series
    // 0 1 we addition of two previous number
    // 0 1 1 2 3 5 8 ....
    public static int getFibo(int n){
        if(n<=1){
            return n;
        }else{
            return getFibo(n-1)+getFibo(n-2);
        }
    }
}
