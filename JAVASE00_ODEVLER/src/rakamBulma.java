import java.util.Scanner;

public class rakamBulma {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		int sayac = 0;
	
		System.out.println("Karisik bir ifade giriniz : ");
		String ifade = scan.nextLine();
		
		int uzunluk = ifade.length();
		
		for(int i=0 ; i<=9 ; i++)
		{
			String a = String.valueOf(i);
			for(int j=0 ; j<uzunluk ; j++)
			{
				if(ifade.substring(j,j+1) == a)
					sayac++;
			}
		}
		
		System.out.println("Girdiginiz ifade "+sayac+" tane rakam içeriyor.");
		
	}//main metod sonu
	
	
}//sinif sonu
