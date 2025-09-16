import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private String nome;
    private String descricao;
    private List<Usuario> membros;

    public Equipe(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.membros = new ArrayList<>();
    }

    public void adicionarMembro(Usuario usuario) {
        membros.add(usuario);
    }

    @Override
    public String toString() {
        return "Equipe: " + nome + " | Membros: " + membros.size();
    }
}
