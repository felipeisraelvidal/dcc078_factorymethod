package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PetDogTest {

    @Test
    void shouldPetMakeSound() {
        IPet pet = PetFactory.getPet("Dog");
        assertEquals("au au", pet.makeSound());
    }

}
