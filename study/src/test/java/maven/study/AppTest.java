package maven.study;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest
{
    @Test
    public void AppComputedTest(){
      App app = new App();
      int result = app.computed(10, 2);
      int expected = 5;
      assertEquals(expected, result);
      System.out.println("test method have bean called");
    }
}
