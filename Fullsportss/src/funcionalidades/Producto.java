package funcionalidades;

import java.util.Scanner;

public class Producto extends Persona {
    private Scanner sc = new Scanner(System.in);
    private int idProd;
    private String nomProd;
    private String saborProd;
    private int cantidad;
    private String presentacion;
    private String descripcion;
    private int stock;
    private String categoria;
    private Administrador administrador;
    private Persona persona;
    private double precio;

    public Producto(int idProd, String nomProd, String saborProd, int cantidad, String presentacion, String descripcion, int stock, String categoria, Administrador administrador, Persona persona) {
        this.idProd = idProd;
        this.nomProd = nomProd;
        this.saborProd = saborProd;
        this.cantidad = cantidad;
        this.presentacion = presentacion;
        this.descripcion = descripcion;
        this.stock = stock;
        this.categoria = categoria;
        this.administrador = administrador;
        this.persona = persona;
    }

    public Producto() {

    }

    @Override
    public void ingresarProducto(Producto producto) {
        super.ingresarProducto(producto);
        System.out.println("Ingrese el ID del producto:");
        idProd = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el precio del producto");
        precio = sc.nextDouble();

        System.out.println("Ingrese el stock del producto:");
        stock = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer del scanner

        System.out.println("Ingrese la categoría del producto:");
        categoria = sc.nextLine();

        System.out.println("Ingrese la descripción del producto:");
        descripcion = sc.nextLine();



        // Otras variables pueden ser ingresadas de manera similar



    }


    public void consultarProducto(Producto producto) {
        System.out.println("Información del Producto:");
        System.out.println("ID del Producto: " + idProd);
        System.out.println("Nombre del Producto: " + getNomProd());
        System.out.println("Precio del producto " + precio);
        System.out.println("Sabor del Producto: " + getSaborProd());
        System.out.println("Cantidad en Stock: " + stock);
        System.out.println("Categoría del Producto: " + categoria);
        System.out.println("Descripción del Producto: " + descripcion);
        System.out.println("Cantidad Disponible: " + (getCantidad() + stock));
        System.out.println("Presentación del Producto: " + getPresentacion());
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getNomProd() {
        return nomProd;
    }

    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }

    public String getSaborProd() {
        return saborProd;
    }

    public void setSaborProd(String saborProd) {
        this.saborProd = saborProd;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
