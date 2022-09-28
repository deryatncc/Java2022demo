
public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 0, 1, 2, 3, 4, 5, 6 };
		int bul = 2;
		boolean varMi = false;
		for (int sayi : sayilar) {
			if (sayi == bul) {
				varMi= true;
			}

		}
		if(varMi ) {
			System.out.println("Sayi sistemde var.");
		} else {
			System.out.println("Sayi sisytemde mevcut degildir.");
		}
	}

}
