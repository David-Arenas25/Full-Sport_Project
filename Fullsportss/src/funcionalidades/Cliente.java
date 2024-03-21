package funcionalidades;

import java.util.Scanner;

public class Cliente extends Persona {
    private String actividad;
    private String tiempoActividad;
    private Scanner sc = new Scanner(System.in);


    @Override
    public void registrarPersona() {
        super.registrarPersona();
        System.out.println("que tipo de actividad fisica realizas?");
        actividad = sc.nextLine();
        System.out.println("hace cuanto?");
        tiempoActividad = sc.nextLine();
    }

    @Override
    public void consultarUsuario() {
        System.out.println("La persona hace esta actividad " + actividad);
        System.out.println("Realiza la actividad hace "+ tiempoActividad);
        super.consultarUsuario();
    }
}