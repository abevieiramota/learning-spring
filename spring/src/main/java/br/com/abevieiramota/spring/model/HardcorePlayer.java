package br.com.abevieiramota.spring.model;

import br.com.abevieiramota.spring.model.monster.Monster;

public class HardcorePlayer implements Player {

	private String nome;
	private Monster monstro;

	public HardcorePlayer(String nome, Monster monstro) {
		this.nome = nome;
		this.monstro = monstro;
	}

	@Override
	public String play() {
		return this.nome + " está playando HARDCORE";
	}

	@Override
	public Monster getMonstro() {
		return this.monstro;
	}

}
