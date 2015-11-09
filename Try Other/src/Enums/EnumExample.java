package Enums;

/**
 * Created by MaxiM on 08.11.2015.
 */
enum EnumExample {

    BMW(3.0),
    MERCEDES(5.0),
    AUDI(2.5),
    LADA(1.2) {
        @Override
        String getManufacture() {
            return "It is RUSSIA";
        }
    },
    MOSKVICH(1.0) {
        @Override
        String getManufacture() {
            return "It is RUSSIA";
        }
    };

    EnumExample(double engine) {
        this.engine = engine;
    }

    private double engine;

    public double getEngine() {
        return engine;
    }

        String getManufacture() {
        return "It is west";
    }
}
