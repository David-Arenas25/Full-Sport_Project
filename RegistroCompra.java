package Integrador;

import Integrador.CarritoDeCompra;

public class RegistroCompra extends CarritoDeCompra {

    String DireccionDeEnvio;
    @Override
    public void Registro() {
        super.Registro();
        System.out.println("ingrese su Dirección");
        DireccionDeEnvio =sc.nextLine();
    }
}
