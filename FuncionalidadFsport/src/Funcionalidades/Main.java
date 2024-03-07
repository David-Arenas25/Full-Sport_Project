package Funcionalidades;

import Funcionalidades.Administrador;
import Funcionalidades.Cliente;
import Funcionalidades.Domiciliario;
import Funcionalidades.Usuario;

public class Main {

    public static void main(String[] args) {
        Administrador administrador = new Administrador();
        Cliente cliente = new Cliente();
        Domiciliario domiciliario = new Domiciliario();
        Usuario usuario = new Usuario();

        usuario.registroUsuarios();
        switch (usuario.tipoUsuario){
            case 1:
                System.out.println("Te damos la bienvenida al Full Sport clientes");
                cliente.registroUsuarios();
                break;
            case 2:
                System.out.println("Bienvenido al portal de administradores");
                administrador.registroUsuarios();
                break;
            case 3:
                System.out.println("Bienvenido a la plataforma para domiciliarios");
                domiciliario.registroUsuarios();
                break;



        }usuario.imprimirRegistro();
    }



    }


