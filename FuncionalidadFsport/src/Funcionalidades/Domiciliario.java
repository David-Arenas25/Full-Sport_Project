package Funcionalidades;

public class Domiciliario extends Usuario {

    String placa;
    String marca;
    String poliza;
    @Override
    public void registroUsuarios() {
            System.out.println("Ingrese la placa del vehiculo");
            placa = sc.nextLine();
            System.out.println("Ingrese la marca del vehiculo");
            marca = sc.nextLine();
            System.out.println("ingrese el numero de poliza");
            poliza = sc.nextLine();

            registro[7] = placa;
            registro[8] = marca;
            registro[9] = poliza;
        }
    }

