package Toys;
public class SoftToy extends Toy {

    private String softToyName;
    private static int probability = 60;
     
    private final String className = "SoftToy"; 

    public SoftToy(String softToyName) {
        super();
        this.softToyName = softToyName; 
        this.proba=SoftToy.probability;
    }

    public String getSoftToyName() {
        return softToyName;
    }

    public void setSoftToyName(String softToyName) {
        this.softToyName = softToyName;
    }

    public static void setProbability(int pr) {
        SoftToy.probability = pr;
    }

    public static int getPr() {
        return SoftToy.probability;
    }

    @Override
    public String getClassName() {
        return this.className;
    }

    @Override
    public String toString() {
       
        return super.toString()+""+softToyName;
    }


}
