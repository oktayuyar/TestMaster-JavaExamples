package com.oktay.study_01;

import java.util.Scanner;

/**
 * @author oktay
 *
 */
public class Main {

	private static Scanner scn;


	public static void main(String[] args) {
		
		Location Treasure=new Location();
		
		String message = "Merhaba Dünyalı biz dostuz.";

		scn = new Scanner(System.in);

		System.out.print("Ismi giriniz : ");
		String name = scn.nextLine();

		System.out.print("Zamani giriniz : ");
		int time = scn.nextInt();
	
		System.out.println(message.substring(0, 15) + " " + name + " " + message.substring(16, message.length()) + " "
				+ Planets.Mars + " gezegeninden geliyoruz.Seni " + time + " aydır izliyorduk."+
				 "Hazine " + Treasure.getLat()+ " enlem ve "+Treasure.getLongi()+" boylamda saklı.");

		Treasure.setLat(41.083713);
		Treasure.setLongi(37.639771);
		
		System.out.println(message.substring(0, 15) + " " + name + " " + message.substring(16, message.length()) + " "
				+ Planets.Mars + " gezegeninden geliyoruz.Seni " + time + " aydır izliyorduk."+
				 "Hazine " + Treasure.getLat()+ " enlem ve "+Treasure.getLongi()+" boylamda saklı.");

		
		Treasure.moveTreasure(41.09 , 37.50 );
		
		System.out.println(message.substring(0, 15) + " " + name + " " + message.substring(16, message.length()) + " "
				+ Planets.Mars + " gezegeninden geliyoruz.Seni " + time + " aydır izliyorduk."+
				 "Hazine " + Treasure.getLat()+ " enlem ve "+Treasure.getLongi()+" boylamda saklı.");

	}
	
	public enum Planets {
		Mars, Jupiter, Pluton
	}

}
