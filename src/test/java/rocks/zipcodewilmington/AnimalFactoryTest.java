package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)
    @Test
    public void createDogTest() {
        //Given (Dog information)
        String name = "Fido";
        Date birthDate = new Date();
        Integer givenId = 1;

        // When (A dog is created)
        Dog dog = new Dog(name, birthDate, givenId);

        // When (Received data for a dog)
        String receivedName = dog.getName();
        Date receivedBirthDate = dog.getBirthDate();
        Integer receivedId = dog.getId();

        // Then (Information that we expect given the information to match retrieved data)
        Assert.assertEquals(name, receivedName);
        Assert.assertEquals(birthDate, receivedBirthDate);
        Assert.assertEquals(givenId, receivedId);

    }

    @Test
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    public void createCatTest() {
        // Given (Cat information)
        String name = "Felix";
        Date birthDate = new Date();
        Integer givenId = 2;

        // When (A cat is created)
        Cat cat = new Cat(name, birthDate, givenId);

        // When (Received data for a cat
        String receivedName = cat.getName();
        Date receivedBirthDate = cat.getBirthDate();
        Integer receivedId = cat.getId();

        // Then (Information expected to received from matched data
        Assert.assertEquals(name, receivedName);
        Assert.assertEquals(birthDate, receivedBirthDate);
        Assert.assertEquals(givenId, receivedId);
    }
}