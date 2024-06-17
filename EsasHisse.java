package Esas;

import java.util.Scanner;

public class EsasHisse {
	public static void esasHisse(String soz) {
		for (int j = 0; j < soz.length(); j++) {
			if (Metods.haqq(soz, j) != 0) {
				System.out.println(Metods.haqq(soz, j) + "Haqqiniz var");
				String soz2 = Sozler.soz2();
				if (soz.length() != soz2.length()) {
					Metods.yoxla2(soz, soz2);
					System.out.println("Sozunuz " + soz.length() + " herflidir.Diqqetli Olun");
				} else {
					if (soz.equalsIgnoreCase(soz2)) {
						System.out.println("Tebrikler Sozu Tapdiz:)");
						break;
					} else {

						Metods.yoxla2(soz, soz2);

					}
				}
			} else if (Metods.haqq(soz, j) == 0) {
				System.out.println("Uduzduz:(");
			}
		}
	}

	public static void maindi() {
		Sozler.birinciSoz();
		Metods.basliq(Sozler.soz());
	}

	public static void davamEt() {
		System.out.println("Oyuna Davam etmek Isteyirsiz?\n1.Beli\n2.Xeyr");

		if (Metods.secim() == 1) {
			EsasHisse.maindi();
		} else if (Metods.secim() == 2) {
			System.out.println("Oynadiginiz ucun cox sagolun:)");
		} else {
			System.out.println("Yanlis secim etmisiniz.");
		}
	}

}
