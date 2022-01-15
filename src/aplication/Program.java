package aplication;

import java.util.Scanner;

import entities.Square;
import entities.circle;

public class Program {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
//	calculadora de area interna
	System.out.println("Bem vindo(a) a calculadora de área!");
	System.out.println("Você deseja calcular a area de um quadrado ou de um circulo?");
	System.out.println("Digite 1 para quadrado e 2 para circulo");
	int opcao = sc.nextInt();
	
	switch (opcao) {
		case 1:
			System.out.println("Calculadora da area de um quadrado");
			
			Square x ;
			
			x = new Square();
			System.out.println("Digite a altura do quadrado");
			x.a = sc.nextDouble();
			System.out.println("Digite a largura do quadrado");

			x.b = sc.nextDouble();
			
			
			double area = x.area();
			
			
			System.out.printf("a area do quadrado é %f",area);
			break;
		
		case 2:
			System.out.println("Calculadora da area de um circulo");
			circle y;
			
			y = new circle ();
			System.out.println("Digite o raio do circulo");

			y.circ = sc.nextDouble();
			
			double areaCircle = y.areaCircle();
			System.out.printf(" a area do circulo é: " + areaCircle );
			break;
			
			
		default:
			System.out.println("Numero invalido");
			break;
	}
	


//	System.out.println("Calculadora de area de quadrados");
//	
//	Square x ;
//	
//	x = new Square();
//	x.a = sc.nextDouble();
//	x.b = sc.nextDouble();
//	
//	
//	double area = x.area();
//	
//	
//	System.out.println(area);
	
	}
}
