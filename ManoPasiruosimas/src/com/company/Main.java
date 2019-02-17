package com.company;

import java.util.*;

import static com.company.SildymasImpl.sildymasComparator;


public class Main {

	public static void main(String[] args) {
		SildymasImpl vartotojasPetras = new SildymasImpl(11111, "menesis", "Kauno_energija",
				102.30, 5.5, 101010, 12, 15);
		SildymasImpl vartotojasJonas = new SildymasImpl(22222, "menesis", "Lietuvos_energija",
				130.98, 3, 10202, 26, 31);
		SildymasImpl vartotojasPaulius = new SildymasImpl(33333, "du_menesiai", "Kauno_energija",
				198.5, 2.5, 103030, 54, 63);
		SildymasImpl vartotojasAntanas = new SildymasImpl(33333, "puse_metu", "Lietuvos_energija",
				123.00, 4, 104040, 75, 79);
		SildymasImpl vartotojasJurgis = new SildymasImpl(44444, "du_menesiai", "Jonavos_achema",
				56.80, 6, 105050, 3, 8);
		SildymasImpl vartotojasMarija = new SildymasImpl(66666, "menesis", "Jonavos_achema",
				84.7, 7, 106060, 10, 12);

		ArrayList<SildymasImpl> sildymoSaskaitos = new ArrayList<>();
		sildymoSaskaitos.add(vartotojasAntanas);
		sildymoSaskaitos.add(vartotojasJonas);
		sildymoSaskaitos.add(vartotojasJurgis);
		sildymoSaskaitos.add(vartotojasMarija);
		sildymoSaskaitos.add(vartotojasPaulius);
		sildymoSaskaitos.add(vartotojasPetras);

		System.out.println("Spausdinti vartotojų sąskaitas su for ciklu");
		spausdintiSaskaitas(sildymoSaskaitos);

		System.out.println("Spausdinti vartotoju saskaitas su while ciklu");
		Iterator<SildymasImpl> sildymasIteratorius = sildymoSaskaitos.iterator();  // int i=0;
		while (sildymasIteratorius.hasNext()) {                      //hasNext kaip i<n;
			System.out.println(sildymasIteratorius.next());  // i++
		}

		System.out.println("Surusiuoti pagal vandens pasildymo");
		Collections.sort(sildymoSaskaitos, sildymasComparator);
		spausdintiSaskaitas(sildymoSaskaitos);

		System.out.println("Pasalinti is saraso objektus kuriu psildymo kaina maziau uz 5");
		Iterator<SildymasImpl> it = sildymoSaskaitos.iterator();
		while (it.hasNext()) {
			SildymasImpl sildymas = it.next();
			if (sildymas.getVandensSildymoKaina() < 5) {
				it.remove();
			}
		}

		spausdintiSaskaitas(sildymoSaskaitos);

		System.out.println("Didziausia pasildymo kaina yra " + rastiMaxPasildyma(sildymoSaskaitos));
		System.out.println("Didžiausia pasildymo kaina pakeiciam  i 0");
		sumazintaKaina(sildymoSaskaitos);
		spausdintiSaskaitas(sildymoSaskaitos);
		}

	public static void spausdintiSaskaitas(ArrayList<SildymasImpl> sildymoSaskaitos) {
		for (SildymasImpl saskaitos : sildymoSaskaitos) {
			System.out.println(saskaitos);
		}
	}



	public static double rastiMaxPasildyma(ArrayList<SildymasImpl> sildymoSaskaitos) {
		double brangiausiasPasildymas = Integer.MIN_VALUE;
		for (SildymasImpl saskaitos : sildymoSaskaitos) {
			if (saskaitos.getVandensSildymoKaina() > brangiausiasPasildymas) {
				brangiausiasPasildymas = saskaitos.getVandensSildymoKaina();
			}
		}
		return brangiausiasPasildymas;

	}

	public static void sumazintaKaina(ArrayList<SildymasImpl> sildymoSaskaitos) {
		double brangiausia = rastiMaxPasildyma(sildymoSaskaitos);
		for (SildymasImpl saskaitos : sildymoSaskaitos) {
			if (saskaitos.getVandensSildymoKaina() == brangiausia) {
				saskaitos.setVandensSildymoKaina(0.00);
				System.out.println(String.format("Sumazinta saskaita nr %s, tiekejas %s, nauja sildymo kaina: %s Eur",
						saskaitos.getSaskaitosNr(), saskaitos.getTiekejas(),
						saskaitos.getVandensSildymoKaina()));
			}
		}

	}
}


