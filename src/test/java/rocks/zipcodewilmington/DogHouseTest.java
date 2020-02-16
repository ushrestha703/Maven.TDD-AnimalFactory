package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Odie";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Before
    public void BeforeTest() {
        DogHouse.clear();
    }

    // TODO - Create tests for `void add(Dog dog)`

    @Test
    public void addDogTest() {
        Dog newDog = new Dog("Odie", new Date(), 1234);
        DogHouse.add(newDog);
        Assert.assertEquals(newDog, DogHouse.getDogById(1234));
    }

    // TODO - Create tests for `void remove(Integer id)`

    @Test
    public void removeDogById() {
        Dog newDog = new Dog("Odie", new Date(), 1234);
        DogHouse.add(newDog);
        DogHouse.remove(1234);
        Assert.assertEquals(null, DogHouse.getDogById(1234));
    }

    // TODO - Create tests for `void remove(Dog dog)`

    @Test
    public void removeDogTest() {
        Dog newDog = new Dog("Odie", new Date(), 1234);
        DogHouse.add(newDog);
        DogHouse.remove(newDog);
        Assert.assertEquals(null, DogHouse.getDogById(1234));
    }

    // TODO - Create tests for `Dog getDogById(Integer id)`

    @Test
    public void getDogByIdTest() {
        Dog newDog = new Dog("Odie", new Date(), 1234);
        DogHouse.add(newDog);
        Dog testDog = DogHouse.getDogById(1234);
        Assert.assertEquals(newDog, testDog);
    }

    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void getNumberOfDogs() {
        Dog newDog = new Dog("Odie", new Date(), 1234);
        DogHouse.add(newDog);
        Dog newDog2 = new Dog("Oakley", new Date(), 7890);
        DogHouse.add(newDog2);
        Integer expected = 2;
        Integer actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }
}
