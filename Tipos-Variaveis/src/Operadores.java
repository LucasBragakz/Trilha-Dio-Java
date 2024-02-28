public class Operadores {

    

public static void main(String[] args) {
   
    int numero = 5;
    numero ++ ;
    System.out.println(numero);

    int a, b;
    a = 6;
    b = 6;
   
    String resultado = "";
        if (a==b)
            resultado = "verdadeiro";
        else
            resultado = "Falso";
//nesta estrutura temos o padrao de estrutura de repetição
    System.out.println("Primeira estrutura "+resultado);

    String novoResultado = a==b? "Verdadeiro" : "Falso";
//nesta estrutura temos a condição em linha 
    System.out.println("novo Resultado é "+ novoResultado);


    boolean simNao = a ==b;

    System.out.println("Teste 1"+simNao);

    simNao = a!=b;
    /*Testando operadores
     * != diferente 
     * == Igual
     * < Menor que ;   > Maior que
     */
    System.out.println("Teste 2"+simNao);

    boolean condicao1=true;
    boolean condicao2= true;
    if (condicao1&& condicao2) {//operador logico de "E"
        System.out.println("as duas condições sao verdadeiras");
        
    }
    if (condicao1 || condicao2) {//operador de "OU"
        System.out.println("uma das condições é verdadeira");
        
    }
    


    

}


}