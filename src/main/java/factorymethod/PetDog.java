package factorymethod;

public class PetDog implements IPet {

    @Override
    public String makeSound() {
        return "au au";
    }
}
