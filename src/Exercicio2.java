import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		
		
		System.out.println("digite um n�mero inteiro: ");
		int x = sc.nextInt();
		
		System.out.println("parab�ns voce digitou: " + x );
		
		sc.close();
	}

}