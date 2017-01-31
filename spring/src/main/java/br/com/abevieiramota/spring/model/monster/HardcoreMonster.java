package br.com.abevieiramota.spring.model.monster;

public class HardcoreMonster implements Monster {

	private static final int DEFAULT_HP_ATTACK_DECREMENT = 10;
	private long strength;
	private long hp;

	public HardcoreMonster(long strength, long hp) {
		this.strength = strength;
		this.hp = hp;
	}
	
	@Override
	public long attack() {
		this.hp -= DEFAULT_HP_ATTACK_DECREMENT;

		return this.strength;
	}

	@Override
	public long getHp() {
		return this.hp;
	}
}
