/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebafiguras;

/**
 *
 * @author omarz
 */
public class PruebaFiguras {

    public static void main(String[] args) {
        
        //Calculos
        
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1, 2);
        Cuadrado figura3 = new Cuadrado(2);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3, 5);
        
        //Reporte de los resultados
        
        System.out.println("El area del circulo es: " + figura1.calcularArea());
        System.out.println("El perimetro del circulo es: " + figura1.calcularPerimetro() + "/n");
        
        System.out.println("El area del rectangulo es: " + figura2.calcularArea());
        System.out.println("El perimetro del rectangulo es: " + figura2.calcularPerimetro() + "/n");
        
        System.out.println("El area del cuadrado es: " + figura3.calcularArea());
        System.out.println("El perimetro del cuadrado es: " + figura3.calcularPerimetro() + "/n");
        
        System.out.println("El área del triángulo es: " + figura4.calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura4.calcularPerimetro());
        figura4.determinarTipoTriangulo();
        
        
    }
}
    