public class Main {
    public static void main(String[] args) {
        // Exemplo com SomAutomotivo
        SomAutomotivo som = new SomAutomotivo();
        som.liga();
        som.ajustarVolume(2);
        som.ajustarVolume(-3);
        som.desliga();

        // Exemplo com Televisao
        Televisao tv = new Televisao();
        tv.liga();
        tv.ajustarVolume(3);
        tv.ajustarVolume(11);
        tv.desliga();
    }
}