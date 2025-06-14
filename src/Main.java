
//Un operador bancario está creando una lista diaria de n clientes calificados para
//préstamos por valor entre B/ 25000.00 (25mil) y B/ 400000.00 (400mil).
//Se toman los
////datos personales: nombre, sexo, salario y el monto de su préstamo. Si su salario es
////mayor a B/.800.00, el cliente califica para el préstamo. Indique al cliente si se le aprobó
////o no el préstamo.
////El operador dejará de prestar hasta que cumpla o sobrepase su meta de 1 millón de
////balboas por día (1000000.00)
//El programa debe mostrar la cantidad de clientes tramitados, a cuantos clientes se les aprobó préstamo.
// Imprima cuantos hombres y cuantas mujeres que aprobaron su préstamo.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int cantClientes = 0;
        while (true){
            try {
                System.out.println("Inserte la cantidad de clientes: ");
                cantClientes = Integer.parseInt(reader.readLine());

                System.out.println("Datos del Cliente");
                System.out.println("Nombre: ");
                String nombre = reader.readLine().trim();

                System.out.printf("Sexo: ");
                String sexo = reader.readLine().trim();

                System.out.println("Salario: ");
                double salario = Double.parseDouble(reader.readLine());

                System.out.println("Monto del préstamo: ");





            }
            catch (NumberFormatException e){
                System.err.println("Error: " + e.getMessage());
                continue;
            }
            catch (RuntimeException e){
                System.err.println("Error: " + e.getMessage());
                continue;
            }
            catch (IOException e){
                System.err.println("Error: " + e.getMessage());
                continue;
            }
            break;
        }
    }
}
