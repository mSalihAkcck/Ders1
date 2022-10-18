package arraysDemo;

public class Main {

	public static void main(String[] args) {
		
		String[] ogrenciler = new String[4];
		ogrenciler[0]="Ahmet";
		ogrenciler[1]="Salih";
		ogrenciler[2]="Semih";
		ogrenciler[3]="Mehmet";
		
		for (int i=0 ; i<ogrenciler.length ; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		for (String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		
	}
	
}
