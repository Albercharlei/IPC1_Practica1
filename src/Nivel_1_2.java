import java.util.Scanner;

public class Nivel_1_2 {
	public static void main(String[] args) {
		
		int nota=0;
		Scanner s=new Scanner(System.in);
		for(int i=1;i<7;i++){
			System.out.println("ingrese la nota "+i);
			nota=nota+s.nextInt();
		}
		nota=nota/6;
		System.out.println("El promedio es "+nota);
		
		if(100>=nota&&nota>=90){
			System.out.println("La puntuaci—n es A");
		}	
		else{
			if(90>nota&&nota>=80){
				System.out.println("La puntuaci—n es B");
			}
			else{
				if(80>nota&&nota>=70){
					System.out.println("La puntuaci—n es C");
				}
				else{
					if(70>nota&&nota>=60){
						System.out.println("La puntuaci—n es D");
					}
					else{
						if(60>nota&&nota>=0){
							System.out.println("La puntuaci—n es E");
						}
					}
				}
			}
		}
	}
}
