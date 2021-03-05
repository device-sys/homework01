import java.util.Scanner;

public class asalSayiBulma {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Girilen aralýklardaki asal sayi bulma programina hosgeldiniz :):):):):)");
		System.out.println();
		System.out.println("***********************************************************************");
		System.out.println();
		
		int sayi1 , sayi2 , sayac=0;
		boolean durum1=true , durum2=true;
		
		do
		{
			System.out.print("Ilk sayiyi girin(0'dan buyuk olsun) : ");
			sayi1 = scan.nextInt();
			System.out.println();
			
			if(sayi1>0)
				durum1 = false;
			
		}while(durum1);
		
		
		do
		{
			System.out.println("Ikinci sayiyi girin(0'dan buyuk olsun) : ");
			sayi2 = scan.nextInt();
			System.out.println();
			
			if(sayi2>0)
				durum2 = false;
		
		}while(durum2);
		
		
		while(sayi1 < sayi2)
		{
			for(int i=1 ; i<=sayi1 ; i++)
			{
				if(sayi1%i == 0)
					sayac++;
			}
			if(sayac == 2)
				System.out.println("Giridiginiz araliktaki asal sayi : "+sayi1);
			
			sayac = 0;
			sayi1++;
		}
		
		while(sayi2 < sayi1)
		{
			for(int i=1 ; i<=sayi2 ; i++)
			{
				if(sayi2%i == 0)
					sayac++;
			}
			if(sayac == 2)
				System.out.println("Giridiginiz araliktaki asal sayi : "+sayi2);
			
			sayac = 0;
			sayi2++;
		}
	
	}
}
