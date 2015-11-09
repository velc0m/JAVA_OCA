package Enums;

/**
 * Created by MaxiM on 08.11.2015.
 */
public class Main {
    static EnumExample myEnum;
    static EnumExample myEnum_2;

    public static void main(String[] args) {

        System.out.println(myEnum.MERCEDES);

        for (EnumExample exp : EnumExample.values()) {
            System.out.println(exp + " - " + exp.getEngine() + " - " + exp.getManufacture());
        }

        System.out.println("!!!! - " + myEnum.MOSKVICH.getEngine());

        System.out.println("Enum_2 - " + myEnum_2.AUDI.getEngine() + myEnum_2.AUDI.getManufacture());

    }
}
