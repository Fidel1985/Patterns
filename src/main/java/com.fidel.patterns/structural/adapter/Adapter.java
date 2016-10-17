package com.fidel.patterns.structural.adapter;

// Адаптер назовні виглядає як нові євророзетки, шляхом наслідування прийнятного у системі інтерфейсу
public class Adapter implements INewElectricitySystem {
    // Але всередині він таки знає, що коїлося в СРСР
    private final OldElectricitySystem adaptee;
    public Adapter(OldElectricitySystem adaptee) {
        this.adaptee = adaptee;
    }

    // А тут відбувається вся магія - наш Адаптер «перекладає» функціональність із нового стандарту на старий
    @Override
    public String matchWideSocket() {
        // Якщо б була різниця в напрузі (не 220V) то тут ми б помістили трансформатор
        return adaptee.matchThinSocket();
    }
}
