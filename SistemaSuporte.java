
public class SistemaSuporte {

    private String nome = "IT Solutions";
    private double versao = 1.0;
    private String tecnico = "Pedro Dias";
    private int qtdChamadosAbertos = 0;
    private String status = "Ativo";


    public void VerificarChamados(){
        if(qtdChamadosAbertos > 0){
            System.out.println("Existem chamados aguardando atendimento");
        }else{
            System.out.println( "Nenhum chamado pendente");
        }
    }

    //getters
    public String getNome() {
        return nome;
    }

    public String getNomeTecnico() {
        return tecnico;
    }

    public double getVersao() {
        return versao;
    }


    public String getStatus() {
        return status;
    }

    public int getQtdChamadosAbertos() {
        return qtdChamadosAbertos;
    }

    //setter
    public void setQtdChamadosAbertos(int qtdChamadosAbertos) {
        this.qtdChamadosAbertos = qtdChamadosAbertos;
    }

    public static void main(String[] args) {
        SistemaSuporte sistemaSuporte = new SistemaSuporte();
        
        sistemaSuporte.setQtdChamadosAbertos(5);
        sistemaSuporte.VerificarChamados();

        System.out.println("---------SISTEMA IT SOLUTIONS---------");
        System.out.println(" nome do sistema: " + sistemaSuporte.getNome());
        System.out.println(" técnico responsável: " + sistemaSuporte.getNomeTecnico());
        System.out.println(" versão do sistema atual é " + sistemaSuporte.getVersao());
        System.out.println(" Quantidade de chamados abertos: " + sistemaSuporte.getQtdChamadosAbertos());
        System.out.println(" Status do sistema " + sistemaSuporte.getStatus());
    }
}
