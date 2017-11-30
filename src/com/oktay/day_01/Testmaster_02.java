package com.oktay.day_01;

import java.util.Scanner;

public class Testmaster_02 {
	private static Scanner scn;

	public static void main(String[] args) {

		String mesaj = "Merhaba Dünyalı biz dostuz.";

		scn = new Scanner(System.in);

		System.out.print("Ismi giriniz : ");
		String isim = scn.nextLine();

		System.out.print("Zamanı giriniz : ");
		int zaman = scn.nextInt();

		System.out.println(mesaj.substring(0, 15) + " " + isim + " " + mesaj.substring(16, mesaj.length()) + " "
				+ Gezegenler.Mars + " gezegeninden geliyoruz.Seni " + zaman + " aydır izliyorduk.");

	}

	public enum Gezegenler {
		Mars, Jupiter, Pluton
	}

}
