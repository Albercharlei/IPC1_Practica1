import java.util.Scanner;
public class Nivel_2_15 {

	public static void main(String[] args) {
		int n=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese el l’mite n");
		n=s.nextInt();
		int cont=0;
		for(int i=2;i<n;i++){
			int div=0;
			for(int j=2;j<=i;j++){
				
				if(i%j==0){
					
					div++;
				}
				
			}
			if(div<=1){
				cont++;
			}
			
		}
		System.out.println("La cantidad de nœmero primos es "+cont);

	}

}
