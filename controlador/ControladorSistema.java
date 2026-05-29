package controlador;

import modelo.Cliente;
import modelo.Oferta;
import modelo.Postulante;
import modelo.Postulacion;
import vista.VistaSistema;

public class ControladorSistema {

	private VistaSistema vista;
	public ControladorSistema(VistaSistema vista){
		this.vista = vista;
	}

    public void iniciar() {
	
	vista.mostrarTitulo();
	
	String ruc = vista.pedirRuc();
	String razon = vista.pedirRazonSocial();

	
        // Crear cliente
        Cliente cliente = new Cliente(
           ruc,
	   razon,
            "empresa@gmail.com",
            "Carlos Torres",
            "999888777",
            "1234"
        );
	//postulante
	String nombres = vista.pedirNombres();
	String apellidos = vista.pedirApellidos();

	Postulante postulante = new Postulante(
            "76543210",
		nombres,
		apellidos,
            "juan@gmail.com",
            "987654321",
            "Lima"
        );

	Oferta oferta  = new Oferta(
		"Programador Java",
		"Desarrollo de Sistemas",
		"TI",
		"13/06/2026",
		"30/12/2026"
	);

        Postulacion postulacion = new Postulacion(
            "20/06/2026",
            "Pendiente",
            postulante,
            oferta
        );

        // Mostrar información
        vista.mostrarMensaje("Postulacion registrada correctamente");

        postulante.mostrarDatos();

        postulacion.mostrarPostulacion();

        cliente.mostrarCliente();
    }
}
