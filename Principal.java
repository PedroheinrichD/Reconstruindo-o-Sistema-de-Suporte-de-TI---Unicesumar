public class Principal {
    public static void main(String[] args) {
        Computador computador = new Computador("PAT-0001", "Dell OptiPlex 7010", "Windows 11");
        
        Tecnico tecnico1 = new TecnicoHardware("Pedro", "Tecnico de hardware");
        Tecnico tecnico2 = new TecnicoSoftware("João", "Tecnico de Software");


        Chamado chamado1 = new Chamado("Problema no hardware.", "Aberto.", computador, tecnico1);
        Chamado chamado2 = new Chamado("Sistema operacional apresentando lentidão.", "Em atendimento..", computador, tecnico2);
        Chamado chamado3 = new Chamado("Teclado não está funcionando.", "Aberto.", computador, tecnico1);
        
        Chamado.handleChamados();


       tecnico1.realizarAtendimento();
       tecnico2.realizarAtendimento();
    }
}
