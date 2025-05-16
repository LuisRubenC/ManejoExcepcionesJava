import java.util.Scanner;
public class Validacion {
    public static void main(String[] args) throws Exception {
        String usuario,email,contraseña;
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.println("------ BIENVENIDO ------");
        System.out.println("Ingrese el nombre de su usuario:");
        usuario =sc.nextLine();
        System.out.println("Ingrese su edad:");
        edad =sc.nextInt();
        System.out.println("Ingrese su correo electronico:");
        email =sc.nextLine();
        System.out.println("Ingrese su contraseña:");
        contraseña =sc.nextLine();

    }

    public void ValidarEdad(int edad){
        
    }

}
