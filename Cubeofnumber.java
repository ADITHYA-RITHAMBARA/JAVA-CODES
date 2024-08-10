import java.util.Scanner;
public class Cubeofnumber
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n=sc.nextInt();
    double cube=Math.pow(n,3);
    System.out.println(cube);
}    
    
}
