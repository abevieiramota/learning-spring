package br.com.abevieiramota.spring.model;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import br.com.abevieiramota.spring.model.monster.Monster;

/**
 * * exemplo de uso de default-init-method > ver spring.xml <beans>
 */
public class BasicPlayer implements Player {

	private String name;
	private Monster monster;
	private String message;
	private Map<String, String> mapParaTestarMap;

	public BasicPlayer(String name) {
		this.name = name;
	}

	@Override
	public String play() {
		return this.name + " está playando";
	}

	@Override
	public Monster getMonster() {
		return this.monster;
	}

	public void setMonster(Monster monster) {
		this.monster = monster;
	}

	public void defaultInitMethod() {
		System.out.println(getClass().getName()
				+ " acabei de ser inicializado! estou sendo chamado por ter o nome do default-init-method :)))");
	}

	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public List<String> getSkills() {
		return Collections.emptyList();
	}

	public Map<String, String> getMapParaTestarMap() {
		return mapParaTestarMap;
	}

	public void setMapParaTestarMap(Map<String, String> mapParaTestarMap) {
		this.mapParaTestarMap = mapParaTestarMap;
	}
}
