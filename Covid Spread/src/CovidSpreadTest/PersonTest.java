package CovidSpreadTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import CovidSpreadSimulation.Person;

class PersonTest {

	@Test
	public void testBasicPerson() {
		Person person = new Person(1500, 1500);
		person.getSize();
		assertEquals(15, person.getSize(), 6);
		person.getxVel();
	}
	

	@Test
	public void testCityBasic() {
		Person person = new Person(1500, 1500);
		collided(person);
		person.getSize();
		assertEquals(15, person.getSize(), 6);
		person.getxVel();
	}

}
