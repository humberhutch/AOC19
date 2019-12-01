package hutchison.grant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) throws FileNotFoundException {
		part1();
		part2();
	}

	public static void part1() throws FileNotFoundException {
		File f = new File("day1.txt");
		Scanner in = new Scanner(f);

		int totalFuel = 0;
		while (in.hasNextLine()) {
			String data = in.nextLine().trim();
			int num = Integer.parseInt(data);

			// divide by 3 and round down to get 4, then subtract 2 to get 2.
			totalFuel += Math.floor(num / 3) - 2;

		}
		// Find total amount of fuel
		System.out.println(totalFuel);

	}

	public static void part2() throws FileNotFoundException {
		File f = new File("day1.txt");
		Scanner in = new Scanner(f);

		int totalFuel = 0;
		while (in.hasNextLine()) {
			String data = in.nextLine().trim();
			int num = Integer.parseInt(data);

			// divide by 3 and round down to get 4, then subtract 2 .
			int nextFuel = (int) Math.floor(num / 3) - 2; 
			int subTotal = 0;
			while (nextFuel>=0) { // if more fuel is zero or negative stop calculating
				subTotal += nextFuel; 
				nextFuel = (int) Math.floor(nextFuel / 3) - 2; // calculate next Fuel level
			}
			totalFuel += subTotal;
		}
		System.out.println(totalFuel);
	}
}
