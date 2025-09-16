import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private String nome;
    private String descricao;
    private String dataInicio;
    private String dataFim;
    private String status;
    private Usuario gerente;
    private List<Equipe> equipes;
    private List<Tarefa> tarefas;

    public Projeto(String nome, String descricao, String dataInicio, String dataFim, Usuario gerente) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.status = "Em andamento";
        this.gerente = gerente;
        this.equipes = new ArrayList<>();
        this.tarefas = new ArrayList<>();
    }

    public void adicionarEquipe(Equipe equipe) {
        equipes.add(equipe);
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    @Override
    public String toString() {
        return "Projeto: " + nome + " | Status: " + status + " | Gerente: " + gerente.getNome();
    }
}
