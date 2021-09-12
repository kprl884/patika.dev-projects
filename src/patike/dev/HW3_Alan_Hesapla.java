package patike.dev;

import java.util.Scanner;

public class HW3_Alan_Hesapla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Dik üçgenin ilk kenar uzunluğunu giriniz");
		double firstEdgeA = input.nextInt();
		System.out.println("Dik üçgenin ikinci kenar uzunluğunu giriniz");
		double firstEdgeB = input.nextInt();
		
		double hypotenuse = Math.sqrt((firstEdgeA*firstEdgeA +firstEdgeB*firstEdgeB ));
		System.out.println("Girilen üçgenin hipotenüsü : " + hypotenuse);
		
		System.out.println("İlk kenar uzunluğunu giriniz");
		double firstEdge = input.nextInt();
		System.out.println("İkinci kenar uzunluğunu giriniz");
		double secondEdge = input.nextInt();
		System.out.println("Üçüncü  kenar uzunluğunu giriniz");
		double thirdEdge = input.nextInt();
		
		double perimeter = firstEdge + secondEdge + thirdEdge;
		
		double u = perimeter / 2;
		
		//area * area = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
		double area = Math.sqrt((u*(u-firstEdge)*(u-secondEdge)*(u-thirdEdge)));
		
		System.out.println("Üçgenin alanı = " + area); 
	}

}
