class Vehicle {
    String brand = "Ford";

    public void honk() {
        System.out.println("Beep beep!");
    }
}

class Car extends Vehicle {
    String model = "Mustang";

    public static void main(String[] args) {
        Car myCar = new Car();

                myCar.honk();

        
        System.out.println(myCar.brand + " " + myCar.model);
    }
}
