package at.fhtechnikum.FormCalc;

import at.fhtechnikum.FormCalc.Controller.FormController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FormCalcApplicationTests {

	@Test
	void contextLoads() {
		FormController controllerCirc = new FormController();
		float resultCircle = controllerCirc.calcCircle(5);
		assertEquals(resultCircle, 78.5);

		FormController controllerSquare = new FormController();
		int resultSquare = controllerSquare.calcSquare(4);
		assertEquals(resultSquare, 16);
	}
}
