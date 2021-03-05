import java.util.Scanner;

public class esitmiDegilmi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Birinci sayiyi giriniz : ");
		int sayi1 = scan.nextInt();
		System.out.println("Ikinci sayiyi giriniz :");
		int sayi2 = scan.nextInt();
		
		System.out.print(sayi1 == sayi2);
		
	}

}
