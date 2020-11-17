import java.util.Scanner;

public class menuak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, num1,num2;
		System.out.println("Eliga una opcion");
		System.out.println("1.Primera opcion suma de dos numeros ");
		System.out.println("2.Segunda opcion resta de dos numeros");
		System.out.println("3.Tercera opcion multiplicar dos numeros");
		System.out.println("4.Cuarta opcion divison de dos numeros");
		System.out.println("5.Quinta opcion factorial de un numero");

		num=sc.nextInt();
		if (num==1){
			System.out.println("Introduzca un numero");
			num1=sc.nextInt();
			System.out.println("Introduzca otro numero");
			num2=sc.nextInt();
			suma(num,num1,num2);
	
		}
		if (num==2) {
			System.out.println("Introduzca un numero");
			num1=sc.nextInt();
			System.out.println("Introduzca otro numero");
			num2=sc.nextInt();
			resta(num,num1,num2);
			
		}
		if (num==3) {
			System.out.println("Introduzca un numero");
			num1=sc.nextInt();
			System.out.println("Introduzca otro numero");
			num2=sc.nextInt();
			multiplicacion(num,num1,num2);
			
	}
		if (num==4) {
			System.out.println("Introduzca un numero");
			num1=sc.nextInt();
			System.out.println("Introduzca otro numero");
			num2=sc.nextInt();
			division(num,num1,num2);
	}
		if (num==5) {
			System.out.println("Introduzca un numero");
			num1=sc.nextInt();
			factorial(num1);
			
		}
	}
	public static void suma(int num, int num1, int num2) {
	int suma=0;
	
	suma=num1+num2;
	
	System.out.println("La suma de los dos numeros es : " + suma);
	}
	public static void resta(int num, int num1, int num2) {
		int resta=0;
		
		resta=num1-num2;
		
		System.out.println("La resta de los dos numeros es : " + resta);
	
	
}	
	public static void multiplicacion(int num, int num1, int num2) {
		int multiplicacion=0;
		
		multiplicacion=num1*num2;
		
		System.out.println("La multiplicacion de los dos numeros es : " + multiplicacion);
}
	public static void division(int num, int num1, int num2) {
		int division=0;
		
		division=num1/num2;
		
		System.out.println("La division de los dos numeros es : " + division );
}
	public static void factorial(int num1) {
		int fakt=1;
		for (int i=num1; i>=1; i--) {
			
			fakt= fakt*i;
			
			
}
		System.out.println("La factorial del numero es : " + fakt );
	}
}
		
	




