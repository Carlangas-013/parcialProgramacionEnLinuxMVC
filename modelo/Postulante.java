package modelo;

public class Postulante {

    // Atributos
    private String dni;
    private String nombres;
    private String apellidos;
    private String correo;
    private String telefono;
    private String direccion;

    // Constructor
    public Postulante(String dni,
                      String nombres,
                      String apellidos,
                      String correo,
                      String telefono,
                      String direccion) {

        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    // Métodos
    public boolean postular(Oferta oferta) {
        return true;
    }

    public void mostrarDatos() {
        System.out.println("Postulante: " + nombres + " " + apellidos);
    }
}
