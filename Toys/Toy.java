package Toys;
public abstract class Toy {
    private int id;
    private static int nextId = 1; // для автоматической генерации id
    private static int probability = 0; // статическая вероятность выпадения
    private final String className = "Toy"; // финальное имя класса
    protected int proba = 0;

    public Toy() {
        this.id = nextId;
        nextId++;
    }

    public int getId() {
        return this.id;
    }

    public int getProba() {
        return this.proba;
    }

    public String getClassName() {
        return this.className;
    }

    public static void setProbability(int probability) {
        Toy.probability = probability;
    }

    @Override
    public String toString() {
        return "ID=" + this.id + " класс " +  getClassName()+" " +"Игра в вероятность: "+getProba()+" % тип: ";
    }
    
}

