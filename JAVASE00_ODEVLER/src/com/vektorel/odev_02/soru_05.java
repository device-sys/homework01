package com.vektorel.odev_02;
import java.util.Scanner;

public class soru_05 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int sayac = 1;
		
		System.out.println("Ucgenin bir kenarini giriniz : ");
		int kenar = scan.nextInt();
		
		for(int i=1 ; i<=kenar ; i++)
		{
			for(int j=1 ; j<=(kenar - i) ; j++)
			{
				System.out.print(" ");
			}
			for(int k=0 ; k<(kenar*2) ; k++)
			{
				System.out.print(sayac);
			}
			System.out.println();
			sayac++;
		}
	}//main metot sonu
}//sinif sonu


