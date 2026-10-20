public class Chamado {
    private int numero;
    private String descricao;
    private String status;
    private Computador computador;
    private Tecnico tecnico;
    private static int proximoNumero = 1;

    public Chamado(String descricao, String status, Computador computador, Tecnico tecnico) {
        this.numero = proximoNumero++;
        this.descricao = descricao;
        this.status = status;
        this.computador = computador;        
        this.tecnico = tecnico;
    };

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
