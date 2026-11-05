package siga;
public class DescontoFuncionario implements Desconto {
    @Override
    public double aplicar(double valorBase) { return valorBase * 0.7; }
}