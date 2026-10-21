public class TecnicoHardware extends Tecnico implements Atendimento{

    //construtor
    public TecnicoHardware(String nome, String especialidade) {
        super(nome, especialidade);
    }

    public void realizarAtendimento() {
        System.out.println(getNome() + " Realizando atendimento de hardware..");
    }
}   
