package aa21;

public class Aluno {
	private int matricula;
	private String nome;
	private String prontuario;
	private String curso;
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProntuario() {
		return prontuario;
	}

	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Aluno(int matricula, String nome, String prontuario, String curso) {
		this.matricula = matricula;
		this.nome = nome;
		this.prontuario = prontuario;
		this.curso = curso;
	}
}
