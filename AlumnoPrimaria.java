package com.politecnicomalaga.proyectoinstituto;

public class AlumnoPrimaria extends Alumno {

    public AlumnoPrimaria(String nombre, String apellido, String dni, String email, String tfno) {
        super(nombre, apellido, dni, email, tfno);

    }

    @Override
    public boolean pasarCurso() {

        float suma = 0;
        float media = 0;
        
        for (int i = 0; i < misNotas.size(); i++) {
            suma += misNotas.get(i).getValorNota();
        }
        
        media = suma / misNotas.size();
        
        if (media > 3.5) {
            return true;
        } else {
            return false;
        }
    }
}
