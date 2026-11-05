package siga;

public class GravadorMySQL implements MatriculaRepositorio {
    @Override
    public void gravar(String dados) {
        System.out.println("[MySQL] Gravando: " + dados);
    }
}
