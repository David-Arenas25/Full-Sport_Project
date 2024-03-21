
package funcionalidades;

import java.util.Scanner;

public class Administrador extends Persona {
    private int credenciales;
    private String departamento;

    private Scanner sc = new Scanner(System.in);

    @Override
    public void registrarPersona() {
        super.registrarPersona();
        System.out.println("Ingrese sus credenciales:");
        credenciales = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer del scanner

        System.out.println("Ingrese el departamento al que pertenece:");
        departamento = sc.nextLine();

    }


    @Override
    public void iniciarSesion() {
        super.iniciarSesion();
        System.out.println("Ingrese sus credenciales de nuevo para validar:");
        int credencialesIng = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer del scanner

        if (credenciales == credencialesIng) {
            System.out.println("Credenciales válidas. Bienvenido.");

        } else {
            System.out.println("Las credenciales no coinciden. No se pudo registrar el administrador.");
        }
    }
}
