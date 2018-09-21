import java.util.Scanner;

public class RMBCactual
{
public static void main (String[] args)
{
final double CONVERSION_FACTOR = 6.5 / 1.0 ;
Scanner sc = new Scanner(System.in);
System.out.print( "Enter the amount of RMB you want converted");
int b = sc.nextInt();

double RMB= b ;
double USD;
USD = RMB/ CONVERSION_FACTOR;
System.out.println("RMB =" + b );
System.out.println("USD =" + USD );


}


}
