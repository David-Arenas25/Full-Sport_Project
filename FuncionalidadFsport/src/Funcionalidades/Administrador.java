package Funcionalidades;

import java.util.Objects;

public class Administrador extends Usuario {
    String numCredencial = "4780";
    String credencialIng;
    @Override
    public void registroUsuarios() {
        System.out.println("ingrese su numero de credencial para continuar");
        credencialIng = sc.nextLine();


        if (Objects.equals(numCredencial, credencialIng)){
            System.out.println("Credenciales autenticas espere mientras se carga el portal admin");

            registro[7] = credencialIng;

        }

    }
}
