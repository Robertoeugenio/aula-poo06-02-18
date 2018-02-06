import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		
		
		System.out.println("digite os números : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int total;
		
		
		total = (n1+n2+n3+n4)/4;
		if(total>6) {
			System.out.println("aprovado");
		}else
			System.out.println("reprovado");
				
		
		sc.close();
	}

}