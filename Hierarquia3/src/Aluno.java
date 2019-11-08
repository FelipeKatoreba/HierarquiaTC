import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aluno extends Pessoa{

	@Id
	Long idMatricula;
	String nome;
	String curso;

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Long getIdMatricula() {
		return idMatricula;
	}

	public void setIdMatricula(Long idMatricula) {
		this.idMatricula = idMatricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
