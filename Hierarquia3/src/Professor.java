import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Professor extends Pessoa{

	@Id
	Long idMatricula;
	String disciplina;
	String nome;

	public Long getIdMatricula() {
		return idMatricula;
	}

	public void setIdMatricula(Long idMatricula) {
		this.idMatricula = idMatricula;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

	
	
	
	
	
	
	
}
