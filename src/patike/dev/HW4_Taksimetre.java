package patike.dev;

import java.util.Scanner;

public class HW4_Taksimetre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price = 10;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Gidilen mesafeyi giriniz");
		double km = input.nextDouble();
		
		double total = price + km*2.2;
		
		if(total < 20) {
			total = 20;
			System.out.println("Ödenecek tutar 20 tl.");
		}else {
			System.out.println("Ödenecek tutar " + total + "tl.");
		}
	}

}
