public class Tecnico implements Atendimento {
    private String nome;
    private String especialidade;

    public Tecnico(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }

    @Override
    public void realizarAtendimento() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}
