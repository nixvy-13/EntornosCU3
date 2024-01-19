package entornos1;

import java.util.Scanner;

public class Entornos2 {

	static Scanner sc = new Scanner(System.in);
	static double pi = 3.1415;
	
	//Funcion calcular AREA TRIANGULO
	public static double calcularAreaTriangulo(double b, double h) {
		double area = (b/2)*h;
		return area;
	}
	//Funcion calcular PERIMETRO CIRCUNFERENCIA
	public static double calcularPerCircunf(double r) {
		double per = 2*pi*r;
		return per;
	}
	//Funcion calcular AREA CIRCUNFERENCIA
	public static double calcularAreaCircunferencia(double r) {
		double area =pi*(r*r);
		return area;
	}
	//Funcion calcular AREA CILINDRO
	public static double calcularAreaCilindro(double r, double h) {
		double area=(2*pi*r*h)+(2*pi*(r*r));
		return area;
	}
	//Funcion calcular AREA RECTANGULO
    public static double calcularAreaRectangulo(double l1, double l2) {
        double area=(l1*l2);
        return area;
    }
	//Funcion calcular VOLUMEN CUBO
	public static double calcularVolumenCubo(double l1) {
		double volumen=l1*l1*l1;
		return volumen;
	}
	public static void main(String[] args) {
		//Introducir valores triangulo
		System.out.println("Introduce base de un triangulo: ");
		double b = sc.nextDouble();
		System.out.println("Introduce altura de un triangulo: ");
		double h = sc.nextDouble();
		
		//Sacar area Triangulo
		double aTri=calcularAreaTriangulo(b,h);
		System.out.println("El area del triangulo es: "+aTri);
	}
}