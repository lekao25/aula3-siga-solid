package siga;
public class DescontoConvenio implements Desconto {
    @Override
    public double aplicar(double valorBase) { return valorBase * 0.8; }
}