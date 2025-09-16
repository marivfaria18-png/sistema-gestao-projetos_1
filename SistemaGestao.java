public class SistemaGestao {
    public static void main(String[] args) {
        // Criando usuários
        Usuario admin = new Usuario("Ana", "12345678900", "ana@email.com", "Administrador", "ana", "123");
        Usuario gerente = new Usuario("Carlos", "98765432100", "carlos@email.com", "Gerente", "carlos", "123");
        Usuario colaborador = new Usuario("João", "55566677788", "joao@email.com", "Colaborador", "joao", "123");

        // Criando equipe
        Equipe equipe1 = new Equipe("Equipe Alpha", "Equipe responsável pelo desenvolvimento do sistema.");
        equipe1.adicionarMembro(colaborador);

        // Criando projeto
        Projeto projeto1 = new Projeto("Sistema de Gestão", "Sistema para organizar projetos e equipes", "01/09/2025", "31/12/2025", gerente);
        projeto1.adicionarEquipe(equipe1);

        // Criando tarefa
        Tarefa tarefa1 = new Tarefa("Criar banco de dados", "Modelar e implementar o banco", colaborador, "30/09/2025");
        projeto1.adicionarTarefa(tarefa1);

        // Exibindo informações
        System.out.println(admin);
        System.out.println(projeto1);
        System.out.println(equipe1);
        System.out.println(tarefa1);
    }
}
