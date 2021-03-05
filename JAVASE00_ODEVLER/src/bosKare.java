import java.util.Scanner;

public class bosKare {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Karenin kenar uzunlugunu giriniz : ");
		int knr = scan.nextInt();
		
		int alan = (knr*knr) , yildizAdedi = 0;
		
		for(int i=1 ; i<=knr ; i++) //Karenin üst kýsmý
		{
			System.out.print("* ");
			yildizAdedi++;
		}
		
		System.out.println();
		
		for(int j=0 ; j<alan-(knr*2) ; j++) //Karenin orta kýsmý
		{
			if(yildizAdedi == (knr+j))
			{
				System.out.print("*");
				yildizAdedi++;
			}
			
			else if(yildizAdedi == (knr*j))
			{
				System.out.println("*");
				yildizAdedi++;
			}
			
			else
			{
				for(int k=1 ; k<=knr-2 ; k++)
				{
					System.out.println(" ");
				}
				yildizAdedi += (knr-2);
			}
		}
		
		System.out.println();
		
		for(int z=1 ; z<=knr ; z++) //Karenin alt kýsmý
		{
			System.out.print("* ");
		}
		
	} //main metod sonu

}//sinif sonu
