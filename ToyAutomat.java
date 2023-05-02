import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import Toys.*;

public class ToyAutomat {

    static Random rand = new Random();
    static int randNumb;
    private static List<Toy> prizes = new ArrayList<>();
    private static List<Toy> lottery = new ArrayList<>();

    public static Toy createToy(int constrPr, int softPr, int ecectroPr) {

        if (constrPr + softPr + ecectroPr > 100) {
            int sum = constrPr + softPr + ecectroPr;
            constrPr = constrPr * 100 / sum;
            softPr = softPr * 100 / sum;
            ecectroPr = ecectroPr * 100 / sum;
        }
        randNumb = rand.nextInt(1, 101);
        if (randNumb <= constrPr) {
            return new ConstructorToy(ToysTypes.getConstructorToy());
        } else if (randNumb <= constrPr + softPr) {
            return new SoftToy(ToysTypes.getSoftToy());
        } else if (randNumb <= constrPr + softPr + ecectroPr) {
            return new ElectroToy(ToysTypes.getElectroToy());
        } else {
            return new Sweet(); // оставшаяся вероятность
        }
    }

    public static String getToyfromLott() {
        String answer="";
        if (lottery.size() > 0) {
            int index = rand.nextInt(lottery.size());
            Toy toyToMove = lottery.get(index);
            answer=toyToMove.toString()+" Добавлена в призы!";
            lottery.remove(index);
            prizes.add(toyToMove);
        }
        else answer="Лотерея пуста!";
        return answer;
    }

    public static String getToyfromProbability() {
        Toy presentToy = createToy(ConstructorToy.getPr(), SoftToy.getPr(), ElectroToy.getPr());
        prizes.add(presentToy);
        return presentToy.toString()+" Добавлена в призы!";
    }

    public static void addToytoLott(int count, String toyclass){
        for (int index = 0; index < count; index++) {
            if (toyclass.equals("SoftToy")){
                lottery.add(new SoftToy(ToysTypes.getSoftToy()));
            }
            else if (toyclass.equals("Constructor")){
                lottery.add(new ConstructorToy(ToysTypes.getConstructorToy()));
            }
            else if (toyclass.equals("ElectroToy")){
                lottery.add(new ElectroToy(ToysTypes.getElectroToy()));
            }
            else lottery.add(new Sweet());
        }
    }
    public static String getprizes(){
        String str="";
        for (Toy toy : prizes) {
            str += toy.toString() + "\n";
        }
        return str;
    }

    
    public static void setProbs(int c, int  s, int e){
        SoftToy.setProbability(s);
        ElectroToy.setProbability(e);
        ConstructorToy.setProbability(c);
        
    }


}
