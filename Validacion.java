import java.util.Scanner;

public class Validacion {

    public static void main(String[] args) throws Exception {
        String usuario, email, contraseña;
        int edad;
        Scanner sc = new Scanner(System.in);

        System.out.println("------ BIENVENIDO ------");

        System.out.print("Ingrese el nombre de su usuario: ");
        usuario = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Ingrese su correo electrónico: ");
        email = sc.nextLine();

        try {
            if (validarCorreo(email)) {
                System.out.println("Correo válido.");
            } else {
                throw new Exception("Formato de correo inválido.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return; 

        System.out.print("Ingrese su contraseña: ");
        contraseña = sc.nextLine();

        sc.close();
    }


    public static boolean validarCorreo(String correo) {

        int arrobaIndex = correo.indexOf("@");
        int ultimaArroba = correo.lastIndexOf("@");

        if (arrobaIndex == -1 || arrobaIndex != ultimaArroba) {
            return false; 
        }

        int puntoDespues = correo.indexOf(".", arrobaIndex);
        if (puntoDespues == -1) {
            return false;
        }

        if (correo.startsWith("@") || correo.endsWith("@") || 
            correo.startsWith(".") || correo.endsWith(".")) {
            return false;
        }

        if (correo.contains(" ")) {
            return false;
        }

        return true;
    }

    public void ValidarEdad(int edad) {
 
    }
}
