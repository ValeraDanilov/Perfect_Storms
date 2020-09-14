package perfect.storms.lesson6;

public abstract class Vehicle {

    private int size;
    private int power;

    public Vehicle(int size, int power) {
        this.size = size;
        this.power = power;
    }

    public int getSize() {
        return size;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "size=" + size +
                ", power=" + power +
                '}';
    }
}

/*
    Answer

    1. What is the parent class of all classes? - object.
    2. How do I call the constructor of the parent class? - using super.
    3. Will the parent class constructor be called automatically? - No, it won't automatically. But you have to create it yourself.
    4. Will the parent class constructor be automatically called with arguments? - No, it won't
    5. Can interface type be used for polymorphism? - Yes,

    class A {
    }
    class B extends A {
    }
    class C extends B {
    }

    Is it possible to do this? - No
    B b = new A();

    Is it possible to do this? - Yes
    B b = new B();

    Is it possible to do this? - Yes
    B b = new C();

    Is it possible to do this? - Yes
    Object obj = new A();
    Object obj1 = new B();
    Object obj2 = new C();
 */
