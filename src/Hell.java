import java.util.Scanner;

public class Hell {
	public static void main (String[] args){
		
		Scanner input =	new Scanner(System.in);
		while(true){
			System.out.println("Welcome, input radius of a circle:");
			double radius = input.nextDouble();
			double area = radius * 3.14159 * radius;
			System.out.println("Area =" + area);
			
		}
	}
}
