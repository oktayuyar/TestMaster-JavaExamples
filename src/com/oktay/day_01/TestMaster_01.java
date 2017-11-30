package com.oktay.day_01;

import java.util.Scanner;

/**
 * @author oktay
 *
 */
public class TestMaster_01 {

	private static Scanner scn;

	public static void main(String[] args) {

		System.out.println("Hello World!");
		
		scn = new Scanner(System.in);
		
		System.out.print("Saati giriniz : ");
		int saat = scn.nextInt();
		System.out.print("Dakikayı giriniz : ");
		int dakika= scn.nextInt();
		System.out.print("Saniyeyi giriniz : ");
		int saniye= scn.nextInt();		
		
		Hesapla(saat, dakika, saniye);

	}
	
	public static void Hesapla(int saat,int dakika,int saniye){
		int toplam=0;
		toplam=toplam+saat*60 +dakika*60 + saniye;
		
		System.out.println(toplam);
	}
	

}
