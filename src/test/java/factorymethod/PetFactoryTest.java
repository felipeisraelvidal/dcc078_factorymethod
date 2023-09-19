package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PetFactoryTest {

    @Test
    void shouldReturnExceptionForNonExistentPet() {
        try {
            IPet pet = PetFactory.getPet("Chicken");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Pet inexistente", e.getMessage());
        }
    }

    @Test
    void shouldReturnExceptionForInvalidPet() {
        try {
            IPet pet = PetFactory.getPet("Bird");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Pet inválido", e.getMessage());
        }
    }

}
