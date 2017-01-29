package br.com.abevieiramota.spring.model.monster;

public class BasicMonster implements Monster {

	private long strength;
	private long hp;
	
	public BasicMonster(long strength, long hp) {
		this.strength = strength;
		this.hp = hp;
	}

	@Override
	public long attack() {
		return this.strength;
	}
	
	@Override
	public long getHp() {
		return this.hp;
	}

}
