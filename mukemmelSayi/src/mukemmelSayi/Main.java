package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		
		int number = 6;
		int toplam = 0;
		int i = 1;
		
		while ( i <= number / 2 ) {
			if ( number % i == 0 ) {
				toplam+=i;
			}
			i++;
		}		
		if ( number==toplam ) {
			System.out.println(number + " sayısı mükemmel sayıdır");
		} else {
			System.out.println(number + " sayısı mükemmel sayı değildir");
		}
		
	}
}
