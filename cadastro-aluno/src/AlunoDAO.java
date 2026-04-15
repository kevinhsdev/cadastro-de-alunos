import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    private static final String URL  = "JDBC:mysql://localhost:3306/escola";
    private static final String USER = "root";
    private static final String PASS = "@Capitaok104864";

    private Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
    // CADASTRAR
    public void cadastrar(Aluno aluno) {
        String sql = "INSERT INTO alunos (nome, idade, turma) VALUES (?, ?, ?)";
        try (Connection con = conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, aluno.getNome());
            ps.setInt(2, aluno.getIdade());
            ps.setString(3, aluno.getTurma());
            ps.executeUpdate();
            System.out.println("✔ Aluno cadastrado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar: " + e.getMessage());
        }
    }

    // LISTAR TODOS
    public List<Aluno> listar() {
        List<Aluno> lista = new ArrayList<>();
        String sql = "SELECT * FROM alunos ORDER BY nome";
        try (Connection con = conectar();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Aluno(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getInt("idade"),
                        rs.getString("turma")
                ));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar: " + e.getMessage());
        }
        return lista;
    }

    // BUSCAR POR NOME
    public List<Aluno> buscarPorNome(String nome) {
        List<Aluno> lista = new ArrayList<>();
        String sql = "SELECT * FROM alunos WHERE nome LIKE ?";
        try (Connection con = conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, "%" + nome + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(new Aluno(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getInt("idade"),
                        rs.getString("turma")
                ));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar: " + e.getMessage());
        }
        return lista;
    }

    // EDITAR
    public void editar(Aluno aluno) {
        String sql = "UPDATE alunos SET nome=?, idade=?, turma=? WHERE id=?";
        try (Connection con = conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, aluno.getNome());
            ps.setInt(2, aluno.getIdade());
            ps.setString(3, aluno.getTurma());
            ps.setInt(4, aluno.getId());
            ps.executeUpdate();
            System.out.println("✔ Aluno atualizado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao editar: " + e.getMessage());
        }
    }

    // REMOVER
    public void remover(int id) {
        String sql = "DELETE FROM alunos WHERE id=?";
        try (Connection con = conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("✔ Aluno removido com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao remover: " + e.getMessage());
        }
    }


    }
