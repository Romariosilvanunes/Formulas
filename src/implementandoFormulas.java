
public class implementandoFormulas implements Formulas {
    
   
    @Override
    public double calcularAreaQuadrado(Double largura, Double altura){
        double lado = Math.min(largura, altura);
       
        return lado * lado;
        
    }
    @Override
    public double calcularAreaCirculo(Double raio){
        return Math.PI * Math.sqrt(raio);
    }
    @Override
    public double calcularAreaLosango(Double diagonalMenor, Double diagonalMaior){
        return (diagonalMaior * diagonalMenor)/ 2;
    }
    @Override
    public double calcularAreaTriangulo(Double base, Double altura){
        return (base * altura)/2;
    }
    @Override
    public double calcularAreaTrapezio(Double baseMaior, Double baseMenor, Double altura){
        return ((baseMaior + baseMenor) * altura)/2;
    }

    
}
