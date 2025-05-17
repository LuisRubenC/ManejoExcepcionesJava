# ManejoExcepcionesJava
# Validación de Datos en Java

Este proyecto es una aplicación Java de consola que simula un formulario de registro con validaciones de datos. El programa solicita al usuario que ingrese su nombre, edad, correo electrónico y contraseña, y realiza las siguientes validaciones:

- **Edad:** Debe estar en el rango de 0 a 120, de lo contrario se lanza la excepción personalizada `EdadInvalidaException`.
- **Correo electrónico:** Se valida un formato básico que incluya un solo símbolo "@" y un punto después del mismo, sin espacios y sin que inicie o finalice con esos caracteres.
- **Contraseña:** Debe tener al menos 12 caracteres, contener al menos una letra mayúscula, un número y un símbolo especial (solo se consideran `#` o `$`). Si alguna de estas condiciones no se cumple, se lanza una excepción con el mensaje correspondiente.

## Contenido del Proyecto

### Archivo Principal
- **Validacion.java:** Contiene el método `main` y las funciones de validación:
  - `validarEdad(int edad)`: Valida que la edad esté en el rango correcto, lanzando `EdadInvalidaException` si no es así.
  - `validarCorreo(String correo)`: Comprueba que el correo tenga el formato adecuado.
  - `ValidarContraseña(String contraseña)`: Verifica que la contraseña cumpla con los requisitos de longitud y contenido.

### Excepción Personalizada
- **EdadInvalidaException:** Extiende de `Exception` y se utiliza para manejar errores cuando la edad ingresada no se encuentra dentro del rango permitido (0 - 120).

### Pruebas Obligatorias 
-Edad 150 
![image](https://github.com/user-attachments/assets/3c6a0a88-fcb7-4925-bd57-ba8f4ab18879)

-Correo sin @
![image](https://github.com/user-attachments/assets/2379f825-043e-4dfd-a213-0d91c67c81e0)

-Contraseña abc123
![image](https://github.com/user-attachments/assets/5a9393e0-ba23-49ad-a029-4970c0ba16b8)

-Ejemplo de entrada adecuada
![image](https://github.com/user-attachments/assets/d6263c61-7749-4002-a9b8-024d68013c97)




