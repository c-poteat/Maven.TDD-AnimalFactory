package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    Cat cat1;
    Cat cat2;

    @Before
    public void setUp() {
        CatHouse green = new CatHouse();
        cat1 = new Cat("", new Date(),  2);

        cat2 = new Cat("", new Date(),  3);

        CatHouse.add(cat1);

        CatHouse.add(cat2);
    }

    @After

    public void tearDown() {

        CatHouse.clear();
    }

    @Test
    public void addCatTest() {
        // given
        Cat cat = new Cat ("Kitty", new Date(), 1);

        // when
        CatHouse.add(cat);
        Cat actual = CatHouse.getCatById(cat.getId());

        // then
        Assert.assertEquals(cat, actual);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeCatIdTest() {
        // Given
        CatHouse.remove(2);

        // Expected

        Integer actual = CatHouse.getNumberOfCats();

        Integer expected = 1;
        Assert.assertEquals(expected, actual);

    }
    // TODO - Create tests for `void remove(Cat cat)`

    @Test
    public void removeCatTest() {
        // Given
        CatHouse.remove(cat1);

        // Expected

        Integer actual = CatHouse.getNumberOfCats();

        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIdTest() {
        //When
        Cat actual = CatHouse.getCatById(2);

        // Expected
        Cat expected = cat1;

        Assert.assertEquals(expected, actual);

    }


    // TODO - Create tests for `Integer getNumberOfCats()`
}
