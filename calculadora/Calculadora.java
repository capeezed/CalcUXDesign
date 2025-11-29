package calculadora;

/**
 * <p><strong>Projeto Calculadora</Strong></p>
 * 
 * <p>Esta classe fornece operações matemáticas básicas como soma, subtração, multiplicação e divisão,
 * além de um método principal que seleciona a operação desejada com base em um operador informado pelo usuário.</p>
 * <ul>
 *      <li>Técnicas de revisão estática (caixa branca)</li>
 *      <li>Técnicas de revisão (caixa branca)</li>
 *      <li>Aplicação de refatoração em código java</li>
 *      <li>Documentação em JavaDoc</li>
 * </ul>
 * <p> Após a refatoração, os metódos desta classe são <strong>métodos puros</strong>, sem efeitos colaterais, permitindo maior legibilidade e facilitando 
 * testes unitários. </p>
 * 
 * @author Gabriel Capelini de Oliveira 
 * @version 1.0
 */

public class Calculadora {
    
    /**
     * 
     * @param a primeira operador
     * @param b segundo operador
     * @return o resultado da soma de {@code a} e {@code b}
     */
    public int somar(int a, int b){
        return a + b;
    }

    /**
     * 
     * @param a primeiro operador
     * @param b segundo operador
     * @return o resultado da subtração de {@code a} e {@code b}
     */
    public int subtrair(int a , int b){
        return a - b;
    }

    /**
     * 
     * @param a primeiro operador
     * @param b segundo operador
     * @return o resultado da multiplicação de {@code a} e {@code b}
     */
    public int multiplicar(int a, int b){
        return a * b;
    }

    /**
     * 
     * @param a primeiro operador
     * @param b segundo operador
     * @return o resulto de divisão de {@code a} e {@code b} 
     */
    public int dividir(int a, int b){
        if (b==0){
            throw new IllegalArgumentException("Divisão por zero não é permitida");
        }
        return a / b;
    }

    /**
     * 
     * @param a primeiro operador
     * @param b segundo operador
     * @param operador modelo de calculo (subtração, soma, etc)
     * @return retorno da soma do calculo escolhido
     */
    public int calcular(int a, int b, String operador){
        return switch (operador) {
            case "+" -> somar(a, b);
            case "-" -> subtrair(a,b);
            case "*" -> multiplicar(a, b);
            case "/" -> dividir(a, b);
            default -> throw new IllegalArgumentException("Operador inválido: " + operador);
        };
    }

}
