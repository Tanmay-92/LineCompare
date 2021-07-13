package LineCompare;

import java.util.Scanner;

public class LineCompareUC1 {
	public static void Calculating() {
		double linelength =0.0;
		Scanner linecompare = new Scanner(System.in);
		int X1 = linecompare.nextInt();
		int Y1 = linecompare.nextInt();
		int X2 = linecompare.nextInt();
		int Y2 = linecompare.nextInt();
		linelength = Math.sqrt((X2-X1)^2 + (Y2-Y1)^2);
		System.out.println("the result is:" +linelength);
		
	}

	public static void main(String[] args) {
		System.out.println("enter the data for line comparison");
		Calculating();
		
	
	}

}
