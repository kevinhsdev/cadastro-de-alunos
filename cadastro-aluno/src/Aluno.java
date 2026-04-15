public class Aluno {

    private int id;
    private String nome;
    private int idade;
    private String turma;

    public Aluno(String nome, int idade, String turma) {
        this.nome = nome;
        this.idade = idade;
        this.turma = turma;
    }

    // Construtor com id (para leitura do banco)
    public Aluno(int id, String nome, int idade, String turma) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id
                + " | Nome: " + nome
                + " | Idade: " + idade
                + " | Turma: " + turma;
    }
}

