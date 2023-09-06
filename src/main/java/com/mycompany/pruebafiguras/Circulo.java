/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebafiguras;

/**
 *
 * @author omarz
 */
public class Circulo {
    
    int radio;
    
    //Creacion del constructor del clase
    
    Circulo(int radio){
        this.radio = radio;
    }
    
    // Creacion de los metodos -  calcular area y perimetro
    
    double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }
    
    double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }
}
