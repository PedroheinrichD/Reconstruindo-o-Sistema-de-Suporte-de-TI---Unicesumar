public class TecnicoSoftware extends Tecnico implements Atendimento{

    //construtor
    public TecnicoSoftware(String nome, String especialidade) {
        super(nome, especialidade);
    }

    public void realizarAtendimento() {
        System.out.println(getNome() + " Realizando atendimento de Software..");        
    }
}   
