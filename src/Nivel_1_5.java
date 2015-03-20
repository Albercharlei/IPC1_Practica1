import java.util.Scanner;

public class Nivel_1_5 {

	public static void main(String[] args) {
		String numero[]={"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese la primer fecha en formato dd/mm/aaaa");
		String f1 = s.next();
		System.out.println("Ingrese la segunda fecha en formato dd/mm/aaaa");
		String f2 = s.next();
		
		int fecha1=0;
		int fecha2=0;
		
		for(int d1=0;d1<numero.length;d1++){
			for(int d2=0;d2<numero.length;d2++){
				
					if((numero[d1]+numero[d2]).equals(f1.substring(0,2))){
					fecha1=(d1*10)+d2;
					}
					if((numero[d1]+numero[d2]).equals(f2.substring(0, 2))){
					fecha2=(d1*10)+d2;
					}
				
			}
		}
		
		for(int m1=0;m1<numero.length;m1++){
			for(int m2=0;m2<numero.length;m2++){
				
					if((numero[m1]+numero[m2]).equals(f1.substring(3,5))){
					fecha1=fecha1+((m1*10)+m2-1)*30;
					}
					if((numero[m1]+numero[m2]).equals(f2.substring(3, 5))){
					fecha2=fecha2+((m1*10)+m2-1)*30;
					}
				
			}
		}
		
		for(int a1=0;a1<numero.length;a1++){
			for(int a2=0;a2<numero.length;a2++){
				for(int a3=0;a3<numero.length;a3++){
					for(int a4=0;a4<numero.length;a4++){
						if((numero[a1]+numero[a2]+numero[a3]+numero[a4]).equals(f1.substring(6,10))){
							fecha1=fecha1+((a1*1000)+(a2*100)+(a3*10)+a4-1)*360;
						}
						if((numero[a1]+numero[a2]+numero[a3]+numero[a4]).equals(f2.substring(6,10))){
							fecha2=fecha2+((a1*1000)+(a2*100)+(a3*10)+a4-1)*360;
						}
					}
				}
			}
		}
		
		if(fecha1<fecha2){
			System.out.println("La diferencia es de "+(fecha2-fecha1)+" d’as");
		}
		if(fecha2<fecha1){
			System.out.println("La diferencia es de "+(fecha1-fecha2)+" d’as");
		}
	}

}
