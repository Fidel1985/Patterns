package com.fidel.patterns.structural.adapter;

/**
 * Adapter. Intent. Convert the interface of a class into another interface clients expect. Adapter lets classes work
 * together that couldn't otherwise because of incompatible interfaces.
 */
public class AdapterDemo {
    public static void main(String[] args) {
        // 1)
        // Ми можемо користуватися новою системою без проблем
        NewElectricitySystem newElectricitySystem = new NewElectricitySystem();
        ElectricityConsumer.chargeNotebook(newElectricitySystem);

        // 2)
        // Ми повинні адаптуватися до старої системи, використовуючи Адаптер
        OldElectricitySystem oldElectricitySystem = new OldElectricitySystem();
        Adapter adapter = new Adapter(oldElectricitySystem);
        ElectricityConsumer.chargeNotebook(adapter);
    }

}
