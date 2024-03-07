package Funcionalidades;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Usuario {
    Scanner sc = new Scanner(System.in);
    int tipoUsuario;
    String nombre;
    String apellido;
    String id;
    String correo;
    String celular;
    String direccion;
    String clave;
    String repetirClave;
    String userIng;
    String claveIng;
    String [] registro = new String [10];

    public void registroUsuarios(){
        System.out.println("Bienvenido a Full Sport");
        System.out.println("que tipo de usuario eres 1.Cliente 2.Administrador 3.Domiciliario");
        tipoUsuario = sc.nextInt();
        sc.nextLine();
        System.out.println("ingrese su nombre ");
        nombre = sc.nextLine();
        System.out.println("ingrese su apellido");
        apellido = sc.nextLine();
        System.out.println("ingrese su identificacion");
        id = sc.nextLine();
        System.out.println("Ingrese su correo");
        correo = sc.nextLine();
        System.out.println("ingrese su celular");
        celular = sc.nextLine();
        System.out.println("Ingrese su direccion");
        direccion = sc.nextLine();
        System.out.println("ingrese su clave");
        clave = sc.nextLine();
        System.out.println("ingrese nuevamente su clave para confirmar");
        repetirClave = sc.nextLine();

        if (clave.equals(repetirClave)) {
            registro[0] = nombre;
            registro[1] = apellido;
            registro[2] = id;
            registro[3] = correo;
            registro[4] = celular;
            registro[5] = direccion;
            registro[6] = clave;
        }}

    public void imprimirRegistro(){
        for (String i: registro){
                System.out.println(i);
            }




}}
