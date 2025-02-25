import java.util.Scanner;

public class Strings
{
  public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // String name = sc.nextLine();
    // System.out.println("Your name is : " +name);

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter first string");
    // String name1 = sc.next();
    // System.out.println("Enter secbnd string");
    // String name2 = sc.next();

    // if(name1.compareTo(name2)==0){
    //   System.out.println("Strings are equal");
    // }
    // else{
    //   System.out.println("Strings are not equal");
    // }
     
    // String sentence = "My name is Dheeraj";
    // String name = sentence.substring(11,sentence.length());
    // System.out.println(name);

    StringBuilder sb = new StringBuilder("Dheeraj");
    System.out.println(sb);

    System.out.println(sb.charAt(0));
    sb.setCharAt(0, 't');
    System.out.println(sb);

    sb.insert(0, 'M');
    System.out.println(sb);

    sb.delete(0, 2);
    sb.insert(0, 'D');
    sb.delete(2, 4);
    sb.insert(2, "i");
    System.out.println(sb);

  }
}