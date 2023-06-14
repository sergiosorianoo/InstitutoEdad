package com.politecnicomalaga.proyectoinstituto;

public class AlumnoSecundaria extends Alumno {

    public AlumnoSecundaria(String nombre, String apellido, String dni, String email, String tfno) {
        super(nombre, apellido, dni, email, tfno);
    }

    @Override
    public boolean pasarCurso() {
        
        float suma = 0;
        float media = 0;
        float suspenso = 0;

        for (int i = 0; i < misNotas.size(); i++) {
            suma += misNotas.get(i).getValorNota();
            media = suma / misNotas.size();
            if (misNotas.get(i).getValorNota() < 5) {
                suspenso++;
                break;
            }
        }

        if (suspenso <= 2 && media >= 5) {
            return true;
        } else {
            return false;
        }
    }
}