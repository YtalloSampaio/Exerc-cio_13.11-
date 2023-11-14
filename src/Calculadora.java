class Calculadora implements CalculosMatematicos {
    @Override
    public int soma(int a, int b) {
        return a + b;
    }

    @Override
    public int subtrai(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplica(int a, int b) {
        return a * b;
    }
}
