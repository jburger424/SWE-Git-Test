import com.company.Adder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
  Adder adder = new Adder();
  @Test
  public void add(){
    assertEquals(0,adder.add(""),"empty string does NOT return 0");
  }
}
