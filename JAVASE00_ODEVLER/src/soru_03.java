import java.util.Arrays;
import java.util.List;

public class soru_03 {

	public static void main(String[] args) {
		
		int[] sayilar = {1,2,5,9,8,11,5,2,4,5,7,12};
		int uzunluk = sayilar.length;	 int sayac=0;
		
		for(int i=0 ; i<uzunluk ; i++)
		{
			for(int j=(i+1) ; j<=uzunluk ; j++)
			{
				if(sayilar[i] == sayilar[j])
					sayac++;
			}
			
			System.out.println(i+" sayisindan "+sayac+" tane var");
		}
		
		
	}

}
