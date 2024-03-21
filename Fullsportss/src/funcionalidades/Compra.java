package funcionalidades;
public class Compra extends Persona{

    @Override
    public void ingresarProducto(Producto producto) {
        System.out.println("Ingrese los datos del producto que va a comprar");
        super.ingresarProducto(producto);
    }


}