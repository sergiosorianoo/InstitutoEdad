package com.politecnicomalaga.proyectoinstituto;

public abstract class Persona {

    protected String nombre, apellido, dni, email, tfno;

    public Persona(String nombre, String apellido, String dni, String email, String tfno) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.tfno = tfno;
    }

    @Override
    public String toString() {
        return String.format("%10s,%10s,%10s,%10s,%10s,\n", nombre, apellido, dni, email, tfno);
    }

    public abstract boolean pasarCurso();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTfno() {
        return tfno;
    }

    public void setTfno(String tfno) {
        this.tfno = tfno;
    }
}