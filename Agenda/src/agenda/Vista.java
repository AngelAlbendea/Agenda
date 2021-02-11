package agenda;

import java.util.ArrayList;

public class Vista {

    public static void mostrarMenu() {
        System.out.println("1. Insertar contacto");
        System.out.println("2. Borrar contacto");
        System.out.println("3. Modificar");
        System.out.println("4. Buscar");
        System.out.println("5. Listar contactos");
        System.out.println("0. Salir");
    }
    //otra forma es importar el paquete para no tener que poner "Utils" delante:

    /* import static agenda.Utils.*; //esto arriba del todo, fuera de la clase.
        int opc = readUnsignedInt();*/ //esto dentro del metodo.
    // importamos el pàquete en static porque los metodos de dentro son static.
    public static int leerOpcion() {
        int opc = Utils.readUnsignedInt();
        if (opc < 0) {
            System.out.println("Formato incorrecto");
        } else if (opc > 5) {
            System.out.println("Opcion incorrecta");
        }
        return opc;
    }

    public static Contacto leerContacto() {
        Contacto contacto = new Contacto();
        System.out.println("Introduce el nombre: ");
        contacto.setNombre(Utils.readString());
        System.out.println("Introduce el email: ");
        contacto.setEmail(Utils.readString());
        System.out.println("Introduce el teléfono: ");
        contacto.setTelefono(Utils.readString());
        return contacto;
    }

    public static void showResult(boolean result) {
        /*if (result) {
            System.out.println("Operacion realizada correctamente");
        }else{
            System.out.println("Ups! Algo no ha ido bien.");
        }*
        //Es lo mismo pero mas largo*/

        System.out.println(result ? "Operacion realizada correctamente" : "Ups! Algo no ha ido bien.");
    }

    public static void mostrarContacto(Contacto contacto) {
        /*System.out.println("Nombre: " + contacto.getNombre());
        System.out.println("Teléfono: " + contacto.getTelefono());
        System.out.println("Email: " + contacto.getEmail());*/ //forma mas larga de hacerlo, menos practica. Se sobreescribe
        //el string y con eso es suficiente.
        
        if (contacto != null) {
          System.out.println(contacto);  
        }else{
            showResult(false);
        }
        
        
    }

    public static void mostrarListado(ArrayList<Contacto> contactos) {
        for (Contacto contacto : contactos) {
            mostrarContacto(contacto);
        }
    }
    
    public static String leerTelefono(){
        System.out.println("Introduce el teléfono: ");
        String telefono = Utils.readString();
        return telefono;
    }

}
