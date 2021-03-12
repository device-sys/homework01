package com.vektorel.odev_02;
import java.util.Scanner;

public class soru_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int toplam = 0;
		
		System.out.println("Basamaklarini toplamak istediginiz sayiyi giriniz : ");
		int sayi = scan.nextInt();
		int numara = sayi;
		
		while(sayi != 0)
		{
			int kalan = (sayi % 10);
			toplam += kalan;
			sayi /= 10;
		}
		
		System.out.println(numara+" sayisinin basamaklari toplami : "+toplam);

	}

}
