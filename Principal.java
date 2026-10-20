public class Principal {
    public static void main(String[] args) {
        Computador computador1 = new Computador("PAT-0001", "Dell OptiPlex 7010", "Windows 11");
        Computador computador2 = new Computador("PAT-0002", "Lenovo ThinkCentre", "Windows 11");
    
        
        computador1.ligar();
        computador1.exibirInformacoes();

        computador2.ligar();
        computador2.exibirInformacoes();
        
        computador1.desligar();
    }
}
