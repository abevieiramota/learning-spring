package br.com.abevieiramota.spring.model;

import br.com.abevieiramota.spring.model.monster.Monster;

/**
 * * exemplo de uso de default-init-method > ver spring.xml <beans>
 */
public class BasicPlayer implements Player {

	private String nome;
	private Monster monstro;
	
	public BasicPlayer(String nome, Monster monstro) {
		this.nome = nome;
		this.monstro = monstro;
	}

	@Override
	public String play() {
		return this.nome + " está playando";
	}

	@Override
	public Monster getMonstro() {
		return this.monstro;
	}
	
	public void defaultInitMethod() {
		System.out.println(getClass().getName() + " acabei de ser inicializado! estou sendo chamado por ter o nome do default-init-method :)))");
	}
}
