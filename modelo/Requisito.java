package modelo;

public class Requisito {

    // Atributos
    private int codigo;
    private String descripcion;

    // Constructor
    public Requisito(int codigo, String descripcion) {

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
