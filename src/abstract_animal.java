public class abstract_animal extends Animals{

    public abstract_animal(String[] array){
        super(array);
        System.out.println("Hello from abstract_animal");
    }

    final Integer numberlegs(Integer numbers){
        return numbers;
    }

}
