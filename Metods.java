package Esas;

import java.util.Scanner;

public class Metods {
	public static boolean yoxla(String soz1, String soz2, int a) {
		if (soz1.charAt(a) == soz2.charAt(a)) {
			return true;
		} else {
			return false;
		}

	}
	public static void yoxla2(String soz,String soz2) {
		for (int i = 0; i < soz.length(); i++) {
			if (Metods.yoxla(soz, soz2, i)) {
				System.out.println((i + 1) + "ci herf duzdur:" + soz.charAt(i));
			} else {
				System.out.println((i + 1) + "ci herf duz deyil");
			}

		}
	}


	public static int haqq(String soz, int j) {
		return (soz.length() - j - 1);
	}

	public static void basliq(String soz) {
		System.out.println("-\n-\n-\n-\n-\n-\n-\n-\n-\n-\n-\n-\n-\n-\n2. Oyuncu sozu tapmaga calissin");
		System.out.println("Sozun ilk herfi:" + soz.charAt(0) + "\nSozun Uzunlugu:" + soz.length()
				+ "\n2. Oyuncu Soz daxil etsin:");
		EsasHisse.esasHisse(soz);
	}
	public static int secim() {
		Scanner sc=new Scanner(System.in);
		int secim=sc.nextInt();
		return secim;
		
	}

}