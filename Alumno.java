package com.politecnicomalaga.proyectoinstituto;
import java.util.ArrayList;

public abstract class Alumno extends Persona {

    protected ArrayList<Nota> misNotas;

    public Alumno(String nombre, String apellido, String dni, String email, String tfno) {
        super(nombre, apellido, dni, email, tfno);
        this.misNotas = new ArrayList<>();
    }

    public void agregarNota(String Asignatura, float ValorNota) {

        for (int i = 0; i < misNotas.size(); i++) {
            if (misNotas.iterator() == null) {
                if (!Asignatura.isEmpty() && ValorNota != 0.0f) {
                    Nota n = new Nota(Asignatura, ValorNota);
                    misNotas.add(i, n);
                }
            }
        }
    }

    @Override
    abstract public boolean pasarCurso();

}