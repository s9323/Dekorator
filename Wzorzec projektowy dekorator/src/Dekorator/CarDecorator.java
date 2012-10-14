package Dekorator;

import Car.PassangerCar;

public abstract class CarDecorator<T> extends PassangerCar {
      public abstract String about();
      public abstract boolean check(T obj);
}
