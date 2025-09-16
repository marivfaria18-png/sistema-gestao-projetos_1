public class Tarefa {
    private String titulo;
    private String descricao;
    private Usuario responsavel;
    private String status;
    private String prazo;

    public Tarefa(String titulo, String descricao, Usuario responsavel, String prazo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.prazo = prazo;
        this.status = "Pendente";
    }

    public void concluirTarefa() {
        this.status = "Concluída";
    }

    @Override
    public String toString() {
        return "Tarefa: " + titulo + " | Responsável: " + responsavel.getNome() + " | Status: " + status;
    }
}
