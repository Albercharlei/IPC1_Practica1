import java.util.Scanner;

public class Nivel_1_3 {

	public static void main(String[] args) {
		String numero[]={"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese la hora en formato hh:mm de 24 horas");
		String hh = s.next();
		int hora=0;
		if(hh.length()==5){
			for(int i=0;i<numero.length;i++){
				for(int j=0;j<numero.length;j++){
					if((numero[i]+numero[j]).equals(hh.substring(0, 2))){
						hora=(i*10)+j;
						if(hora<12){
							System.out.println("La hora es "+hh+" AM");
						}
						if(hora>=12){
							System.out.println("La hora es "+numero[i-1]+numero[j-2]+hh.substring(2,5)+" PM");
						}
					}
				}
			}
		}
		else{
			System.out.println("El formato no es correcto");
		}
		
		
		
	}

}
