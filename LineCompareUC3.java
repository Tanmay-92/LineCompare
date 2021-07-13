package LineCompare;

import java.util.Scanner;

public class LineCompareUC3 {
	public int Length_1() {
		Scanner length_1 = new Scanner(System.in);
		int X1 = length_1.nextInt();
		int Y1 = length_1.nextInt();
		int A = X1 - Y1;
		return A;

	}

	public int length_2() {
		Scanner length_2 = new Scanner(System.in);
		int X2 = length_2.nextInt();
		int Y2 = length_2.nextInt();
		int B = X2 - Y2;
		return B;
	}

	public static void main(String[] args) {
		System.out.println("enter the data for line comparison");
		LineCompareUC2 method = new LineCompareUC2();		
		if (method.Length_1() > method.length_2()) {
			System.out.println("Line 1 is greater than Line 2");
		} 
		else {
			System.out.println("Line 2 is greater than Line 1");
		}

	}

}
