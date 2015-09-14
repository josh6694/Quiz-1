package MainPackage;
//import scanner
import java.util.Scanner;

public class QbRating {
	public static void main(String[] args){
		// set a,b,c,d values for formula computing 
		double a;
		double b;
		double c;
		double d;
		// set scanner for input 
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter number of passing attempts:");
		double att = input.nextDouble(); // assign att value 
		
		System.out.print("Enter number of completions:");
		double comp = input.nextDouble();// assign comp value
		
		System.out.print("Enter number of passing yards:");
		double yds = input.nextDouble();// assign yds value 
		
		System.out.print("Enter number of touchdown passes:");
		double td = input.nextDouble();// assign td value
		
		System.out.print("Enter number of interceptions:");
		double inter = input.nextDouble();// assign inter value
		
		double PR; // set Passer Rating double 
		
		// compute formulas with given data 
		a=((comp/att)-0.3) * 5;
		b=((yds/att)-3) * .25;
		c=((td/att)*20);
		d=2.375-((inter/att) * 25);
		

		
		PR=((a+b+c+d)/6)*100; //final computation 
		System.out.format("Passer Rating: "+ "%.2f%n", PR);


	}
}

		
	
