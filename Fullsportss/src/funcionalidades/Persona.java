package funcionalidades;

import java.util.Scanner;

public class Persona {
    private int cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasena;
    private Producto producto;

    private Scanner sc = new Scanner(System.in);


    public void registrarPersona() {
        System.out.println("Registro de Persona:");
        System.out.println("Ingrese su cédula:");
        cedula = sc.nextInt();
        sc.nextLine(); // Consumir la nueva línea después de nextInt()
        System.out.println("Ingrese su nombre:");
        nombre = sc.nextLine();
        System.out.println("Ingrese su apellido:");
        apellido = sc.nextLine();
        System.out.println("Ingrese su correo:");
        correo = sc.nextLine();
        System.out.println("Ingrese su contraseña:");
        contrasena = sc.nextLine();
    }
    public void consultarUsuario() {
        System.out.println("Información del usuario:");
        System.out.println("ID: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Correo: " + correo);
    }

    public void iniciarSesion() {
        System.out.println("Inicio de Sesión:");
        System.out.println("Ingrese su correo:");
        String correoIng = sc.nextLine();
        System.out.println("Ingrese su contraseña:");
        String contrasenaIng = sc.nextLine();

        if (correo.equals(correoIng) && contrasena.equals(contrasenaIng)) {
            System.out.println("Inicio de sesión exitoso. ¡Bienvenido!");
        } else {
            System.out.println("Inicio de sesión fallido. Verifique su correo y contraseña.");
        }
    }

    public void ingresarProducto(Producto producto) {
        System.out.println("Ingrese el nombre del producto:");
        producto.setNomProd(sc.nextLine());

        System.out.println("Ingrese el sabor del producto:");
        producto.setSaborProd(sc.nextLine());

        System.out.println("Ingrese la cantidad del producto:");
        producto.setCantidad(sc.nextInt());
        sc.nextLine(); // Limpiar el buffer del scanner

        System.out.println("Ingrese la presentación del producto:");
        producto.setPresentacion(sc.nextLine());
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }


}