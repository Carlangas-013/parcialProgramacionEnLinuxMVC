import controlador.ControladorSistema;
import vista.VistaSistema;

public class Main {

    public static void main(String[] args) {

	VistaSistema vista = new VistaSistema();
        ControladorSistema controlador = new ControladorSistema(vista);

        controlador.iniciar();
    }
}
