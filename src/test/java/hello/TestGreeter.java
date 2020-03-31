package hello;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// Test for name = <'Mario'>

public class TestGreeter {

   private Greeter g = new Greeter();

   @Test
   @DisplayName("Test for Empty Name")
   public void testGreeterEmpty() 

   {
      assertEquals(g.getName(),"");
      assertEquals(g.sayHello(),"Hello!");
   }


   @Test
   @DisplayName("Test for Name='Mario'")
   public void testGreeter() 
   {

      g.setName("Mario");
      assertEquals(g.getName(),"Mario");
      assertEquals(g.sayHello(),"Hello Mario!");
   }

}
