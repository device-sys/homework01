import java.util.Scanner;

public class doluKare {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Karenin bir kenar uzunlugunu giriniz : ");
		int kenar = scan.nextInt();
		
		int kareAlani = (kenar*kenar) , satir = 1;
		
		for(int i=1 ; i<=kareAlani ; i++)
		{
			if(i > (satir*kenar))
			{
				System.out.println();
				satir++;
			}
				
			System.out.print("*");
		}

	}//main metod sonu

}//sinif sonu 
