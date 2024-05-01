import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
           System.out.println("");
            System.out.println("¿Qué tipo de envío desea realizar?");
            System.out.println("1. Paquete estándar");
            System.out.println("2. Documento urgente");
            System.out.println("3. Artículo frágil");
            System.out.print("Ingrese el número correspondiente a la opción deseada: ");
            opcion = scanner.nextInt();

            if (opcion < 1 || opcion > 3) {
                System.out.println("Opción no válida. Por favor, ingrese un número entre 1 y 3.");
            }
        } while (opcion < 1 || opcion > 3);

        System.out.println("Ingrese el peso del envío:");
        double peso = scanner.nextDouble();

        Envio envio;
        switch (opcion) {
            case 1:
                envio = new PaqueteEstandar(peso);
                break;
            case 2:
                envio = new DocumentoUrgente(peso);
                break;
            case 3:
                envio = new ArticuloFragil(peso);
                break;
            default:
                System.out.println("Opción no válida");
                return;
        }

        double costoEnvio = envio.calcularCosto();
        System.out.println("El costo del envío es: $" + costoEnvio);
    }
}