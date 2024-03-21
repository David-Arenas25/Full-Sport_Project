package funcionalidades;

import java.util.Scanner;

public class Domiciliario extends Persona {

    private String placa;
    private String marca;
    private String poliza;
    private Scanner sc = new Scanner(System.in);
    @Override
    public void registrarPersona() {
        super.registrarPersona();
        System.out.println("Ingrese la placa del vehiculo");
        placa = sc.nextLine();
        System.out.println("Ingrese la marca del vehiculo");
        marca = sc.nextLine();
        System.out.println("ingrese el numero de poliza");
        poliza = sc.nextLine();
    }

    @Override
    public void consultarUsuario() {
        super.consultarUsuario();
        System.out.println("Placa " + placa);
        System.out.println("Marca vehiculo " + marca);
        System.out.println("Numero de poliza " + poliza);
    }
}
