package Integrador;

import java.util.Scanner;

public class CarritoDeCompra {




    Scanner sc = new Scanner(System.in);

    int IdCliente;
    String NombreCliente;

    String NombreProducto;
    int precio;

    public void Registro() {
        System.out.println("Ingrese su número de identificación:");
        IdCliente = sc.nextInt();
        sc.nextLine();
        System.out.println("ingrese su nombre");
        NombreCliente = sc.nextLine();
        System.out.println("ingrese nombre de producto");
        NombreProducto = sc.nextLine();
        System.out.println("ingrese el precio del producto");
        precio = sc.nextInt();
        sc.nextLine();
    }
}

