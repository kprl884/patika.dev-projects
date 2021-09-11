package patike.dev;

import java.util.Scanner;

/*
Not Ortalamasý Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sýnav puanlarýný kullanýcýdan alan ve ortalamalarýný hesaplayýp
 ekrana bastýrýlan programý yazýn.
Ödev
Ayný program içerisinde koþullu ifadeler kullanýlarak, eðer kullanýcýnýn ortalamasý 60'dan büyük ise ekrana "Sýnýfý Geçti" ,
 küçük ise "Sýnýfta Kaldý" yazsýn.
 */

public class java101_hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);
		  
		  System.out.println("Türkçe ders notunu giriniz");int turkishScore = input.nextInt();
		  System.out.println("Matematik ders notunu giriniz");int mathScore = input.nextInt();
		  System.out.println("Fizik ders notunu giriniz");int musicScore = input.nextInt(); 
		  System.out.println("Kimya ders notunu giriniz");int historyScore = input.nextInt(); 
		  System.out.println("Tarih ders notunu giriniz");int physicalScore = input.nextInt(); 
		  System.out.println("Müzik ders notunu giriniz");int chemicalScore = input.nextInt();
		  
		  int totalScore = turkishScore + mathScore + musicScore + historyScore + physicalScore + chemicalScore;
		  float avarageScore = totalScore / 6;
		  if(avarageScore > 60) {
			  System.out.println("Sýnýfý Geçti");
		  }else {
			  System.out.println("Sýnýfta Kaldý");
		  }
		  
	}

}
