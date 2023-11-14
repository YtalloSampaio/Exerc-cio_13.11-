class Televisao implements ComandosBasicos {
    private int volume = 5;

    @Override
    public void ajustarVolume(int quantidade) {
        if (quantidade > 0) {
            // Aumentar volume
            if (volume + quantidade <= 10) {
                volume += quantidade;
                System.out.println("Volume aumentado. Volume atual: " + volume);
            } else {
                System.out.println("Aviso: Volume máximo atingido.");
            }
        } else if (quantidade < 0) {
            // Diminuir volume
            if (volume + quantidade >= 0) {
                volume += quantidade;
                System.out.println("Volume diminuído. Volume atual: " + volume);
            } else {
                System.out.println("Aviso: Mudo ativado.");
            }
        }
    }

    @Override
    public void liga() {
        System.out.println("Televisão ligada.");
    }

    @Override
    public void desliga() {
        System.out.println("Televisão desligada.");
    }
}