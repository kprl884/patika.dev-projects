package patike.dev;

import java.util.Scanner;

/*
Not Ortalamas� Hesaplayan Program
Java ile Matematik, Fizik, Kimya, T�rk�e, Tarih, M�zik derslerinin s�nav puanlar�n� kullan�c�dan alan ve ortalamalar�n� hesaplay�p
 ekrana bast�r�lan program� yaz�n.
�dev
Ayn� program i�erisinde ko�ullu ifadeler kullan�larak, e�er kullan�c�n�n ortalamas� 60'dan b�y�k ise ekrana "S�n�f� Ge�ti" ,
 k���k ise "S�n�fta Kald�" yazs�n.
 */

public class java101_hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);
		  
		  System.out.println("T�rk�e ders notunu giriniz");int turkishScore = input.nextInt();
		  System.out.println("Matematik ders notunu giriniz");int mathScore = input.nextInt();
		  System.out.println("Fizik ders notunu giriniz");int musicScore = input.nextInt(); 
		  System.out.println("Kimya ders notunu giriniz");int historyScore = input.nextInt(); 
		  System.out.println("Tarih ders notunu giriniz");int physicalScore = input.nextInt(); 
		  System.out.println("M�zik ders notunu giriniz");int chemicalScore = input.nextInt();
		  
		  int totalScore = turkishScore + mathScore + musicScore + historyScore + physicalScore + chemicalScore;
		  float avarageScore = totalScore / 6;
		  if(avarageScore > 60) {
			  System.out.println("S�n�f� Ge�ti");
		  }else {
			  System.out.println("S�n�fta Kald�");
		  }
		  
	}

}
