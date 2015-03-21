import java.util.Scanner;
public class Nivel_2_10 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese el nœmero");
		int num=s.nextInt();
		for(int i=1;i<=num;i++){
			for(int j=1;j<i;j++){
				System.out.print(" ");
			}
			for(int k=0;k<(num-i+1);k++){
				System.out.print(i);
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
