package models;

import java.util.ArrayList;

public class User {

    private String nombre;
    private String apellido;
    private int edad;

    private Address direccion;

    private ArrayList<Telefono> telefono;


    public User() {
    }

    public User(String nombre, String apellido, int edad, Address direccion, ArrayList<Telefono> telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
    }

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Address getDireccion() {
        return direccion;
    }

    public void setDireccion(Address direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Telefono> getTelefonos() {
        return telefono;
    }

    public void setTelefonos(ArrayList<Telefono> telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "User{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", direccion=" + direccion +
                ", telefono=" + telefono +
                '}';
    }
}
