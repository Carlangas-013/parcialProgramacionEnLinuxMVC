package modelo;

public class GradoEstudio {

    // Atributos
    private int codigo;
    private String descripcion;

    // Constructor
    public GradoEstudio(int codigo, String descripcion) {

        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    // Métodos
    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
