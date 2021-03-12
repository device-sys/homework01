package com.vektorel.odev_02;
import java.util.Scanner;

public class soru_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Kac adet sayi girilsin : ");
		int adet = scan.nextInt();
		
		int[] dizi = new int[adet];
		
		for(int i=0 ; i<adet ; i++) //Kullan�c�dan al�nan say�lar�n dizi i�erisine kay�t edilme k�sm�
		{
			System.out.println(i+". sayiyi giriniz : ");
			dizi[i] = scan.nextInt();
		}
		
		System.out.println("Diziniz : ");
		for(int i=0 ; i<dizi.length ; i++)
		{
			System.out.print(dizi[i]+" ");
		}
		
		System.out.println();
		
		int buyuk = dizi[0];	int kucuk = dizi[0]; //Dizinin i�erisindeki en b�y�k ve en k���k elemanlar� 
		for(int i=0 ; i<dizi.length ; i++)           //bulma k�sm�
		{
			if(dizi[i] > buyuk)
				buyuk = dizi[i];
			
			if(dizi[i] < kucuk)
				kucuk = dizi[i];
		}
		System.out.println("Dizinin en buyuk elemani : "+buyuk);
		System.out.println("Dizinin en kucuk elemani : "+kucuk);
		
		int toplam = 0; double ortalama; //Dizinin ortalamas�n� bulan k�s�m
		for(int i=0 ; i<dizi.length ; i++)
		{
			toplam += dizi[i];
		}
		ortalama = (toplam / dizi.length);
		System.out.println("Dizinin elemanlar�n�n ortalamasi : "+ortalama);
		
		for(int i=0 ; i<(dizi.length)-1 ; i++)//Dizinin k���kten b�y��e s�ralanma k�sm�
		{
			for(int j=(i+1) ; j<dizi.length ; j++)
			{
				if(dizi[j] < dizi[i])
				{
					int temp = dizi[j];
					dizi[j] = dizi[i];
					dizi[i] = temp;
				}
			}
		}
		
		System.out.println("Dizinin siralanmis hali : ");
		for(int i=0 ; i<dizi.length ; i++)
		{
			System.out.print(dizi[i]+" ");
		}
	
	}//main sonu
}//s�n�f sonu
