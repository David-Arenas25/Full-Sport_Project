package Ejercicios;

import java.util.Scanner;

public class Persona {
    private String nombre;
    private int edad;
    private int dni;
    Scanner sc = new Scanner(System.in);

    public Persona(String nombre, int edad, int dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public Persona() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }


    public void Registrarse(){
        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();
        System.out.println("ingrese su edad");
        edad = sc.nextInt();
        sc.nextLine();
        System.out.println("ingrese su Dni");
        dni = sc.nextInt();
        sc.nextLine();
    }

    public void MostrarDatos(){
        System.out.println("su nombre es " + nombre);
        System.out.println("su edad es "+ edad);
        System.out.println("Su Dni es " + dni);
    }


    public void EsMayorDeEdad(){
        boolean esMayor = false;
        if (edad >= 18){
            esMayor = true;



        }else{
            esMayor = false;

        }System.out.println("Es mayor? " + esMayor);
    }

}
