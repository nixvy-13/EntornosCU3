package entornos1;

import java.util.Scanner;

public class Entornos1 {

	static Scanner sc = new Scanner(System.in);
	//Funcion calcular area TRIANGULO
	
	public static double calcularAreaTriangulo(double b, double h) {
		double area = (b/2)*h;
		return area;
	}
	public static void main(String[] args) {
		//Introducir valores triangulo
		System.out.println("Introduce base de un triangulo");
		double b = sc.nextDouble();
		System.out.println("Introduce altura de un triangulo");
		double h = sc.nextDouble();
		
		//Sacar area Triangulo
		double aTri=calcularAreaTriangulo(b,h);
		System.out.println("El area del triangulo es: "+aTri);
	}
}