import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace2() {
    int[] input1 = {1, 2, 3, 4, 5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, input1);
  }

  @Test
  public void testReversed2() {
    int[] input1 = {1, 2, 3, 4, 5};
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void averageWithoutLowest1() {
    double[] input1 = {1, 2, 3, 1};
    assertEquals(2.0, ArrayExamples.averageWithoutLowest(input1), 1e-9);
  }

  @Test
  public void averageWithoutLowest2() {
    double[] input1 = {1, 1, 5, 6, 6, 6, 6};
    assertEquals(5.0, ArrayExamples.averageWithoutLowest(input1), 1e-9);
  }
}
