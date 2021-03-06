
/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.awt.Point;

import org.junit.Test;

import bot.penguee.MatrixPosition;

public class TestMatrixPosition {
	@Test
	public void testConstructor1() {
		int x = 500;
		int y = 700;
		MatrixPosition mp = new MatrixPosition(x, y);
		
		assertEquals(x, mp.x);
		assertEquals(y, mp.y);
		assertNull(mp.name);
	}

	@Test
	public void testConstructor2() {
		int x = 500;
		int y = 700;
		String myCustomName = "myCustomName";
		MatrixPosition mp = new MatrixPosition(x, y, myCustomName);

		assertEquals(x, mp.x);
		assertEquals(y, mp.y);
		assertEquals(myCustomName, mp.name);
	}

	@Test
	public void testConstructor3() {
		int x = 500;
		int y = 700;
		String myCustomName = "myCustomName";
		MatrixPosition mp = new MatrixPosition(x, y, myCustomName);
		MatrixPosition mp2 = new MatrixPosition(mp);

		assertNotNull(mp2.x);
		assertNotNull(mp2.y);
		assertNotNull(mp2.name);

		assertEquals(mp.x, mp2.x);
		assertEquals(mp.y, mp2.y);
		assertEquals(mp.name, mp2.name);
	}

	@Test
	public void testConstructor4() {
		int x = 500;
		int y = 700;
		MatrixPosition mp = new MatrixPosition(new Point(x, y));

		assertEquals(mp.x, x);
		assertEquals(mp.y, y);
		assertNull(mp.name);
	}

	@Test
	public void testConstructor5() {
		int x = -1;
		int y = -1;
		MatrixPosition mp = new MatrixPosition();

		assertEquals(mp.x, x);
		assertEquals(mp.y, y);
		assertNull(mp.name);
	}

	@Test
	public void testGetX() {
		int x = 500;
		int y = 700;
		MatrixPosition mp = new MatrixPosition(x, y);

		assertEquals(mp.getX(), x);
	}

	@Test
	public void testGetY() {
		int x = 500;
		int y = 700;
		MatrixPosition mp = new MatrixPosition(x, y);

		assertEquals(mp.getY(), y);
	}

	@Test
	public void testGetName() {
		int x = 500;
		int y = 700;
		String myCustomName = "myCustomName";
		MatrixPosition mp = new MatrixPosition(x, y, myCustomName);

		assertEquals(mp.getName(), myCustomName);
	}

	@Test
	public void testAdd() {
		int x = 500;
		int y = 700;
		int offsetX = 100;
		int offsetY = 200;
		MatrixPosition mp = new MatrixPosition(x, y);
		MatrixPosition result = mp.add(offsetX, offsetY);
		assertEquals(mp.x + offsetX, result.x);
		assertEquals(mp.y + offsetY, result.y);
	}

	@Test
	public void testAdd2() {
		int x = 500;
		int y = 700;
		int offsetX = 100;
		int offsetY = 200;
		MatrixPosition mp = new MatrixPosition(x, y);
		MatrixPosition offsetMP = new MatrixPosition(offsetX, offsetY);
		MatrixPosition result = mp.add(offsetMP);

		assertEquals(mp.x + offsetX, result.x);
		assertEquals(mp.y + offsetY, result.y);
	}

	@Test
	public void testSub() {
		int x = 500;
		int y = 700;
		int offsetX = 100;
		int offsetY = 200;
		MatrixPosition mp = new MatrixPosition(x, y);
		MatrixPosition result = mp.sub(offsetX, offsetY);
		assertEquals(mp.x - offsetX, result.x);
		assertEquals(mp.y - offsetY, result.y);
	}

	@Test
	public void testSub2() {
		int x = 500;
		int y = 700;
		int offsetX = 100;
		int offsetY = 200;
		MatrixPosition mp = new MatrixPosition(x, y);
		MatrixPosition offsetMP = new MatrixPosition(offsetX, offsetY);
		MatrixPosition result = mp.sub(offsetMP);

		assertEquals(mp.x - offsetX, result.x);
		assertEquals(mp.y - offsetY, result.y);
	}

	@Test
	public void testSetName() {
		int x = 500;
		int y = 700;
		String myCustomName = "myCustomName";
		String myCustomName2 = "myCustomName2";
		MatrixPosition mp = new MatrixPosition(x, y, myCustomName);
		mp.setName(myCustomName2);
		
		assertEquals(mp.name, myCustomName2);
	}
	
	@Test
	public void testEquals() {
		int x = 500;
		int y = 700;
		int offsetX = 100;
		int offsetY = 200;
		String myCustomName = "myCustomName";
		MatrixPosition mp = new MatrixPosition(x, y, myCustomName);
		MatrixPosition mp_equal = new MatrixPosition(x, y, myCustomName);
		MatrixPosition mp2 = new MatrixPosition(x+offsetX, y, myCustomName);
		MatrixPosition mp3 = new MatrixPosition(x, y + offsetY, myCustomName);
		MatrixPosition mp4 = new MatrixPosition(x+offsetX, y, myCustomName+"000");
		
		assertTrue(mp.equals(mp_equal));
		assertFalse(mp.equals(mp2));
		assertFalse(mp.equals(mp3));
		assertFalse(mp.equals(mp4));
	}

}
