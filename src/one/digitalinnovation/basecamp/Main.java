package one.digitalinnovation.basecamp;

public class Main {
    public static void main(String[] args) {
        CalcularArea calcularArea = new CalcularArea();

        calcularArea.quadrilateros(5);
        calcularArea.quadrilateros(7, 3);
        calcularArea.quadrilateros(16, 5, 9);
    }
}
