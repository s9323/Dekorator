package Dekorator;

import Car.Samochod_osobowy;

public abstract class Dekorator_samochodu<T> extends Samochod_osobowy {
      public abstract String about();
      public abstract boolean check(T obj);
}
