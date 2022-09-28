package miniProjeAsalSayi;

public class proje {

	public static void main(String[] args) {
		int number = 17;
		boolean inPrime= true;
		
		if ( number ==1) {
			System.out.println("Sayi asal degildir!");
			return;
		}
		if(number<2) {
			System.out.println("Gecersiz sayi girdiniz!");
		}
		
		for( int i =2;i<number;i++) {
			if(number % i==0) {
				System.out.println("Sayi asal degil!");
				inPrime = false;
			}
		}
		if(inPrime) {
		System.out.println("Sayi asaldır!");
		}
		else {
			System.out.println("Sayı asal degildir!");
		}

	}

}
