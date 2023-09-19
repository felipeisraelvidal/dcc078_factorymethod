package factorymethod;

public class PetCat implements IPet {

    @Override
    public String makeSound() {
        return "miau";
    }

}
