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
		num=sc.nextInt();
		if (num==1){
			System.out.println("Introduzca un numero");
			num1=sc.nextInt();
			System.out.println("Introduzca otro numero");
			num2=sc.nextInt();
	System.out.println("La suma de los dos numeros es :" + num1 + " + " + num2 + " = " + (num1+num2));
		}
		if (num==2) {
			System.out.println("Introduzca un numero");
			num1=sc.nextInt();
			System.out.println("Introduzca otro numero");
			num2=sc.nextInt();
			System.out.println("La resta de los dos numeros es :" + num1 + " - " + num2 + " = " + (num1-num2));
			
		}
		if (num==3) {
			System.out.println("Introduzca un numero");
			num1=sc.nextInt();
			System.out.println("Introduzca otro numero");
			num2=sc.nextInt();
			System.out.println("La multiplicacion de los dos numeros es :" + num1 + " x " + num2 + " = " + (num1*num2));
	}
		if (num==4) {
			System.out.println("Introduzca un numero");
			num1=sc.nextInt();
			System.out.println("Introduzca otro numero");
			num2=sc.nextInt();
			System.out.println("La division de los dos numeros es :" + num1 + " / " + num2 + " = " + (num1/num2));
	}
	}
}	
		
		
	




