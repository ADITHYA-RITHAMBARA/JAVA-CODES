import java.util.*;
public class Declarations
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter an Integer: ");
    int a=sc.nextInt();
    System.out.println("Enter a Character: ");
    char b=sc.next().charAt(0);
    System.out.println("Enter a Float: ");
    float c=sc.nextFloat();
    System.out.println("Enter a Double: ");
    double d=sc.nextDouble();
    System.out.println("Enter a Boolean: ");
    boolean e=sc.nextBoolean();
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
}
}
