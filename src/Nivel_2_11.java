import java.util.Scanner;
public class Nivel_2_11 {
	
	public static void main(String[] args) {
		String unidades[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		String decenas[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String unidadesN[]={"", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve","diez","once","doce","trece","catorce","quince","dieciseis","diecisiete","dieciocho","diecinueve","veinte"};
		String decenasN[]={"", "", "veinti", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
		
		String listadoRomanos[];
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese la cantidad de nœmeros romanos a ingresar");
		int n=s.nextInt();
		listadoRomanos=new String[n];
		for(int a=0;a<listadoRomanos.length;a++){
			System.out.println("Ingrese el nœmero romano");
			listadoRomanos[a]=s.next();
		}
		
		int listadoNumeros[];
		listadoNumeros=new int[n];
		for(int b=0;b<listadoNumeros.length;b++){
			for(int i=0;i<decenas.length;i++){
				for(int j=0;j<unidades.length;j++){
					if((decenas[i]+unidades[j]).equals(listadoRomanos[b])){
						listadoNumeros[b]=(i*10)+j;
					}
				}
			}
		}
		
		int dato1=listadoNumeros[0];
		for(int c=0;c<listadoNumeros.length;c++){
			if(listadoNumeros[c]<dato1){
				dato1=listadoNumeros[c];
			}
		}
		
		int uni=dato1%10;
		int dec=(dato1/10)%10;
		if(dato1>=30&&dato1<100){
			if(dato1%10==0){
				System.out.println("El nœmero menor es "+decenasN[dec]);
			}
			else{
			System.out.println("El nœmero menor es "+decenasN[dec]+" y "+unidadesN[uni]);
			}	
		}
		else{
			if(dato1>=21&&dato1<30){
				System.out.println("El nœmero menor es "+decenasN[dec]+unidadesN[uni]);
			}
			else{
				if(dato1<21){
					System.out.println("El nœmero menor es "+unidadesN[dato1]);
				}
			}
		}
		
		int dato2=listadoNumeros[0];
		for(int d=0;d<listadoNumeros.length;d++){
			if(listadoNumeros[d]>dato2){
				dato2=listadoNumeros[d];
			}
		}
		
		uni=dato2%10;
		dec=(dato2/10)%10;
		if(dato2>=30&&dato2<100){
			if(dato2%10==0){
				System.out.println("El nœmero mayor es "+decenasN[dec]);
			}
			else{
			System.out.println("El nœmero mayor es "+decenasN[dec]+" y "+unidadesN[uni]);
			}	
		}
		else{
			if(dato2>=21&&dato2<30){
				System.out.println("El nœmero mayor es "+decenasN[dec]+unidadesN[uni]);
			}
			else{
				if(dato2<21){
					System.out.println("El nœmero mayor es "+unidadesN[dato2]);
				}
			}
		}
	}

}
