import java.util.Random;
import java.util.Scanner;
public class Nivel_2_13 {
	
	public static void main(String[] args) {
		String abecedario[]={"", "a", "b", "c", "d", "e", "f", "g", "h", "i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		Random num=new Random();
		int letra=(num.nextInt(26)+1);
		
		Scanner s=new Scanner(System.in);
		System.out.println("Adivine la letra");
		String ingreso=s.next();
		int letraN=0;
		for(int i=1;i<abecedario.length;i++){
			if(abecedario[i].equals(ingreso)){
				letraN=i;
			}
		}
		while (letraN>letra){
			System.out.println("La letra est‡ antes");
			System.out.println("Adivine la letra");
			ingreso=s.next();
			for(int i=1;i<abecedario.length;i++){
				if(abecedario[i].equals(ingreso)){
					letraN=i;
				}
			}
			while (letraN<letra){
				System.out.println("La letra est‡ despuŽs");
				System.out.println("Adivine la letra");
				ingreso=s.next();
				for(int i=1;i<abecedario.length;i++){
					if(abecedario[i].equals(ingreso)){
						letraN=i;
					}
				}
			}
		}
		while (letraN<letra){
			System.out.println("La letra est‡ despuŽs");
			System.out.println("Adivine la letra");
			ingreso=s.next();
			for(int i=1;i<abecedario.length;i++){
				if(abecedario[i].equals(ingreso)){
					letraN=i;
				}
			}
			while (letraN>letra){
				System.out.println("La letra est‡ antes");
				System.out.println("Adivine la letra");
				ingreso=s.next();
				for(int i=1;i<abecedario.length;i++){
					if(abecedario[i].equals(ingreso)){
						letraN=i;
					}
				}
			}
		}
		if(letraN==letra){
			System.out.println("Ha acertado");
		}
		
	}

}
