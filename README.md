"Interface é como classes abstratas com métodos sem corpo, ou seja, uma interface não especifica como fazer algo, mas o que deve ser feito. Além disso, tem como diferença fundamental em relação a uma classe o fato de seus métodos não possuírem corpo com instruções, sem implementação."
TAKUMOTO, R. C. Programação de Sistemas II. Maringá - PR.: Unicesumar, 2018. 109p.

Sabendo disso analise a interface abaixo:

public interface Formulas {
    
    public Double calcularAreaQuadrado(Double largura, Double altura);
    
    public Double calcularAreaCirculo(Double raio);
    
    public Double calcularAreaLosango(Double diagonalMenor, Double diagonalMaior);
    
    public Double calcularAreaTriangulo(Double base, Double altura);
    
    public Double calcularAreaTrapezio(Double baseMaior, Double baseMenor, Double altura);
    
}
 
Agora faça uma classe implementando os métodos da Interface, o código deve ser inserido na resposta de forma textual, sem necessidade de enviar o código em anexo.

Complementando o código da classe, justifique situações em que se faz necessário o uso da Interface.

Material auxiliar para fórmulas:
