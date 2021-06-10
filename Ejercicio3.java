import java.util.*;
public class Ejercicio3{
	public static void main(String[] args) {
		//declaramoso variables e inicializamos scanner
		Scanner scanner = new Scanner(System.in);
		double n, factorial, x;
		//solicitamos los datos
		System.out.println("Ingrese el numero del cual desea saber el factorial: ");
		n = scanner.nextDouble();
		//creamos un cliclo para calcular el factorial
		if (n<0) {
			System.out.println("El numero no se puede calcular");			
		} else{
			x = 1;
			factorial = 1;
			while(x<=n){
				factorial = factorial*x;
				x=x+1;
			}
		System.out.println("El factorial del numero "+n+" = "+factorial);
		}
	}

}