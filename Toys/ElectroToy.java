package Toys;

public class ElectroToy extends Toy{
    private String type;
    private static int probability = 10; 
    private final String className = "ElectroToy"; 
    
    public ElectroToy(String type) {
        super();
        this.type = type;
        this.proba=ElectroToy.probability;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public static void setProbability(int pr) {
        ElectroToy.probability = pr;
    }

    static public int getPr(){
        return ElectroToy.probability;
    }
    
    @Override
    public int getProba() {
        return ElectroToy.probability;
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
