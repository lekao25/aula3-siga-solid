package siga;

public class Matricula {
    private Aluno aluno;
    private double valorBase;
    private Desconto desconto;
    private MatriculaRepositorio repositorio;

    public Matricula(Aluno aluno, double valorBase, Desconto desconto, MatriculaRepositorio repositorio) {
        this.aluno = aluno;
        this.valorBase = valorBase;
        this.desconto = desconto;
        this.repositorio = repositorio;
    }

    public double calcularMensalidade() {
        return desconto.aplicar(valorBase);
    }

    public void salvar() {
        repositorio.gravar("Matrícula de " + aluno.getNome()
                + " - mensalidade: " + calcularMensalidade());
    }
}