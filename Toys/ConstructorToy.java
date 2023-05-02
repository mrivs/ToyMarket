package Toys;

public class ConstructorToy extends Toy {

    private String type;
    private static int probability = 30; 
    private final String className = "Constructor"; // финальное имя класса

    public ConstructorToy(String type) {
        super();
        this.type = type;
        this.proba=ConstructorToy.probability;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public static void setProbability(int pr) {
        ConstructorToy.probability = pr;
    }


    static public int getPr(){
        return ConstructorToy.probability;
    }
    @Override
    public String getClassName() {
        return this.className;
    }

    @Override
    public String toString() {
        return super.toString()+" "+type;
    }
}