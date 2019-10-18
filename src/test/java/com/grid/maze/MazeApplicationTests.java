package com.grid.maze;

import com.grid.maze.entity.*;
import com.grid.maze.adapters.GraphService;
import com.grid.maze.factories.AbstractFactory;
import com.grid.maze.factories.Factory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MazeApplicationTests {
	@Autowired
	private Factory factory;

	@Autowired
	private GraphService graphService;

	@Test
	public void contextLoads() throws IOException {
		AbstractFactory factory = this.factory.getFactory(Status.EVIL);

		chooseNextRoom(factory);

		graphService.readGraph();
	}

	public void chooseNextRoom(AbstractFactory factory) {
		Ghost ghost = factory.getGhost();
		Room room = factory.getRoom();

		EvilGhost casper = new EvilGhost.GhostBuilder().damage(1).name("casper").build();
		casper.sayName();
	}

}
