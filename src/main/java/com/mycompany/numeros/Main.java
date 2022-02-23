/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.numeros;
import javax.swing.*;
/**
 *
 * @author FINSOTIENDA
 */
public class Main {
    
public static void main(String[] args) {



  insertar_imprimir();


  
    }
public static void insertar_imprimir(){
  int numero = 0;
    numero= Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero"));
    if (parOimpar(numero)) {
        System.out.println("Es par");
        if (numero==2) {
            System.out.println("Es primo");
        }
    }else{
        System.out.println("Es primo");
        System.out.println("Es impar");
}
}


public static Boolean parOimpar(int numero){

    if (numero%2 == 0) {
        return true;
    }else{
        return  false;
}
}


    
}
