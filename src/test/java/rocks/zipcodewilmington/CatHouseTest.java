package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {



    @Before
    public void BeforeTest() {
        CatHouse.clear();
    }
    
    // TODO - Create tests for `void add(Cat cat)`

    @Test
    public void addCatTest() {
        Cat newCat = new Cat("Princess", new Date(), 1234);
       CatHouse.add(newCat);
        Assert.assertEquals(newCat, CatHouse.getCatById(1234));
    }

    // TODO - Create tests for `void remove(Integer id)`

    @Test
    public void removeCatById() {
        Cat newCat = new Cat("Princess", new Date(), 1234);
        CatHouse.add(newCat);
        CatHouse.remove(1234);
        Assert.assertEquals(null, CatHouse.getCatById(1234));
    }

    // TODO - Create tests for `void remove(Cat cat)`

    @Test
    public void removeCatTest() {
        Cat newCat = new Cat("Princess", new Date(), 1234);
        CatHouse.add(newCat);
        CatHouse.remove(newCat);
        Assert.assertEquals(null, CatHouse.getCatById(1234));
    }
    
    // TODO - Create tests for `Cat getCatById(Integer id)`

    @Test
    public void getCatByIdTest() {
        Cat newCat = new Cat("Princess", new Date(), 1234);
        CatHouse.add(newCat);
        Cat testCat = CatHouse.getCatById(1234);
        Assert.assertEquals(newCat, testCat);
    }
    
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void getNumberOfCats() {
        Cat newCat = new Cat("Princess", new Date(), 1234);
        CatHouse.add(newCat);
        Cat newCat2 = new Cat("Tom", new Date(), 7890);
        CatHouse.add(newCat2);
        Integer expected = 2;
        Integer actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }
    
}
