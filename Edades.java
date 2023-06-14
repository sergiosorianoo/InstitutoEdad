package com.politecnicomalaga.proyectoinstituto;

import java.util.Scanner;

public class Edades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        String nombre;
        
        System.out.println("Buenos dias, ¿Cuál es su nombre?");
        nombre = sc.nextLine();
        System.out.println("¿Y cuál es su edad?");
        edad = sc.nextInt();
        
        if(edad <= 11){
            System.out.println(nombre + " tienes " + edad + ", vas a primaria.");
        } else if (edad >= 12 && edad <= 16){
            System.out.println(nombre + " tienes " + edad + ", vas a secundaria.");
        } else if (edad >= 17 && edad <= 20){
            System.out.println(nombre + " tienes " + edad + ", estás en bachiller.");
        } else if (edad > 20){
            System.out.println(nombre + " tienes " + edad + ", deberías estar trabajando.");
        }
    }
}
