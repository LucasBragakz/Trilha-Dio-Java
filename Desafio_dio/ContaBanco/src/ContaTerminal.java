import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
      
Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Por favor digite seu Nome ");
        String nomeCliente = scanner.next();
        System.out.println( nomeCliente +" por favor digite o numero da sua conta.");
        int numeroConta = scanner.nextInt() ;
        System.out.println("Agora digite a Sua Agencia");
        String agencia = scanner.next();
        System.out.println("Digite seu Saldo");
        int saldo  = scanner.nextInt() ;
       


       System.out.println("Olá " + nomeCliente + ", Obrigado por criar uma conta em nosso banco, Sua Agencia é: " + agencia +" conta: "+ numeroConta +" e seu saldo de  R$"+ saldo + " ja esta disponivel para saque" );
    }
}



/*Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua Altura");
        altura = scanner.nextDouble();

        System.out.println("Digite Seu nome");
        nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        sobreNome= scanner.next();*/