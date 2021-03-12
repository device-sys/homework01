package com.vektorel.odev_02;
import java.util.Random;
import java.util.Scanner;

public class soru_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
		
		int[] tahminler = new int[5];
		int sayi = rnd.nextInt(99);		int tahmin;
		
		System.out.println("*******************Sayi tahmin oyununa hosgeldiniz*******************");
		System.out.println();
		System.out.println("!!!! 5 tane hakkiniz var (0 - 99) !!!!");
		System.out.println();
		
		for(int i=1 ; i<=5 ; i++)
		{
			System.out.println(i+". tahmininizi giriniz : ");
			tahmin = scan.nextInt();
			
			if(tahmin > sayi)
				System.out.println("Daha kücük");
			else if(tahmin < sayi)
				System.out.println("Daha buyuk");
			else if(tahmin == sayi)
				System.out.println(":):):):):):):):)****TEBRIKLER KAZANDINIZ****:):):):):):):):)");
		
			if((i == 5) && (tahmin != sayi))
			{
				if(tahmin > sayi)
					System.out.println((tahmin - sayi)+":(:(:(:(:( kadar daha azdý :(:(:(:(:(");
				else if(tahmin > sayi)
					System.out.println((sayi - tahmin)+":(:(:(:(:( kadar daha fazlaydý :(:(:(:(:(");
			}
		}
	
	}//main sonu
}//sinif sonu
