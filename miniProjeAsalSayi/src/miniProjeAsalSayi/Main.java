package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 20;
		int remainder = number % 2;      // remainder (ing) = kalan (tr)
		boolean isPrime = true;                  // isPrime = Asal sayı
		
		if (number < 2) {
			System.out.println("Geçersiz sayı");
			return;
		}
		
		for (int i = 2; i<number; i++) {
			
			if (number % i == 0) {
				isPrime = false;
			}
			
		}
		// if'in içinde (isPrime == true) ifadesi (isPrime) ifadesiyle aynı anlama gelir.
		if (isPrime) {
			System.out.println("Sayı asaldır");
		}else {
			System.out.println("Sayı asal değildir");
		}
		
	}
}