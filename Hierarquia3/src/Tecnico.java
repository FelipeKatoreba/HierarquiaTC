import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tecnico extends Pessoa{

	String nome;
	@Id
	Long idMatricula;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getIdMatricula() {
		return idMatricula;
	}

	public void setIdMatricula(Long idMatricula) {
		this.idMatricula = idMatricula;
	}

	
	
	
	
	
	
}
