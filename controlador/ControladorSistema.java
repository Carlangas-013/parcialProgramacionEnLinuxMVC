package controlador;

import modelo.Cliente;
import modelo.Oferta;
import modelo.Postulante;
import modelo.Postulacion;

public class ControladorSistema {

    public void iniciar() {

        // Crear cliente
        Cliente cliente = new Cliente(
            "12345678901",
            "Empresa ABC",
            "empresa@gmail.com",
            "Carlos Torres",
            "999888777",
            "1234"
        );

        // Crear oferta
        Oferta oferta = new Oferta(
            "Programador Java",
            "Desarrollo de sistemas",
            "Sistemas",
            "01/06/2026",
            "30/06/2026"
        );

        // Crear postulante
        Postulante postulante = new Postulante(
            "76543210",
            "Juan",
            "Perez",
            "juan@gmail.com",
            "987654321",
            "Lima"
        );

        // Crear postulacion
        Postulacion postulacion = new Postulacion(
            "20/06/2026",
            "Pendiente",
            postulante,
            oferta
        );

        // Mostrar información
        System.out.println("=== SISTEMA DE RECLUTAMIENTO ===");

        postulante.mostrarDatos();

        postulacion.mostrarPostulacion();

        cliente.mostrarCliente();
    }
}
