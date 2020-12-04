package CovidSpreadTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import CovidSpreadSimulation.City;
import CovidSpreadSimulation.Person;

class PersonTest {

	@Test
	public void testBasicPerson() {
		Person person = new Person(1500, 1500);
		assertEquals(15, person.getSize(), 6);
		assertEquals(0,person.getxVel(), 2.5);
		assertEquals(0,person.getyVel(), 2.5);
	}
	
	@Test
	public void testCity() {
		City city=new City(1500, 1500);
		assertEquals(200,city.findPopulation().length);
	}
		
	
	@Test
	public void testpopulation() {
        Person[] pop = new Person[200];

		for (int i = 0; i < pop.length; i++)
			pop[i] = new Person(1500, 1500);
		pop[0].setSick();
	}
		
	

}
