package agenda;

import java.util.ArrayList;

public class Controlador {

    public void run() {
        Agenda agenda = new Agenda();
        Contacto contacto;
        int opc = 0;
        do {
            Vista.mostrarMenu();
            opc = Vista.leerOpcion();
            switch (opc) {
                case 1:
                    Vista.showResult(agenda.insertarContacto(Vista.leerContacto()));
                    break;
                case 2:
                    Vista.mostrarContacto(agenda.borrarContacto(Vista.leerTelefono()));
                    break;
                case 3:               
                    Vista.showResult(agenda.modificarContacto(Vista.leerContacto(),Vista.leerTelefono()));
                    break;
                case 4:
                    Vista.mostrarContacto(agenda.buscarTelefono(Vista.leerTelefono()));
                    break;
                case 5:
                    Vista.mostrarListado(agenda.getContactos());
                    break;
                default:
                    break;

            }
        } while (opc != 0);
    }

}
