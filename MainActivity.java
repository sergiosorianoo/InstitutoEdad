package com.politecnicomalaga.proyectoinstituto;

import java.util.ArrayList;
import java.util.List;
// crear una clase persona con los siguientes atributos:
    // nombre, apellido, dni, email, tfno, getters, setters, toString
// metodo abstract: pasarCurso, boolean
// -------------------------
// despues, programar alumno,heredan alumnoPrimaria, alumnoSecundaria, alumnoBachillerato
    // alumno es una persona, tiene una lista de notas, claseNota es un string asignatura y un float valorNota (0-10), si se pasa, se pone a 0
        // pasarCurso es abstract en alumno, es clase abstract, y se implementa en alumnoprimaria , secundaria y  bachillerato
    // alumn primaria pasa de curso si la media de las notas es mayor de 3.5
    // alum secund pasa si la media de las notas es un 5 y solo tiene 2 suspensos
    // alum bach pasa de curso si la nota es 5 y no hay ninguna suspensa
// crear asignatura y añadir nota
// que te diga si el alumno pasa o no

public class MainActivity {

    public static void main(String[] args) {
        /*String[] misNotas = {"Lengua","Mates","Historia","FyQ","Biologia","Arte"};
        for (int i = 0; i < misNotas.length; i++) {
            System.out.println(misNotas[i]);
        }
        for (String notas: misNotas)
            System.out.println(notas);*/
        // se declara e inicializa el ArrayList
        List<Nota> nota = new ArrayList<>(); //List <Nota> nota = new ArrayList<Nota>();
        
        // se añaden objetos de la clase Nota 
        nota.add(new Nota("Lengua", 7.5f));
        nota.add(new Nota("Mates", 9.0f));
        nota.add(new Nota("Historia", 3.5f));
        nota.add(new Nota("Ingles", 8.0f));
        nota.add(new Nota("Filosofia", 5.0f));

        // muestra el contenido del ArrayList
        double sumaTotal = 0;
        double media = 0;
        int Nºnotas = 0;
        
            System.out.println("Notas: ");
        for (Nota n : nota) {
            System.out.print(n.getAsignatura());
            System.out.println(" = " + n.getValorNota());
            sumaTotal += n.getValorNota();
            Nºnotas = nota.size();
            media = sumaTotal/Nºnotas;
        }
            System.out.println("================");
            System.out.println("SumaTotal: " + sumaTotal);
            System.out.println("Nºnotas: " + Nºnotas);
            System.out.println("================");
            System.out.println("La media de las notas es: " + media);
            
            
            }
            
        }
    

