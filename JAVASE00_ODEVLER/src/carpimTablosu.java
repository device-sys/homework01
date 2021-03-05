import java.util.Scanner;

public class carpimTablosu {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hangi rakamýn carpim tablosunu görmek istersiniz : ");
		int rakam = scan.nextInt();
		
		for(int i=1 ; i<=10 ; i++)
		{
			System.out.println(rakam+"*"+i+"="+(rakam*i));
		}
	}

}
