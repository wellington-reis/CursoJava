package projeto_classes;

import java.util.ArrayList;
import java.util.List;

import projeto_constantes.ResultadosAluno;

public class Aluno extends Pessoa {

	boolean resultado;
	double notaTotalJava;
	double notaTotalLog;
	double notaMediaJava;
	double notaMediaLog;
	String resultadotxt;
	int numeroFaltas;
	String nomeEscola;
	double notaMax;

	double[] notasJava = { 70.1, 70.2, 70.3, 70.4 };
	double[] notasLogica = { 90.5, 90.6, 90.7, 90.8 };

	/* Criando uma lista de diciplinas para o objeto aluno. */

	public List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	/* Set & Get */

	public double somaNotaJava() {
		double soma = 0;
		for (int i = 0; i < notasJava.length; i++) {

			soma += notasJava[i];

		}

		return soma;
	}

	public double somaNotaLog() {
		double soma = 0;
		for (int i = 0; i < notasJava.length; i++) {

			soma += notasLogica[i];

		}

		return soma;
	}

	public double[] getNotasJava() {
		return notasJava;
	}

	public void setNotasJava(double[] notasJava) {
		this.notasJava = notasJava;
	}

	public double[] getNotasLogica() {
		return notasLogica;
	}

	public void setNotasLogica(double[] notasLogica) {
		this.notasLogica = notasLogica;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public double getNotaMax() {
		return notaMax;
	}

	public void setNotaMax(double notaMax) {
		this.notaMax = notaMax;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public void setResultadotxt(String resultadotxt) {
		this.resultadotxt = resultadotxt;
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

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}

	public void setNotaMediaLog(double notaMediaLog) {
		this.notaMediaLog = notaMediaLog;
	}

	public void setNotaTotalJava(double notaTotalJava) {
		this.notaTotalJava = notaTotalJava;
	}

	public void setNotaTotalLog(double notaTotalLog) {
		this.notaTotalLog = notaTotalLog;
	}

	public void setNotaMediaJava(double notaMediaJava) {
		this.notaMediaJava = notaMediaJava;
	}

	public void setNumeroFaltas(int numeroFaltas) {
		this.numeroFaltas = numeroFaltas;
	}

	public String getResultadoTxt() {
		return resultadotxt;
	}

	public void setResultadoTxt(String resultadoTxt) {
		this.resultadotxt = resultadoTxt;
	}

	@Override
	public boolean pessoaMaiorIdade() {
		return idade >= 22;
	}

	public String msgMaiorIdade() {

		return this.pessoaMaiorIdade() ? "obaa aluno maior de Idade" : "ixi vc e menor de idade";
	}

	/* Hashcode & equal */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numeroCpf == null) ? 0 : numeroCpf.hashCode());
		result = prime * result + ((registroGeral == null) ? 0 : registroGeral.hashCode());
		return result;

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroCpf == null) {
			if (other.numeroCpf != null)
				return false;
		} else if (!numeroCpf.equals(other.numeroCpf))
			return false;
		if (registroGeral == null) {
			if (other.registroGeral != null)
				return false;
		} else if (!registroGeral.equals(other.registroGeral))
			return false;
		return true;
	}

	/* TO String */
	@Override
	public String toString() {
		return "DadosPessoais [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + "]";
	}

	/* === Operaçoes Matematicas */

	/* Soma das notas */

	public double getNotaTotalJava() {

		for (Disciplina dJava : disciplinas) {

			notaTotalJava = dJava.getSomaNotasJava();

		}

		return notaTotalJava;

	}

	public double getNotaTotalLog() {

		for (Disciplina dlogica : disciplinas) {

			notaTotalLog = dlogica.getSomaNotaslOG();

		}

		return notaTotalLog;
	}

	/* RETIRANDO A MEDIA */

	public double getNotaMediaJava() {

		notaMediaJava = notaTotalJava / 4;

		return notaMediaJava;
	}

	public double getNotaMediaLog() {

		notaMediaLog = notaTotalLog / 4;

		return notaMediaLog;
	}

	/* SOMANDO NUMERO DE FALTAS */

	public int getNumeroFaltas() {

		for (Disciplina disciplina : disciplinas) {
			numeroFaltas = disciplina.Faltas;

		}

		return numeroFaltas;

	}

	/* CONDICIONAIS PARA O RESULTADO */

	public boolean getResultado() {

		if (notaMediaJava >= 70.0 && numeroFaltas <= 40) {

			return true;/* Aprovado */

		} else {

			return false;/* Reprovado */
		}

	}

	public String getResultadotxt() {

		if (numeroFaltas < 40) {

			if (notaMediaJava >= 50.0 && notaMediaLog >= 50.0) {

				if (notaMediaJava >= 70.0 && notaMediaLog >= 70.0) {

					return ResultadosAluno.APROVADO; /* usando Constante */

				} else {

					return ResultadosAluno.RECUPERACAO; /* usando Constante */

				}

			} else {

				return ResultadosAluno.REPROVADO; /* usando Constante */
			}
		} else {
			return ResultadosAluno.REPROVADOF;

		}

	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 1000.00;
	}

}
