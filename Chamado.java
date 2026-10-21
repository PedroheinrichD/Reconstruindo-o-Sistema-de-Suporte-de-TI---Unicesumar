
import java.util.Scanner;

public class Chamado {
    private int numero;
    private String descricao;
    private String status;
    private Computador computador;
    private Tecnico tecnico;
    private static int proximoNumero = 0;
    private static int totalChamados = 0;
    private static int numeroChamado;

    public Chamado(String descricao, String status, Computador computador, Tecnico tecnico) {
        this.numero = proximoNumero++;
        totalChamados++;
        this.descricao = descricao;
        this.status = status;
        this.computador = computador;        
        this.tecnico = tecnico;
    };

   // função para exibir o total de chamados
    public static void handleChamados(){
        System.out.println("Total de chamados: " + totalChamados);
        
        System.out.println("digite o numero pro chamado: ");
        Scanner sc = new Scanner(System.in);
        
        try {
            numeroChamado = sc.nextInt();
            System.out.println("numero digitado: " + numeroChamado);
        } catch (Exception e) {
            System.out.println("Erro de digitação (tipo inválido): " + e);
        }
    }

    //getters
    public String getStatus() {
        return status;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getNumero() {
        return numero;
    }

    public Computador getComputador() {
        return computador;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    // setters
    public void setStatus(String status) {
        this.status = status;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
