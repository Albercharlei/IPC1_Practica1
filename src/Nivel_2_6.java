import java.util.Scanner;
public class Nivel_2_6 {

	public static void main(String[] args) {
		int num1=0;
		int num2=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Introduzca el primer nœmero");
		num1=s.nextInt();
		System.out.println("Introduzca el segunto nœmero");
		num2=s.nextInt();
		System.out.println("Introduzca el operador");
		System.out.println("s para suma");
		System.out.println("r para resta");
		System.out.println("m para multiplicaci—n");
		System.out.println("d para divisi—n");
		String operador=s.next();
		if(operador.equals("s")){
			System.out.println("La suma es "+(num1+num2));
		}
		if(operador.equals("r")){
			System.out.println("La resta es "+(num1-num2));
		}
		if(operador.equals("m")){
			System.out.println("El producto es "+(num1*num2));
		}
		if(operador.equals("d")){
			System.out.println("La divis—n es "+(num1/num2));
		}
		else{
			System.out.println("El operador no es v‡lido");
		}
	}

}
