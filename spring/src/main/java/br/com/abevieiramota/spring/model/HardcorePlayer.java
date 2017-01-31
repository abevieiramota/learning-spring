package br.com.abevieiramota.spring.model;

import java.util.List;

import br.com.abevieiramota.spring.model.monster.Monster;

public class HardcorePlayer implements Player {

	private String name;
	private Monster monster;
	private String message;
	private List<String> skills;

	public HardcorePlayer(String name, Monster monster) {
		this.name = name;
		this.monster = monster;
	}

	@Override
	public String play() {
		return this.name + " está playando HARDCORE";
	}

	@Override
	public Monster getMonster() {
		return this.monster;
	}

	@Override
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	public void setApelido(String apelido) {
		this.message = apelido;
	}

	@Override
	public List<String> getSkills() {
		return this.skills;
	}
	
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

}
