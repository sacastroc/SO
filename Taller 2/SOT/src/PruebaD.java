import java.util.*;

public class PruebaD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Programa que suma y multiplica los numeros de 1 a n");
		System.out.println("Ingresar numero n: ");
		int n = sc.nextInt();
		System.out.println(suma(n));
		System.out.println(multiplicacion(n));
	}
	public static int suma(int n){
		int m = (n*(n+1))/2;
		return m;
	}
	public static int multiplicacion(int n){
		int m = 1;
		for (int j = n; j > 1; j--) {
			m *= j;
		}
		return m;
	}
}
