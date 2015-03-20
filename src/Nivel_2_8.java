import java.util.Scanner;
import java.util.Random;
public class Nivel_2_8 {

	public static void main(String[] args) {
		String unidades[]={"", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve","diez","once","doce","trece","catorce","quince","dieciseis","diecisiete","dieciocho","diecinueve","veinte"};
		String decenas[]={"", "", "veinti", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
		Scanner s=new Scanner(System.in);
		System.out.println("Introduzca el l’mite inferior");
		int inf=s.nextInt();
		System.out.println("Introduzca el l’mite superior");
		int sup=s.nextInt();
		Random num=new Random();
		int n=(num.nextInt(sup-inf+1)+inf);
		int uni=n%10;
		int dec=(n/10)%10;
		if(n>=30&&n<100){
			if(n%10==0){
				System.out.println("El nœmero es "+decenas[dec]);
			}
			else{
			System.out.println("El nœmero es "+decenas[dec]+" y "+unidades[uni]);
			}	
		}
		else{
			if(n>=21&&n<30){
				System.out.println("El nœmero es "+decenas[dec]+unidades[uni]);
			}
			else{
				if(n<21){
					System.out.println("El nœmero es "+unidades[n]);
				}
			}
		}
	}

}
