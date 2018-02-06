import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		
		
		System.out.println("digite os números : ");
		int b  = sc.nextInt();
		int h = sc.nextInt();
		int AreaTotal, PerimetroTotal;
		
		AreaTotal = (b * h );
		PerimetroTotal = 2*(b+h); 
		
		System.out.println(" Area é : " + AreaTotal );
		System.out.println(" Perimetro é : " + PerimetroTotal );
		sc.close();
	}

}