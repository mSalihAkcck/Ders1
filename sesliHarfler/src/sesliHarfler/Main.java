package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf='E';
		
		switch(harf) {
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Kalın sesli harf girdiniz.");
				break;
			case 'E': System.out.println("İnce sesli harf girdiniz.");
				break;
			default: System.out.println("Geçersiz harf girdiniz.");
		}
	}
}
