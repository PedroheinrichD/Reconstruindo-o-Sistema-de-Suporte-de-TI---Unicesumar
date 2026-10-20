public class Principal {
    public static void main(String[] args) {
        Computador computador = new Computador("PAT-0001", "Dell OptiPlex 7010", "Windows 11");
        Tecnico tecnico = new Tecnico("Pedro Dias", "Desenvolvedor Back-end");

        Chamado chamado = new Chamado("Computador não liga.", "Aberto.", computador, tecnico);
        
        System.out.println("Chamado " + chamado.getNumero() + " Problema: " + chamado.getDescricao() + " status: " + chamado.getStatus() + " computador com defeito: " + chamado.getComputador().getModelo() + " para o técnico " + chamado.getTecnico().getNome());
        
    }
}
