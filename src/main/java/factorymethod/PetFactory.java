package factorymethod;

public class PetFactory {

    public static IPet getPet(String petType) {
        Class _class = null;
        Object _object = null;
        try {
            _class = Class.forName("factorymethod.Pet" + petType);
            _object= _class.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Pet inexistente");
        }

        if (!(_object instanceof IPet)) {
            throw new IllegalArgumentException("Pet inválido");
        }

        return (IPet) _object;
    }

}
