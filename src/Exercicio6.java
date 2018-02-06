import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));

		int y = 1;
		

		while (y <= 100) {
			if (y  != 0) {

				System.out.println(y);
			}
			y++;
		}
	}
}