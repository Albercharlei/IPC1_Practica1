import java.util.Scanner;
public class Nivel_2_11 {

	public static void main(String[] args) {
		String unidadesr[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		String decenasr[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese un nœmero romano menor a 100");
		String a=s.next();
		int n1=0;
		for(int i=0;i<decenasr.length;i++){
			for(int j=0;j<unidadesr.length;j++){
				if((decenasr[i]+unidadesr[j]).equals(a)){
					n1=(i*10)+j;
				}
			}
		}
		
		
		
		System.out.println("Ingrese otro nœmero romano menor a 100");
		String b=s.next();
		int n2=0;
		for(int i=0;i<decenasr.length;i++){
			for(int j=0;j<unidadesr.length;j++){
				if((decenasr[i]+unidadesr[j]).equals(b)){
					n2=(i*10)+j;
				}
			}
		}
		
		
		System.out.println("Ingrese otro nœmero romano menor a 100");
		String c=s.next();
		int n3=0;
		for(int i=0;i<decenasr.length;i++){
			for(int j=0;j<unidadesr.length;j++){
				if((decenasr[i]+unidadesr[j]).equals(c)){
					n3=(i*10)+j;
				}
			}
		}
		
		
		if(n1>n2&&n1>n3){
			if(n2>n3){
				System.out.println("El nœmero menor es: "+n3);
				System.out.println("El nœmero mayor es: "+n1);
			}
			else{
				System.out.println("El nœmero menor es: "+n2);
				System.out.println("El nœmero mayor es: "+n1);
			}
		}
		else{
			if(n2>n1&&n2>n3){
				if(n1>n3){
					System.out.println("El nœmero menor es: "+n3);
					System.out.println("El nœmero mayor es: "+n2);
				}
				else{
					System.out.println("El nœmero menor es: "+n1);
					System.out.println("El nœmero mayor es: "+n2);
				}
			}
			else{
				if(n3>n1&&n3>n2){
					if(n1>n2){
						System.out.println("El nœmero menor es: "+n2);
						System.out.println("El nœmero mayor es: "+n3);
					}
					else{
						System.out.println("El nœmero menor es: "+n1);
						System.out.println("El nœmero mayor es: "+n3);
					}
				}
			}
		}
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
	}

}
