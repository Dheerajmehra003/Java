import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
       
       // create an array using user Input

        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int number[] = new int[size];

        // for(int i = 0; i<size; i++){
        //     number[i] = sc.nextInt();
        // }

        // System.out.println("Array is here : ");

        // for(int i=0; i<size; i++){
        //     System.out.print(number[i]+ " ");
        // }
        
        // Find the index of a given number in array
        
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the length of array : ");
        // int size = sc.nextInt();
        // int number[] = new int[size];

        // System.out.println("Enter the array number :");
        // for(int i = 0; i<number.length; i++){
        //     number[i] = sc.nextInt();
        // }

        // System.out.println("Enter the number you want to find ");
        // int x = sc.nextInt();

        // for(int i=0; i<number.length; i++){
        //     if(number[i]==x){
        //         System.out.println("The number was found at index : " +i);
        //     }
        // }

        // Find the minimum and maximum value in a array 

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the length of array : ");
        // int size = sc.nextInt();
        // int number[] = new int[size];

        // System.out.println("Enter the array number :");
        // for(int i = 0; i<number.length; i++){
        //     number[i] = sc.nextInt();
        // }

        // int max = Integer.MIN_VALUE; // -2147483648
        // int min = Integer.MAX_VALUE; // 2147483648

        // for( int i=0; i<number.length;i++){
        //     if(number[i]<min){
        //        min = number[i];
        //     }
        //     if(number[i]>max){
        //      max = number[i];
        //     }
        // }
        // System.out.println("minimum number is : " +min);
        // System.out.println("maximum number is : " +max);

        // create a two dimensonal array using user input

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the length of rows : ");
        // int row = sc.nextInt();
        // System.out.println("Enter the length of columns : ");
        // int col = sc.nextInt();

        // int number[][] = new int[row][col];

        // System.out.println("Enter the numbers of an array : ");
        // for(int i=0; i<row; i++){
        //     for(int j=0; j<col; j++){
        //         number[i][j] = sc.nextInt();
        //     }
        // }

        // System.out.println("Array is here : ");
        // for(int i = 0; i<row; i++){
        //     for(int j=0; j<col; j++){
        //         System.out.print(number[i][j] + " ");
        //     }
        //     System.out.println();

        // }
     
        // find the indeces of  given number in 2D array

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter the length of columns : ");
        int col = sc.nextInt();

        int number[][] = new int[row][col];

        System.out.println("Enter the numbers of an array : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                number[i][j] = sc.nextInt();
            }
        } 

        System.out.println("Enter the number to get its indecies :");
        int x = sc.nextInt();

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(number[i][j]== x){
                    System.out.println("The index of given number are : " +i + " " +j);
                }
            }
        }


    }
}
