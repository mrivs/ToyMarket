
import java.util.Random;

public class ToysTypes {

    static enum constructors {
        CREATIVE_BRICKS,
        CITY_AIRPORT,
        FRIENDS_RESORT,
        TAJ_MAHAL,
        MILLENNIUM_FALCON,
        NINJAGO_DOCKS,
        TECHNIC_CHIRON,
        ARCHITECTURE_ARCH,
        HARRY_POTTER_CASTLE,
        HEROES_HELICARRIER
    }

    static enum softToys {
        TEDDY_BEAR,
        BUNNY,
        HORSE,
        DOG,
        CAT,
        ELEPHANT,
        MONKEY,
        LION,
        TIGER,
        PANDA
    }

    static enum electroToys {
        RC_CAR,
        RC_BOAT,
        RC_PLANE,
        RC_HELICOPTER,
        DRONE,
        RC_TRUCK,
        RC_TANK,
        RC_SUBMARINE,
        RC_BATTLE_BOT,
        RC_SPEED_BOAT
    }

    private static <T extends Enum<T>> String getValue(Class<T> enumClass) {
        T[] values = enumClass.getEnumConstants();
        int index = new Random().nextInt(values.length);
        return values[index].toString();
    }

    public static String getSoftToy(){
        return getValue( softToys.class);
    }
    
    public static String getElectroToy(){
        return getValue( electroToys.class);
    }

    public static String getConstructorToy(){
        return getValue( constructors.class);
    }

}
