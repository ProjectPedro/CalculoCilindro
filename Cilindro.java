//8. Algoritmo Que informe a área e o volume de um cilindro.
import java.util.Scanner;
public class Cilindro {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o Raio Do Cilindro: ");
        double raio = scanner.nextDouble();

        System.out.print("Digite a Altura do Cilindro: ");
        double altura = scanner.nextDouble();

        final double PI =Math.PI;
        double volume = PI * Math.pow(raio,2) * altura;
        double area = 2 * PI * raio * ( raio + altura);
        System.out.printf("A Área do Cilindro: %.2f\n", area);
        System.out.printf("O Volume do Cilindro: %.2f\n", volume);

        scanner.close();
    }
}
