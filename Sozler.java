package Esas;

import java.util.Scanner;

//Hele istifade elemirem
public class Sozler {

	public static void birinciSoz() {
		System.out.println("1. Oyuncu Soz daxil etsin:");
	}

	public static String soz() {
		Scanner sc = new Scanner(System.in);
		String soz = sc.nextLine();
		return soz;
	}

	public static String soz2() {
		Scanner sc = new Scanner(System.in);
		String soz2 = sc.nextLine();
		return soz2;
	}
}
