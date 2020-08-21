import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class SolutionsTest {

  @Test
  public void solution001() {
    int[] ints = new Solutions().solution001(new int[]{1, 2, 3, 4}, 3);
    assertArrayEquals(new int[]{0,1},ints);
  }
}
