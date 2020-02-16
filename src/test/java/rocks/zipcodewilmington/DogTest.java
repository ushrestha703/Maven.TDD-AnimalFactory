package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
     @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`

    @Test
    public void constructorTest() {
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog newDog = new Dog(givenName, givenBirthDate, givenId);

        String retrievedName = newDog.getName();
        Date retrievedBirthDate = newDog.getBirthDate();
        Integer retrievedId = newDog.getId();

        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    // TODO - Create tests for `speak`

    @Test
    public void speakTest() {
        Dog newDog = new Dog(null, null, null);
        String expected = "bark!";
        String actual = newDog.speak();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`

    @Test
    public void setBirthDateTest() {
        Dog newDog = new Dog(null, null, null);
        Date birthDate = new Date();
        newDog.setBirthDate(birthDate);
        Date expected = birthDate;
        Date actual = newDog.getBirthDate();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void eat(Food food)`

    @Test
    public void eatTest() {
        Dog newDog = new Dog(null, null, null);
        Food kibble = new Food();
        newDog.eat(kibble);
        Integer expected = 1;
        Integer actual = newDog.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Integer getId()`

    @Test
    public void getIdTest() {
        Dog newDog = new Dog(null, null, 1234);
        Integer expected = 1234;
        Integer actual = newDog.getId();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
    public void checkAnimalInheritanceTest() {
        Dog newDog = new Dog(null, null, null);
        Assert.assertTrue(newDog instanceof Animal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void checkMammalInheritanceTest() {
        Dog newDog = new Dog(null, null, null);
        Assert.assertTrue(newDog instanceof Mammal);
    }

}
