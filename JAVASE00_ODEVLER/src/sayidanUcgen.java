import java.util.Scanner;

public class sayidanUcgen {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int satir = 1;  boolean durum = true;
		
		System.out.println("Hangi sayýyla ucgen yapmak istersin : ");
		int sayi = scan.nextInt();
		
		while(durum)
		{
			if(satir <= sayi)
			{
				for(int i=0 ; i<satir ; i++)
				{
					System.out.print(i+1);
				}
				
				System.out.println();
				
				satir++;
			}
			
			else
				durum = false;
		}

	}//Main Sonu

}//Sinif Sonu
