package calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {
        
        /**
         * Importação do metodo calc da classe calculadora
         */
        Calculadora calc = new Calculadora();

        /**
         * Metodo chamado para o calculo de adição
         */
        System.out.println(calc.calcular(2, 3, "+"));
        /**
         * Metodo chamado para o calculo de subtração
         */
        System.out.println(calc.calcular(10, 4, "-"));
        /**
         * Metodo chamado para o calculo de multiplicação
         */
        System.out.println(calc.calcular(3, 5, "*"));
        /** 
         * Metodo chamado para o calculo de divisão 
         */
        System.out.println(calc.calcular(8, 2, "/"));

        /**
         * Try criado para tratamento de exceção caso o valor seja 0
         */
        try{
            System.out.println(calc.calcular(8, 0, "/")); //exceção
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        /**
         * Try criado para tratamento de exceção caso o modelo escolhido seja 'x' e não '*'
         */
        try{
            System.out.println(calc.calcular(5, 5, "x"));
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }

}