package one.digitalinnovation.basecamp;

public class CalcularArea {
    public void quadrilateros(double lado){
        System.out.println("Área do quadrado: "+ (lado * lado));
        return;
    }

    public void quadrilateros(double baseMaior, double baseMenor){
        System.out.println("Área do retangulo: "+ (baseMaior * baseMenor));
        return;
    }

    public void quadrilateros(double baseMaior, double baseMenor, double Altura){
        System.out.println("Área do trapézio: "+ (((baseMaior * baseMenor) * Altura) / 2));
        return;
    }
}
