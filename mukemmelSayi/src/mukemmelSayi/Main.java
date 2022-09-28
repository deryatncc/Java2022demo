package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		int sayi = 28;
		int sayac = 0;
		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				sayac = sayac + i;
			}
		}
		if (sayac == sayi) {
			System.out.println("Sayi mukemmel sayidir!");
		} else {
			System.out.println("Sayi mukemmel sayi degildir!");
		}

	}

}
