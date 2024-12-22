package comm;

import java.util.Scanner;

public class Pattern8 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			// Taking user input for the number of rows
			System.out.print("Enter a number: ");
			int n = scanner.nextInt();
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(j%2+" ");
				}
				System.out.println();
			}

		}
	}

