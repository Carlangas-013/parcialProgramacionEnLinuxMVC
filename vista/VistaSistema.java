package vista;

import java.util.Scanner;

public class VistaSistema {

    private Scanner consola = new Scanner(System.in);

    // Mostrar título
    public void mostrarTitulo() {
        System.out.println("=== SISTEMA DE RECLUTAMIENTO ===");
    }

    // Pedir datos cliente
    public String pedirRuc() {
        System.out.print("RUC: ");
        return consola.nextLine();
    }

    public String pedirRazonSocial() {
        System.out.print("Razón Social: ");
        return consola.nextLine();
    }

    // Pedir datos postulante
    public String pedirNombres() {
        System.out.print("Nombres: ");
        return consola.nextLine();
    }

    public String pedirApellidos() {
        System.out.print("Apellidos: ");
        return consola.nextLine();
    }

    // Mostrar mensajes
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
