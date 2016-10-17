package com.fidel.patterns.structural.adapter;

public class ElectricityConsumer {
    // Зарядний пристрій розуміє тільки нову систему
    public static void chargeNotebook(INewElectricitySystem electricitySystem) {
        System.out.println(electricitySystem.matchWideSocket());
    }
}
