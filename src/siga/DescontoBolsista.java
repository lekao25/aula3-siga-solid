package siga;
public class DescontoBolsista implements Desconto {
    @Override
    public double aplicar(double valorBase) { return valorBase * 0.5; }
}