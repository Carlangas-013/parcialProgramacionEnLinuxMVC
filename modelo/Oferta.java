package modelo;

public class Oferta {

    // Atributos
    private String nombrePuesto;
    private String descripcion;
    private String area;
    private String fechaInicio;
    private String fechaFin;

    // Constructor
    public Oferta(String nombrePuesto,
                  String descripcion,
                  String area,
                  String fechaInicio,
                  String fechaFin) {

        this.nombrePuesto = nombrePuesto;
        this.descripcion = descripcion;
        this.area = area;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    // Métodos
    public boolean agregarRequisito(Requisito requisito) {
        return true;
    }

    public boolean eliminarRequisito(Requisito requisito) {
        return true;
    }

    public Requisito[] getRequisitos() {
        return null;
    }
}
