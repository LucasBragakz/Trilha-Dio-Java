import java.util.Locale;
import java.util.Scanner;


public class EntradaUsuario {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Digite Seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobreNome= scanner.next();

        System.out.println("Digite sua Idade");
        int idade= scanner.nextInt();

        System.out.println("Digite sua Altura");
        double altura = scanner.nextDouble();

        System.out.println("Ola , me chamo " + nome +" " + sobreNome );
        System.out.println("Tenho " + idade+ " anos ");
        System.err.println("Minha Altura é " + altura + " cm ");

        



    }
}
