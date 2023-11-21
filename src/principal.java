import java.util.Random;

public class principal {

    public static void main(String[] args) {
        Random random = new Random();
        implementandoFormulas formulas = new implementandoFormulas();
        Double numeroAleatorio = random.nextDouble(101);

        Double resultadoAreaCirculo = formulas.calcularAreaCirculo(numeroAleatorio );
        System.out.printf("\nResultado do calculo:" +resultadoAreaCirculo);

        Double resultadoAreaLosango = formulas.calcularAreaLosango(numeroAleatorio,numeroAleatorio);
        System.out.printf("\nResultado do calculo:" +resultadoAreaLosango);

        Double resultadoAreaQuadrada = formulas.calcularAreaQuadrado(numeroAleatorio,numeroAleatorio);
        System.out.printf("\nResultado do calculo:" +resultadoAreaQuadrada);

        Double resultadoAreaTrapezio = formulas.calcularAreaTrapezio(numeroAleatorio,numeroAleatorio,numeroAleatorio);
        System.out.printf("\nResultado do calculo:" +resultadoAreaTrapezio);

        Double resultadoAreaTriangulo = formulas.calcularAreaTriangulo(numeroAleatorio,numeroAleatorio);
        System.out.printf("\nResultado do calculo:" +resultadoAreaTriangulo);
    } 
    
}
