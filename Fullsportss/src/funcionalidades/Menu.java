package funcionalidades;

import java.util.Scanner;



public class Menu {

    Producto producto = new Producto();
    Cliente cliente = new Cliente();
    Administrador administrador = new Administrador();
    Domiciliario domiciliario = new Domiciliario();
    Factura factura = new Factura();
    Compra compra = new Compra();
    private int tipoUsuario;
    private Scanner sc = new Scanner(System.in);
    private int opc = 0;


    public void menu() {
        while (opc != 4){
        System.out.println("Bienvenido a Full Sport");
        System.out.println();
        System.out.println("¿Qué tipo de usuario eres? 1.Cliente 2.Administrador 3.Domiciliario 4.Salir");
        tipoUsuario = sc.nextInt();
        sc.nextLine();

        switch (tipoUsuario) {
            case 1:
                System.out.println("Te damos la bienvenida al Full Sport clientes");
                cliente.registrarPersona();
                cliente.iniciarSesion();
                cliente.consultarUsuario();
                compra.ingresarProducto(producto);
                factura.imprimirFactura(producto);



                break;
            case 2:
                System.out.println("Bienvenido al portal de administradores");
                administrador.registrarPersona();
                administrador.iniciarSesion();
                administrador.consultarUsuario();
                System.out.println("Registre un producto");
                producto.ingresarProducto(producto);
                producto.consultarProducto(producto);




                break;
            case 3:
                System.out.println("Bienvenido a la plataforma para domiciliarios");
                domiciliario.registrarPersona();
                domiciliario.consultarUsuario();
                break;
            case 4:
                System.out.println("Saliendo");
                break;
            default:
                System.out.println("Ingrese una opcion válida");
        }
    }
}}