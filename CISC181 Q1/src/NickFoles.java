import java.util.Scanner;


public class NickFoles {
	public static void qbRating(){
		
	
	Scanner in = new Scanner (System.in);
	
	System.out.println("How many touchdowns did the QB throw? ");
	int TD = in.nextInt();
	
	System.out.println("How many total yards? ");
	int Yards = in.nextInt();
	
	System.out.println("How many interceptions thrown? ");
	int Interceptions = in.nextInt();
	
	System.out.println("How many completions thrown? ");
	int Comp = in.nextInt();
	
	System.out.println("How many attempted passes thrown? ");
	int ATT = in.nextInt();
	
	double a = ((Comp/ATT ) - .3) * 5;
	double b = ((Yards/ATT)- 3) * .25;
	double c = (TD/ATT) * 20;
	double d = 2.375 - (Interceptions/ATT) * 25;
	
	double passerRating = ((a + b + c + d)/6)  * 100;
	
	System.out.println("The passer rating is " + passerRating);
	
			}

}
