package br.com.abevieiramota.spring.model.monster;

/**
 * * exemplo de factory bean
 * * init-method e destroy-method configurados via xml
 */
public class RandomBasicMonsterFactory {

	private static final int DEFAULT_BASIC_MONSTER_HP = 100;

	public Monster getInstance() {

		return new BasicMonster((long) (Math.random() * 100), DEFAULT_BASIC_MONSTER_HP);
	}

	public void initFactory() {
		System.out.println(getClass().getName() + " acabei de ser instanciado :)");
	}

	public void destroyFactory() {
		System.out.println(getClass().getName() + " socorro!!! vou ser removido do container!");
	}
}
