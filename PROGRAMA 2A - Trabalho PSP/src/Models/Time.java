package Models;

public class Time {
	public Integer pontos = 0;
	public Integer inscricao = 1;
	public Integer feitos = 0;
	public Integer tomados = 0;
	
	//Complexidade ciclomática -> 1
	public void set_pontos(Integer pontos) {
		this.pontos = pontos;
	}
	
	//Complexidade ciclomática -> 1
	public void set_inscricao(Integer inscricao) {
		this.inscricao = inscricao;
	}
	
	//Complexidade ciclomática -> 1
	public void set_feitos(Integer feitos) {
		this.feitos = feitos;
	}

	//Complexidade ciclomática -> 1
	public void set_tomados(Integer tomados) {
		this.tomados = tomados;
	}
	
	//Complexidade ciclomática -> 1
	public Integer get_pontos() {
		return pontos;
	}
	
	//Complexidade ciclomática -> 1
	public Double get_cesta_average() {
		if (tomados == 0) return (double) feitos;
		return ((double) feitos)/tomados;
	}

	//Complexidade ciclomática -> 1
	public Integer get_inscricao() {
		return inscricao;
	}
	
	//Complexidade ciclomática -> 1
	public Integer get_feitos() {
		return feitos;
	}

	//Complexidade ciclomática -> 1
	public Integer get_tomados() {
		return tomados;
	}
}
