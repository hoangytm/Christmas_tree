package Chrismas_tree_main;

import java.util.Scanner;

public class execute {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("input the number of floor of christmas tree: ");
		int n = scanner.nextInt();
		// start drawing leaf
		System.out.println("           ");
		for (int floor = 0; floor < n; floor++) {

			for (int colum = 0; colum < n; colum++) {
				for (int j = 0; j < n * n; j++) {
					if ((j <= (n * n / 2 + colum + floor)) && (j >= (n * n / 2 - colum - floor))) {
						System.out.print("-");
					} else {
						if (j == (n * n - 1))
							System.out.println(" ");
						else
							System.out.print(" ");
					}
				}
			}
			if(floor==n-1) {
				System.out.println("");
			}
		}
			// draw root
			
				for (int root = 0; root < n; root++) {
					for (int k = 0; k < n * n; k++) {
						if ((k <= (n * n / 2 + 1)) && (k >= (n * n / 2 - 1)))
							System.out.print("-");
						else {
							if (k == (n * n - 1))
								System.out.println(" ");
							else
								System.out.print(" ");

						
					}
				}
			}

		
	}
}
