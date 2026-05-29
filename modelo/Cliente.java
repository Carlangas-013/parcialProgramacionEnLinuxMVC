package modelo;

public class Cliente {

    // Atributos
    private String ruc;
    private String razonSocial;
    private String email;
    private String contacto;
    private String telefono;
    private String clave;

    // Constructor
    public Cliente(String ruc, String razonSocial,
                   String email, String contacto,
                   String telefono, String clave) {

        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.email = email;
        this.contacto = contacto;
        this.telefono = telefono;
        this.clave = clave;
    }

    // Métodos
    public boolean agregarOferta(Oferta oferta) {
        return true;
    }

    public boolean eliminarOferta(Oferta oferta) {
        return true;
    }

    public Oferta[] getOfertas() {
        return null;
    }
}
