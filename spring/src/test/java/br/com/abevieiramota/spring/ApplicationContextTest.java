package br.com.abevieiramota.spring;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.abevieiramota.spring.model.BasicPlayer;
import br.com.abevieiramota.spring.model.Player;
import br.com.abevieiramota.spring.model.monster.RandomBasicMonsterFactory;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "spring.xml" })
public class ApplicationContextTest {

	@Autowired
	private ApplicationContext ctx;

	@Test
	public void testBasicPlayer() {
		Player player = (Player) this.ctx.getBean("basicPlayer");

		System.out.println(player.getMessage());

		assertEquals("Basic Player está playando", player.play());

		BasicPlayer basicPlayer = (BasicPlayer) player;

		Map<String, String> mapEsperado = new HashMap<String, String>();
		mapEsperado.put("nome", "Abelardo Vieira Mota");

		assertEquals(mapEsperado, basicPlayer.getMapParaTestarMap());
	}

	@Test
	public void testHardcorePlayer() {
		Player hardcorePlayer = (Player) this.ctx.getBean("hardcorePlayer");

		System.out.println(hardcorePlayer.getMessage());

		assertEquals("Hardcore Player está playando HARDCORE", hardcorePlayer.play());
		assertEquals(Arrays.asList("Fireball", "Torrent"), hardcorePlayer.getSkills());
	}

	@Test
	public void testScopePrototype() {
		Player basicPlayer1 = (Player) this.ctx.getBean("basicPlayer");
		Player basicPlayer2 = (Player) this.ctx.getBean("basicPlayer");

		assertTrue(basicPlayer1 != basicPlayer2);
	}

	@Test
	public void testDefaultScope() {
		RandomBasicMonsterFactory rmf1 = (RandomBasicMonsterFactory) this.ctx.getBean("basicMonsterFactory");
		RandomBasicMonsterFactory rmf2 = (RandomBasicMonsterFactory) this.ctx.getBean("basicMonsterFactory");

		assertTrue(rmf1 == rmf2);
	}

	@Test
	// TODO: como definir o application name?
	public void testApplicationName() {

		assertEquals("", this.ctx.getApplicationName());
	}

	@Test
	public void testBeanDefinitionNames() {
		for (String beanDefinitionName : this.ctx.getBeanDefinitionNames()) {
			System.out.println(beanDefinitionName);
		}

	}
}
