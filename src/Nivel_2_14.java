import java.util.Scanner;
public class Nivel_2_14 {

	public static void main(String[] args) {
		int n=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese el nœmero");
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print("* ");
		}
		for(int i=1;i<(n-1);i++){
			System.out.println();
			System.out.print("* ");
			for(int j=1;j<(n-1);j++){
				System.out.print("  ");
			}
			System.out.print("* ");
		}
		System.out.println();
		for(int i=1;i<=n;i++) {
			System.out.print("* ");
		}
	}

}
