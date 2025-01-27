// import java.util.Arrays;
import java.util.Scanner;


public class Main {

public static void main(String[] args) {
    // String name = "Dheeraj";
    // String caste = "Mehra";
    // String fullName = name + " " + caste;
    // String name2 = name.replace("e","i");
    // int[] marks = new int[3];
    // marks[0] = 30;
    // marks[1] = 60;
    // marks[2] = 50;
    // int[] marks = {30, 60, 50};
    // int[][] finalMarks = {{52, 85, 95},{78,52,65}};
    // implicit casting
      //  double price = 100.00;
      //  double finalPrice = price + 18;
    //exlpicit casting
      //  int p = 100;
      //  int fp = p + (int)18.99;
        




    // System.out.println(name.length());
    // System.out.println(fullName);
    // System.out.println(fullName.charAt(7));
    // System.out.println(name2);
    // System.out.println(name.substring(0, 5));
    // System.out.println(marks[1]);
    // Arrays.sort(marks);
    // System.out.println(marks[1]);
    // System.out.println(finalMarks[0][2]);
   //  System.out.println(finalPrice);
   //  System.out.println(fp);
      //  System.out.println(Math.random());
      //  System.out.println((int)Math.random());
      //  System.out.println((int)(Math.random()*10));
      //  System.out.println((int)(Math.random()*100));
      //  System.out.println((int)(Math.random()*10000));

      // Scanner sc = new Scanner(System.in);
      // try {
      //     System.out.println("Input your age: ");
      //     int age = sc.nextInt();
      //     System.out.println("Your age is: " + age);
      // } catch (Exception e) {
      //     System.out.println("Invalid input. Please enter a valid number.");
      // } finally {
      //     sc.close(); // Closing the Scanner
      // }
      // try {
      //     System.out.println("Input your name: ");
      //     // String name = sc.next();
      //     String name = sc.nextLine();
      //     System.out.println( name);
      // } catch (Exception e) {
      //     System.out.println("Invalid input. Please enter a valid number.");
      // } finally {
      //     sc.close(); // Closing the Scanner
      // }
        // int i = 0;
        // while (true) {
        //   if(i == 3){
        //     i = i + 1;
        //     continue;
        //   } 
        //   System.out.println(i);
        //    i = i + 1;
        //    if (i > 5) {
        //     break;
        //    }
        // }

        // Mini project

        // int generatedNumber;
        // generatedNumber = (int)(Math.random()*10);
        // // System.out.println(generatedNumber);
       
        // while (true) {
        //   Scanner UserGuessed = new Scanner(System.in);
        //   System.out.println("Enter your Number : ");
        //   int number = UserGuessed.nextInt();
        //   if (number == generatedNumber) {
        //     System.out.println("You Guessed the right number");
        //     break;
        //   }
        //   if(number > generatedNumber){
        //     System.out.println("Number guessed is bigger  ");
        //   }
        //   else if(number < generatedNumber){
        //     System.out.println("Number guessed is smaller  ");
        //   }
        // }

        // 1 Pattern Question rectangle
        // int count;
        // for(count = 1; count <= 4; count++){
        //   for(int j = 1; j <= 5; j++){
        //     System.out.print("*");
        //   }
        //   System.out.println();
        // }

        // 2 Pattern Question Hollow Rectangle
        // for(int i=1; i<=4; i++){
        //   for(int j=1; j<=5; j++){
        //     if (i==1 || j==1 || i==4 || j==5) {
        //       System.out.print("*");
        //     }
        //     else{
        //       System.out.print(" ");
        //     }
        //   }
        //   System.out.println();
        // }

        // 3 Pattern Question  half Pyramid
        // for(int i=1; i<=7; i++){
        //   for(int j=1; j<=i; j++){
        //    System.out.print("*");
        //   }
        //   System.out.println();
        // }

        // 4 Pattern Question  half  Inverted Pyramid
        // for(int i=4; i>0; i--){
        //   for(int j=1; j<=i; j++){
        //    System.out.print("*");
        //   }
        //   System.out.println();
        // }

        // 5 Pattern Question  half  Inverted Pyramid rotated by 180 degree
        // int n = 4;
        // for(int i=1; i<=n; i++){
        //   for(int j=1; j<=n-i; j++){
        //     System.out.print(" ");
        //   }
        //   for(int j=1; j<=i; j++){
        //        System.out.print("*");
        //       }
        //   System.out.println();
        // }

        // 6 Pattern Question  half Pyramid with numbers
        // int n = 5;
        // for(int i=1; i<=n; i++){
        //   for(int j=1; j<=i; j++){
        //    System.out.print(j+ " ");
        //   }
        //   System.out.println();
        // }

        // 7 Pattern Question Inverted half pyramid with numbers
        // int n = 5;
        // for(int i=n; i>=1; i--){
        //   for(int j=1; j<=i; j++){
        //     System.out.print(j + " ");
        //   }
        //   System.out.println();
        // }

        // 8 Pattern Question Floyed triangle
        // int n = 5;
        // int number = 1;
        // for(int i=1; i<=n; i++){
        //   for(int j=1; j<=i; j++){
        //     System.out.print(number + " ");
        //     number++;
        //   }
        //   System.out.println();
        // }

        // 9 Pattern Question 0-1 Triangle 
        // int n = 5;
        // for(int i=1; i<=n; i++){
        //   for(int j=1; j<=i; j++){
        //     if((i+j) % 2 == 0){
        //       System.out.print("1");
        //     }
        //     else{
        //       System.out.print("0");
        //     }
        //   }
        //   System.out.println();
        // }

        // 10 Pattern Question Butterfly pattern
        // int n = 4;
        // for(int i=1; i<=n; i++){
        //   for(int j=1; j<=i; j++){
        //     System.out.print("*");
        //   }
        //   int spaces = 2*(n-i);
        //   for(int j=1; j<=spaces; j++){
        //     System.out.print(" ");
        //   }
        //   for(int j=1; j<=i; j++){
        //     System.out.print("*");
        //   }
        //   System.out.println();
        // }
        // for(int i=n; i>=1; i--){
        //   for(int j=1; j<=i; j++){
        //     System.out.print("*");
        //   }
        //   int spaces = 2*(n-i);
        //   for(int j=1; j<=spaces; j++){
        //     System.out.print(" ");
        //   }
        //   for(int j=1; j<=i; j++){
        //     System.out.print("*");
        //   }
        //   System.out.println();
        // }

        // 11 Pattern Question Solid Rhombus
        // int n=5;
        // for(int i=1; i<=5; i++){
        //   int spaces = n-i;
        //   for(int j=1; j<=spaces; j++){
        //     System.out.print(" ");
        //   }
        //   for(int j=1; j<=5; j++){
        //     System.out.print("*");
        //   }
        //   System.out.println();
        // }

        // 12 Pattern Question Number Pyrmaid
        //  int n=5;
        //  for(int i=0; i<=n; i++){
        //   int spaces = n-i;
        //   for(int j=1; j<=spaces; j++){
        //     System.out.print(" ");
        //   }
        //   for(int j=1; j<=i; j++){
        //     System.out.print(i + " ");
        //   }
        //   System.out.println();
        //  }

         // 13 Pattern Question Pallindrome Pattern
        //  int n =5;
        //  for(int i=1; i<=n; i++){
        //    for(int j=1; j<=n-i; j++){
        //     System.out.print(" ");
        //    }
        //    for(int j=i; j>=1; j--){
        //      System.out.print(j);
        //    }
        //    for(int j=2; j<=i; j++){  
        //      System.out.print(j); 
        //    }
        //   System.out.println();
        //  }

         // 14 Pattern Question Diamond Pattern
        //  int n = 5;
        //  for(int i = 1; i<=n; i++){
        //   for(int j=1; j<=n-i; j++){
        //     System.out.print(" ");
        //   }
        //   for(int j=1; j<=i; j++){
        //     System.out.print("*"+ " ");
        //   }
        //   System.out.println();
        //  }
        //  for(int i = n; i>=1; i--){
        //   for(int j=1; j<=n-i; j++){
        //     System.out.print(" ");
        //   }
        //   for(int j=1; j<=i; j++){
        //     System.out.print("*"+ " ");
        //   }
        //   System.out.println();
        //  }

        //
  } 
}
