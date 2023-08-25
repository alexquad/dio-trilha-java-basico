public class Usuario {
    public static void main(String[] args) {
        
        SmartTv tv = new SmartTv();

        System.out.println("TV está ligada? " + tv.ligada);

        System.out.println("Se sim, qual o canal? " + (tv.ligada ? tv.canal : "Desligada"));

        System.out.println("Se sim, qual o volume? " + (tv.ligada ? tv.volume : "Desligada"));

        tv.ligar();

        System.out.println("TV está ligada? " + tv.ligada);

        System.out.println("Se sim, qual o canal? " + (tv.ligada ? tv.canal : "Desligada"));

        System.out.println("Se sim, qual o volume? " + (tv.ligada ? tv.volume : "Desligada"));

        tv.aumentarVolume();
        tv.aumentarCanal();

        System.out.println("Canal: " + tv.canal + " Volume: " + tv.volume);
    }
}
