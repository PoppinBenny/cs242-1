package tests;

import static org.junit.Assert.assertEquals;

import java.io.File;

import model.block.MovingBlock;
import model.types.BlockType;

import org.junit.Test;

public class MovingBlockTest {

	@Test
	public void constructor() {
		String file = new File("").getAbsolutePath() + "/images/backgrounds/clouds.jpg";
		MovingBlock block = new MovingBlock(1234,1234,BlockType.BACKGROUND,file);
		assertEquals(block.type,BlockType.BACKGROUND);
	}

}
