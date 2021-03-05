import java.util.Scanner;

public class tersten {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Bir ifade giriniz : ");
		String yazi = scan.nextLine();
		int uzunluk = yazi.length();
		
		for(int i=uzunluk-1 ; i>=0 ; i--)
		{
			System.out.print(yazi.charAt(i));
		}
		
		
		
		
		
	}//Main metod sonu

}//Sinif sonu
