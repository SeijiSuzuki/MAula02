package one.digitalinnovation.basecamp;

public class CalcularArea {
    public void quadrilateros(double lado){
        System.out.println("Área do quadrado: "+ (lado * lado));
        return;
    }

    public void quadrilateros(double baseMarior, double baseMenor){
        System.out.println("Área do retangulo: "+ (baseMarior * baseMenor));
        return;
    }

    public void quadrilateros(double baseMarior, double baseMenor, double Altura){
        System.out.println("Área do trapézio: "+ (((baseMarior * baseMenor) * Altura) / 2));
        return;
    }
}
