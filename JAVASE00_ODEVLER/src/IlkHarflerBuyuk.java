import java.util.Scanner;

public class IlkHarflerBuyuk {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String cumle,cumle2;
		
		System.out.println("Bir tane cumle yaziniz : ");
		cumle = scan.nextLine();
		int boyut = cumle.length();
		cumle2 = cumle;
		
		cumle2 = cumle.substring(0,1).toUpperCase() + cumle.substring(1);
		
		for(int i=1 ; i<boyut ; i++)
		{
			if(cumle.substring(i, i+1) == " ")
				cumle2 = cumle.toUpperCase().substring(i+1, i+2);
		}
		
		System.out.println(cumle2);
		
		
		

	}

}
