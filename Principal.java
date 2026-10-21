public class Principal {
    public static void main(String[] args) {
        Computador computador = new Computador("PAT-0001", "Dell OptiPlex 7010", "Windows 11");
        
        Tecnico tecnico1 = new TecnicoHardware("Pedro", "Tecnico de hardware");
        Tecnico tecnico2 = new TecnicoSoftware("João", "Tecnico de Software");


        Chamado chamado = new Chamado("Problema no hardware.", "Aberto.", computador, tecnico1);
        
        System.out.println("Chamado " + chamado.getNumero() + " Problema: " + chamado.getDescricao() + " status: " + chamado.getStatus() + " computador com defeito: " + chamado.getComputador().getModelo() + " para o técnico " + chamado.getTecnico().getNome());
        tecnico1.realizarAtendimento();
        tecnico2.realizarAtendimento();
    }
}
