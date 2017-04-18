import static org.junit.Assert.assertEquals;
import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;

public class DataTest {
  ArrayList<Double> dataSet;
  Data data;

  @Before
  public void initialize() {
    dataSet = new ArrayList<Double>(Arrays.asList(20.2, 19.2, 10.5));
    data = new Data(dataSet);
  }

  @Test
  public void testGetList() {
    ArrayList<Double> listCopy = data.getList();
    assertEquals(dataSet, listCopy);
  }

  @Test
  public void testSetList() {
    ArrayList<Double> newList = new ArrayList<Double>(Arrays.asList(19.5, 7.8, 22.2));
    data.setList(newList);
    ArrayList<Double> getList = data.getList();
    assertEquals(getList, newList);
  }

  @Test
  public void testGetSum() {
    Double sum = data.getSum();
    Double ourSum = (19.2 + 20.2 + 10.5);
    assertEquals(ourSum, sum);
  }

  @Test
  public void testGetAverage() {
    Double avg = data.getAverage();
    Double ourAvg = ((20.2 + 19.2 + 10.5)/3);
    assertEquals(ourAvg, avg);
  }

  @Test
  public void testGetMaximum() {
    Double max = data.getMaximum();
    assertEquals(Double.valueOf(20.2), max);
  }

  @Test
  public void testGetMinimum() {
    Double min = data.getMinimum();
    assertEquals(Double.valueOf(10.5), min);
  }

  @Test
  public void testGetRange() {
    Double range = data.getRange();
    Double ourRange = 20.2 - 10.5;
    assertEquals(ourRange, range);
  }

}
