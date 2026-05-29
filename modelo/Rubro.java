package modelo;

public class Rubro {

    // Atributos
    private int codigo;
    private String descripcion;

    // Constructor
    public Rubro(int codigo, String descripcion) {

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
