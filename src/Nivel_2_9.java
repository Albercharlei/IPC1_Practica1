import java.util.Scanner;
public class Nivel_2_9 {

	public static void main(String[] args) {
		String unidades[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		String decenas[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String centenas[]={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		String miles[]={"", "M", "MM", "MMM"};
		Scanner s=new Scanner(System.in);
		int num=0;
		System.out.println("Ingrese el nœmero");
		num=s.nextInt();
		int uni=num%10;
		int dec=(num/10)%10;
		int cen=(num/100)%10;
		int mil=num/1000;
		if(num>=1000&&num<4000){
			System.out.println("El nœmero es: "+miles[mil]+centenas[cen]+decenas[dec]+unidades[uni]);
		}
		else{
			if(num>=100&&num<999){
				System.out.println("El nœmero es: "+centenas[cen]+decenas[dec]+unidades[uni]);
			}
			else{
				if(num>=10&&num<99){
					System.out.println("El nœmero es: "+decenas[dec]+unidades[uni]);
				}
				else{
					if(num<10){
						System.out.println("El nœmero es: "+unidades[num]);
					}
				}
			}
		}	
	}
}

