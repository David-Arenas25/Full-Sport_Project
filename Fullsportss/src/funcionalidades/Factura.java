package funcionalidades;

public class Factura{

    Compra compra;
    Producto producto;

    public void imprimirFactura(Producto producto){
        System.out.println("Imprimiendo factura");
        System.out.println("Compró " + producto.getNomProd());
        System.out.println("El precio de cada uno es "+ producto.getPrecio());
        System.out.println("Usted compro "+ producto.getCantidad());
        System.out.println("El total es "+ (producto.getCantidad() * producto.getPrecio()));
        System.out.println("POR FAVOR CONSIGNAR ESTE VALOR A LA CUENTA Y ENVIAR FOTO DEL COMPROBANTE PARA VALIDAR");

    }


}
