package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PetCatTest {

    @Test
    void shouldPetMakeSound() {
        IPet pet = PetFactory.getPet("Cat");
        assertEquals("miau", pet.makeSound());
    }

}
