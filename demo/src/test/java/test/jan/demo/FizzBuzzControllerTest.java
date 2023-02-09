package test.jan.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FizzBuzzControllerTest {
	private FizzBuzzController fbc = new FizzBuzzController();
	@Test
	void contextLoads() {
		assertTrue(true);
	}

	@Test
	void fizzBuzzTest10(){
		String[] correctFizzBuzz = {"1","2","Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"};

		List<String> fizzBuzz = fbc.fizzbuzz(correctFizzBuzz.length);
		List<String> correctFizzBuzzList = new ArrayList<String>();
		for(String s:correctFizzBuzz){
			correctFizzBuzzList.add(s);
		}
		
		assertTrue((correctFizzBuzzList.containsAll(fizzBuzz) && fizzBuzz.containsAll(correctFizzBuzzList)));
	}

	@Test
	void fizzBuzzTest15(){
		String[] correctFizzBuzz = {"1","2","Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"};
		
		List<String> fizzBuzz = fbc.fizzbuzz(correctFizzBuzz.length);
		List<String> correctFizzBuzzList = new ArrayList<String>();
		for(String s:correctFizzBuzz){
			correctFizzBuzzList.add(s);
		}
		
		assertTrue((correctFizzBuzzList.containsAll(fizzBuzz) && fizzBuzz.containsAll(correctFizzBuzzList)));
	}
	/** 
	 * Man könnte auch eine Methode schreiben, die dynamisch die korrekte Ausgabe für den FizzBuzzController findet und überprüft. Dann würde man aber FizzBuzz erneut implementieren. Nicht gerade TDD
	 */
}
