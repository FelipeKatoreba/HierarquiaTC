
public class Main {

	public static void main(String[] args) {
		DAO<Identificavel> dao = new DAO<Identificavel>();

		Pessoa p = new Pessoa();
		p.setId(1l);
		p.setNome("Nome Pessoa");
		DAO<Pessoa> dao1 = new DAO<Pessoa>();
		dao1.save(p);
		
	 
		Tecnico t = new Tecnico ();
		t.setIdMatricula(1l);
		t.setNome("Nome ");
		DAO<Tecnico> daol = new DAO<Tecnico>();
		daol.save(t);
		
	
		Aluno a = new Aluno ();
		a.setIdMatricula(1l);
		a.setNome("Nome ");
		DAO<Aluno> dao11 = new DAO<Aluno>();
		dao11.save(a);
		
		Professor pr = new Professor ();
		pr.setIdMatricula(1l);
		pr.setNome("Nome");
		DAO<Professor> dao2 = new DAO<Professor>();
		dao2.save(pr);
		
	}
}
