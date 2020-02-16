package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {

    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`

    @Test
    public void TestCreateDog()
    {
        String expectedName = "Odie";
        Date expectedBirthDate = new Date();

        Dog newDog = AnimalFactory.createDog(expectedName, expectedBirthDate);

        Assert.assertEquals(expectedName, newDog.getName());
        Assert.assertEquals(expectedBirthDate, newDog.getBirthDate());
    }


    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void TestCreateCat()
    {
        String expectedName = "Princess";
        Date expectedBirthDate = new Date();

        Cat newCat = AnimalFactory.createCat(expectedName, expectedBirthDate);

        Assert.assertEquals(expectedName, newCat.getName());
        Assert.assertEquals(expectedBirthDate, newCat.getBirthDate());
    }
}
