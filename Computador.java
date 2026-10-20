public class Computador {
    private String patrimonio;
    private String modelo;
    private String sistemaOperacional;
    private boolean ligado = false;


    public Computador(String patrimonio, String modelo, String sistemaOperacional){
        this.patrimonio = patrimonio;
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
    }

    public void ligar(){
        if (ligado) {
            System.out.println("O computador já está ligado...");
            return;
        }else{
            System.out.println("ligando seu computador.");
            ligado = true;
        }
    }

    public void desligar(){
        if (ligado == false) {
            System.out.println("Computador está desligado");
            return;
        }else{
            System.out.println("desligando seu computador");
            ligado = false;
        }
    }

    public void exibirInformacoes(){
        System.out.println("Informações do computador");

        System.out.println("____________________________");
        System.out.println("Patrimonio " + patrimonio);
        System.out.println("Modelo " + modelo);
        System.out.println("Sistema Operacional " + sistemaOperacional);
        System.out.println("____________________________");
    }


    public String getModelo() {
        return modelo;
    }
}
