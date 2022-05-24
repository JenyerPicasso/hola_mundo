//Entrada y salida de datos de usuario
import java.util.Scanner; //1ro se importan las librerias
public class entradaSalida { //Despues se inicia el programa
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        /*int numero;
        System.out.println("Digite un numero: ");
        numero=entrada.nextInt();//nextInt por que es un dato entero
        System.out.println("El numero es: "+numero);

        float numeroflot;
        System.out.println("Digite un numero decimal: ");
        numeroflot=entrada.nextFloat();
        System.out.println("El numero flotante es: "+numeroflot);*/

        double numerodoble;
        System.out.println("Digite un numero tipo double: ");
        numerodoble=entrada.nextDouble();
        System.out.println("El numero doble es: "+numerodoble);

        entrada.nextLine(); // limpieza de buffer

        String cadena;
        System.out.println("Digite una frase: ");
        cadena=entrada.nextLine();//next solo guarda hasta encontrar un espacio y nextLine guarda TODA la frase
        System.out.println("La frase es: "+cadena);
        
        char caracter;
        System.out.println("Digite un caracter: ");
        caracter=entrada.next().charAt(0); //Se agrega chatAt que guarda un solo caracter en la posisión 0
        System.out.println("El caracter es: "+caracter);
    }
}
