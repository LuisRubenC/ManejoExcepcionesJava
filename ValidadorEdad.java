// Definimos la excepción personalizada
class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}

// Método para validar la edad
public class ValidadorEdad {
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad inválida: " + edad + ". La edad debe estar entre 0 y 120.");
        }
        System.out.println("Edad válida: " + edad);
    }

    public static void main(String[] args) {
        int[] edadesDePrueba = {25, -5, 150, 120};

        for (int edad : edadesDePrueba) {
            try {
                validarEdad(edad);
            } catch (EdadInvalidaException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
