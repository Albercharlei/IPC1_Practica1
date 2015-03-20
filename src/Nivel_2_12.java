import java.util.Scanner;
public class Nivel_2_12 {

	public static void main(String[] args) {
		String abecedario[]={"", "a", "b", "c", "d", "e", "f", "g", "h", "i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		String nivel1[]={"", "****", "*** ", "****", "*** ", "****", "****", "*****", "*  *", "***","****","*  *","*   ","*     *","*     *","****","****","*****","****","****","***","*  *","*   *","*     *","*   *","*   *","*****"};
		String nivel2[]={"", "*  *", "*  *", "*   ", "*  *", "*   ", "*   ", "*    ", "*  *", " * ","  * ","* * ","*   ","* * * *","* *   *","*  *","*  *","*   *","*  *","*   "," * ","*  *","*   *","*     *"," * * "," * * ","   * "};
		String nivel3[]={"", "****", "*** ", "*   ", "*  *", "****", "*** ", "*  **", "****", " * ","  * ","*   ","*   ","*  *  *","*   * *","*  *","****","*   *","*** ","****"," * ","*  *","*   *","*  *  *","  *  ","  *  ","  *  "};
		String nivel4[]={"", "*  *", "*  *", "*   ", "*  *", "*   ", "*   ", "*   *", "*  *", " * ","  * ","* * ","*   ","*     *","*    **","*  *","*   ","* * *","* * ","   *"," * ","*  *"," * * ","* * * *"," * * ","  *  "," *   "};
		String nivel5[]={"", "*  *", "*** ", "****", "*** ", "****", "*   ", "*****", "*  *", "***","*** ","*  *","****","*     *","*     *","****","*   ","*** *","*  *","****"," * ","****","  *  "," *   * ","*   *","  *  ","*****"};

		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese el texto");
		String text=s.next();
		
		System.out.println();
		for(int i=1;i<=text.length();i++){
			for(int j=1;j<abecedario.length;j++){
				
				if((abecedario[j]).equals(text.substring((i-1),i))){
					System.out.print(nivel1[j]);
					System.out.print(" ");
					
				}
				
			}
			
		}
		System.out.println();
		for(int i=1;i<=text.length();i++){
			for(int j=1;j<abecedario.length;j++){
				
				if((abecedario[j]).equals(text.substring((i-1),i))){
					System.out.print(nivel2[j]);
					System.out.print(" ");
					
				}
				
			}
			
		}
		System.out.println();
		for(int i=1;i<=text.length();i++){
			for(int j=1;j<abecedario.length;j++){
				
				if((abecedario[j]).equals(text.substring((i-1),i))){
					System.out.print(nivel3[j]);
					System.out.print(" ");
					
				}
				
			}
			
		}
		System.out.println();
		for(int i=1;i<=text.length();i++){
			for(int j=1;j<abecedario.length;j++){
				
				if((abecedario[j]).equals(text.substring((i-1),i))){
					System.out.print(nivel4[j]);
					System.out.print(" ");
					
				}
				
			}
			
		}
		System.out.println();
		for(int i=1;i<=text.length();i++){
			for(int j=1;j<abecedario.length;j++){
				
				if((abecedario[j]).equals(text.substring((i-1),i))){
					System.out.print(nivel5[j]);
					System.out.print(" ");
					
				}
				
			}
			
		}
		  
	}

}
