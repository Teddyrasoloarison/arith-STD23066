package school.hei.arith.endpoint;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdditionControllerTest {
  private final AdditionController subject = new AdditionController();

  @Test
  void testAdd() {
    assertEquals(3, subject.add(1, 2));
  }
}
