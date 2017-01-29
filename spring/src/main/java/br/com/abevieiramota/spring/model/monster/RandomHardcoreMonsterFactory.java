package br.com.abevieiramota.spring.model.monster;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * * exemplo de factory bean
 * * init-method e destroy-method configurados via interfaces
 */
public class RandomHardcoreMonsterFactory implements InitializingBean, DisposableBean {

	private static final int DEFAULT_HARDCORE_MONSTER_HP = 1000;

	public Monster getInstance() {

		return new HardcoreMonster((long) (Math.random() * 1000), DEFAULT_HARDCORE_MONSTER_HP);
	}

	@Override
	public void destroy() throws Exception {
		System.out.println(getClass().getName() + " socorro!!! vou ser removido do container!");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(getClass().getName() + " acabei de ser instanciado :)");
	}

}
