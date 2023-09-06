/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebafiguras;

/**
 *
 * @author omarz
 */
public class TrianguloRectangulo {
    int base;
    int altura;
    
    //Constructor
    
    public TrianguloRectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    // Metodos para area
    
    double calcularArea(){
        return base * (altura / 2);
    }
    
    // Metodo para perimetro
    
    double calcularPerimetro(){
        return base + altura + calcularHipotenusa();
    }
    
    // Metodo para calcular la hipotenusa
    
    double calcularHipotenusa(){
        return Math.pow((base * base) + (altura * altura), 0.5);
    }
    /**
        * Método que determina si un triángulo es:
        * - Equilatero: si sus tres lados son iguales
        * - Escaleno: si sus tres lados son todos diferentes
        * - Escaleno: si dos de sus lados son iguales y el otro es diferente de
        * los demás
        */
    void determinarTipoTriangulo() {
        
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())){
            System.out.println("Es un triángulo equilátero"); /* Todos sus lados son iguales */
        
        } else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa())){
            System.out.println("Es un triángulo escaleno"); /* Todos sus lados son diferentes */
        } else{
            System.out.println("Es un triángulo isósceles"); /* De otra manera, es isósceles */
        }

    }
}
