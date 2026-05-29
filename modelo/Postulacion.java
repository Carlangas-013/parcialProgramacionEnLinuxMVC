package modelo;

public class Postulacion {

    // Atributos
    private String fecha;
    private String estado;

    // Relaciones
    private Postulante postulante;
    private Oferta oferta;

    // Constructor
    public Postulacion(String fecha,
                       String estado,
                       Postulante postulante,
                       Oferta oferta) {

        this.fecha = fecha;
        this.estado = estado;
        this.postulante = postulante;
        this.oferta = oferta;
    }

    // Métodos
    public void registrarPostulacion() {
        System.out.println("Postulación registrada");
    }

    public void mostrarPostulacion() {
        System.out.println("Estado: " + estado);
    }
}
