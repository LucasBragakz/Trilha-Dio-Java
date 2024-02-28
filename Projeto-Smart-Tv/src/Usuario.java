public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();


        System.out.println("A tv esta ligada ? " + smartTV.ligada);
        System.out.println("A TV esta em qual canal ? " + smartTV.canal);
        System.out.println("Qual o volume da TV ?" + smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo Status A tv esta ligada ? " + smartTV.ligada);
        smartTV.desligar();
        System.out.println("Novo Status A tv esta ligada ? " + smartTV.ligada);
   
        smartTV.diminuirVolume();
        System.out.println("Qual o volume da TV ?" + smartTV.volume);
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        System.out.println("Qual o volume da TV ?" + smartTV.volume);


        smartTV.mudarCanal(13);
        System.out.println("A TV esta em qual canal ? " + smartTV.canal);


    }

}
