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

        System.out.println("Ingrese su contraseña: ");
        contraseña = sc.nextLine();

        try {
        ValidarContraseña(contraseña);
            } catch (Exception e) {
             System.out.println("Error: " + e.getMessage());
             return;
            }


        sc.close();
    }

    

public static void ValidarContraseña(String contraseña) throws Exception {
    if (contraseña.length() < 12) {
        throw new Exception("La contraseña debe tener al menos 12 caracteres.");
    }

    boolean tieneMayuscula = false;
    boolean tieneNumero = false;
    boolean tieneSigno = false;

    for (char c : contraseña.toCharArray()) {
        if (Character.isUpperCase(c)) {
            tieneMayuscula = true;
        }
        if (Character.isDigit(c)) {
            tieneNumero = true;
        }
        if (c == '#' || c == '$') {
            tieneSigno = true;
        }
    }

    if (!tieneMayuscula) {
        throw new Exception("La contraseña debe contener al menos una letra mayúscula.");
    }
    if (!tieneNumero) {
        throw new Exception("La contraseña debe contener al menos un número.");
    }
    if (!tieneSigno) {
        throw new Exception("La contraseña debe contener al menos un signo especial (# o $).");
    }

    System.out.println("Contraseña válida.");
}


}
