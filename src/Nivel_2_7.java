import java.util.Scanner;
public class Nivel_2_7 {

	public static void main(String[] args) {
		int num=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Introduzca el nœmero");
		num=s.nextInt();
		if(num>0&&num<=10){
			System.out.println("La tabla de multiplicar es:");
			for(int i=0;i<10;i++){
			System.out.println(num+"*"+(10-i)+"="+num*(10-i));
			}
		}
		else{
			System.out.println("El nœmero debe estar entre 0 y 10");
		}

	}

}
