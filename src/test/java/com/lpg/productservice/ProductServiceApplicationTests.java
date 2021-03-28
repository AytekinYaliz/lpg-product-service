package com.lpg.productservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ProductServiceApplicationTests {

	Calculator calculator = new Calculator();

	// @Test
	// void contextLoads() {
	// }

	@Test
	void itShouldAdd() {
		int result = calculator.add(12, 13);

		assertEquals(25, result);
	}

}


class Calculator {
	int add(int a, int b) {
		return a + b;
	}
}