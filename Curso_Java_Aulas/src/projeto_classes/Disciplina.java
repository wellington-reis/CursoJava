package projeto_classes;

import java.util.Arrays;

public class Disciplina {
	// Objeto Disciplina(oque sou)

	// Atributos (oque tenho)
	String Materia;
	int Faltas;
	double Media;
	double[] notasvetor = new double[4]; //AULA13_6
	double[] notas = new double[4];//projetoEscola


	Aluno aluno = new Aluno();

	// Métodos ( oque faço )
	/* get e set */

	public void setMateria(String materia) {
		Materia = materia;
	}

	public double[] getNotasvetor() {
		return notasvetor;
	}

	public void setNotasvetor(double[] notasvetor) {
		this.notasvetor = notasvetor;
	}

	public String getMateria() {
		return Materia;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double getMedia() {
		return Media;
	}

	public void setMedia(double media) {
		Media = media;
	}

	public double getFaltas() {
		return Faltas;
	}

	public void setFaltas(int faltas) {
		Faltas = faltas;
	}

	public double getSomaNotasJava() {

		double somaTotalJava = 0;

		somaTotalJava += aluno.somaNotaJava();

		return somaTotalJava;
	}

	public double getSomaNotaslOG() {

		double somaTotalLog = 0;

		somaTotalLog += aluno.somaNotaLog();

		return somaTotalLog;

	}

	/* Hashcode e Equal */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Faltas;
		result = prime * result + ((Materia == null) ? 0 : Materia.hashCode());
		long temp;
		temp = Double.doubleToLongBits(Media);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + Arrays.hashCode(notas);
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
		Disciplina other = (Disciplina) obj;
		if (Faltas != other.Faltas)
			return false;
		if (Materia == null) {
			if (other.Materia != null)
				return false;
		} else if (!Materia.equals(other.Materia))
			return false;
		if (Double.doubleToLongBits(Media) != Double.doubleToLongBits(other.Media))
			return false;
		if (!Arrays.equals(notas, other.notas))
			return false;
		return true;
	}

	/* To String */

	@Override
	public String toString() {
		return "Disciplina [Materia=" + Materia + ", nota=" + Arrays.toString(notas) + ", Faltas=" + Faltas + ", Media="
				+ Media + "]";
	}

	//

}
