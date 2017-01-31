package br.com.abevieiramota.spring.model;

import java.util.List;

import br.com.abevieiramota.spring.model.monster.Monster;

public interface Player {

	String play();

	Monster getMonster();

	String getMessage();

	List<String> getSkills();
}
