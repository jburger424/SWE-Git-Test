import com.company.Adder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
  Adder adder = new Adder();
  @Test
  public void add(){
    assertEquals(0,adder.add(""),"empty string does NOT return 0");
    assertEquals(1,adder.add("1"),"'1' does NOT return 1");
    assertEquals(101,adder.add("101"),"'101' does NOT return 101");
    assertEquals(4,adder.add("1,3"),"'1,3' does NOT return 4");
    assertEquals(2,adder.add("-1,3"),"'-1,3' does NOT return 2");
    assertEquals(6,adder.add("1,2,3"),"'1,2,3' does NOT return 6");
    assertEquals(77,adder.add("3,1,4,1,5,9,2,6,5,3,5,8,9,7,9"),"'3,1,4,1,5,9,2,6,5,3,5,8,9,7,9' does NOT return 77");
    //
    assertEquals(5,adder.add(",5"),"',5' does NOT return 5");
  }
}
