import java.util.Scanner;

class Fahrenheit{
	public static void main(String[] args)
	{
int Centigrade;
int Fahrenheit;
Scanner obj = new Scanner(System.in);
Centigrade = obj.nextInt();
System.out.println("Enter temperature in Centigrade: " + Centigrade);
Fahrenheit = (9 * Centigrade/5) + 32;
System.out.println("Temperature in Fahrenheit is: " + Fahrenheit);
	}
}