/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebafiguras;

/**
 *
 * @author omarz
 */
public class Cuadrado {
    int lado;
    
    //constructor
    
    public Cuadrado(int lado){
        this.lado = lado;
    }
    
    // Metodos para calcular area y perimetro
    
    double calcularArea(){
        return lado * lado;
    }
    
    double calcularPerimetro(){
        return lado * 4;
    }
    
}
