package patike.dev;

import java.util.Scanner;

public class HW2_KDV_Hesaplama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�deme miktar�n� giriniz");
		int cash = input.nextInt();
		
		double kdvRate = cash > 1000 ? 0.18 : 0.08;
		
		double totalMoney = cash*kdvRate;
		
		System.out.println("KDV dahil tutar� " + (cash + totalMoney));

		System.out.println("KDV tutar� " + totalMoney);
		
		

	}

}
