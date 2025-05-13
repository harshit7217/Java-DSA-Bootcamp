import java.util.Scanner;

class Demo {
    public static void main(String args[]) {

        System.out.println("Hello World");

        int num = 10;

        int marks1 = 20;
        int marks2 = 30;


        // array    

        int marks[] = new int[10];

        int marks3[] = {30, 40, 50,60,70, 80, 90, 25, 35, 55};

        marks[0] = 20;
        marks[1] = 40;

        int vals[] = new int[5];
        
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<5; i++) {
            System.out.println("Enter value");
            vals[i] = sc.nextInt();
        }

        for(int i=0; i<5; i++) {
            System.out.println(vals[i]);
        }

        // 2d array

        int heights[][] = new int[2][3];

        for(int i=0; i<2; i++) {
            for(int j=0; j<3; j++) {
                System.out.println("Enter a value");
                heights[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<2; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(heights[i][j]+"\t");
            }
            System.out.println();
        }

    }


}