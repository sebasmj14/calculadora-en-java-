import java.util.Scanner;

public class calcu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:2");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:3");
        double num2 = scanner.nextDouble();

        System.out.println("Ingrese la operación (suma, resta, multiplicación, división):-");
        String operacion = scanner.next();

        double resultado;

        switch (operacion) {
            case "suma":
                resultado = num1 + num2;
                break;
            case "resta":
                resultado = num1 - num2;
                break;
            case "multiplicación":
                resultado = num1 * num2;
                break;
            case "división":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error! División por cero no está permitida.");
                    return;
                }
                break;
            default:
                System.out.println("Operación no reconocida");
                return;
        }

        System.out.println("El resultado es: " + resultado);
    }
}