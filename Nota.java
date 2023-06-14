package com.politecnicomalaga.proyectoinstituto;

public class Nota {

    private String Asignatura;
    private float ValorNota;

    public Nota(String Asignatura, float ValorNota) {
        this.Asignatura = Asignatura;
        if (ValorNota >= 0 && ValorNota <= 10) {
            this.ValorNota = ValorNota;
        } else {
            throw new IllegalArgumentException("Error, tienes que poner un numero entre el 0 y el 10");
        }
    }

    public String getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.Asignatura = asignatura;
    }

    public float getValorNota() {
        return ValorNota;
    }

    public void setValorNota(float valorNota) {
        this.ValorNota = valorNota;
    }
}
