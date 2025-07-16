package example;

public class root {


    public static void main(String[] args) {
        // Animal interface via Dog
        Dog dog = new Dog();
        dog.setBreed("Labrador");
        dog.setAge(5);
        System.out.println("Dog breed: " + dog.getBreed());
        dog.eat();
        dog.makeSound();

        // Vehicle interface via Car
        Car car = new Car();
        car.setBrand("Toyota");
        car.setSpeed(100);
        System.out.println("Car brand: " + car.getBrand());
        car.start();
        car.accelerate();

        // Drawable + Shape abstract class via Circle
        Circle circle = new Circle();
        circle.setRadius(3.0);
        circle.setColor("Red");
        System.out.println("Circle area: " + circle.area());
        circle.draw();
        circle.move();

        // Account interface via BankAccount
        BankAccount account = new BankAccount();
        account.setAccountNumber("123456");
        account.deposit(500);
        System.out.println("Account balance: $" + account.getBalance());
        account.withdraw(100);
        System.out.println("Balance after withdrawal: $" + account.getBalance());

        // Device interface via Laptop
        Laptop laptop = new Laptop();
        laptop.setBrand("Dell");
        laptop.setOperatingSystem("Windows 11");
        laptop.powerOn();
        laptop.reset();
        laptop.powerOff();
    
}

    
}
