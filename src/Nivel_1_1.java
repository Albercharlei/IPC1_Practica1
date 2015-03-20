
public class Nivel_1_1 {

	public static void main(String[] args) {
		
		for(int i=1;i<6;i++) {
			for(int j=0;j<(5-i);j++){
				
				System.out.print(" ");	
			}
			for(int k=0;k<i;k++){
				
				System.out.print("*");
			}
			for(int l=0;l<(i-1);l++){
				
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<5;i++){
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}
			for(int k=0;k<(5-i);k++){
				System.out.print("*");
			}
			for(int l=0;l<(4-i);l++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
