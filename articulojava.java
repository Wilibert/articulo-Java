public class articulojava {
    public static void main(String[] args) {

        // Declaración de variables
        String articulo = "Camisa";

        boolean tienePermiso = true;

        int cifra = 950;
        String respuesta;
        int n = 25;

        boolean encendido = true;

        int cantidad = 20;

// Condicional para el permiso de acceso
        if (!tienePermiso) {

            System.out.println("No tiene permiso de acceso");

        } else {
            System.out.println("Bienvenido");
        }

// Condicional para el rango de la cifra
        if (cifra >= 0 && cifra < 501) {
            System.out.println("Rango menor");
        } else if (cifra >= 501 && cifra < 2001) {
            System.out.println("Rango intermedio");
        } else if (cifra >= 2001 && cifra < 10000) {
            System.out.println("Rango superior");
        } else {
            System.out.println("Rango inválido!");
        }

// Condicional para la respuesta
        if (n > 0 && n < 100) {
            respuesta = "SI";
        } else {
            respuesta = "NO";
        }

// Condicional para el estado y la cantidad
        if (encendido) {
            if (cantidad == 20) {
                System.out.println("Correcto");
            }
        } else {
            System.out.println("Incorrecto");
        }
    }
}
