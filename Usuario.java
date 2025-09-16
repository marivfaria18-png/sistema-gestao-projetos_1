public class Usuario {
    private String nome;
    private String cpf;
    private String email;
    private String cargo; // Administrador, Gerente ou Colaborador
    private String login;
    private String senha;

    public Usuario(String nome, String cpf, String email, String cargo, String login, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.cargo = cargo;
        this.login = login;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return "Usuário: " + nome + " (" + cargo + ")";
    }
}
