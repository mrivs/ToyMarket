package Toys;

public class Sweet extends Toy {
    
    private final String className = "Sweet"; 
    public Sweet() {
        super();   
    }
    @Override
    public String getClassName() {
        return this.className;
    }
    @Override
    public String toString() {
        return  "ID=" + this.getId() +" Конфета!";
    }

}
