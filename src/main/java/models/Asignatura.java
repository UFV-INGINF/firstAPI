package models;

public class Asignatura {

    private String nombre;
    private String cuatrimestre;

    public Asignatura() {
    }

    public Asignatura(String nombre, String cuatrimestre) {
        this.nombre = nombre;
        this.cuatrimestre = cuatrimestre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(String cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre + '\'' +
                ", cuatrimestre='" + cuatrimestre + '\'' +
                '}';
    }
}
