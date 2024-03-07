package Funcionalidades;

public class Cliente extends Usuario {
    String actividad;
    String tiempoActividad;

    @Override
    public void registroUsuarios() {
            System.out.println("que tipo de actividad fisica realizas?");
            actividad = sc.nextLine();
            System.out.println("hace cuanto?");
            tiempoActividad = sc.nextLine();
            registro[7] = actividad;
            registro[8] = tiempoActividad;

        }

    }

