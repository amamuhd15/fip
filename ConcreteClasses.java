package example;

class Dog implements Animal {
    private String breed;
    private int age;

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public void eat() { System.out.println("Dog eats"); }
    public void sleep() { System.out.println("Dog sleeps"); }
    public void makeSound() { System.out.println("Bark"); }
}

class Car implements Vehicle {
    private String brand;
    private int speed;

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }

    public void start() { System.out.println("Car starts"); }
    public void stop() { System.out.println("Car stops"); }
    public void accelerate() { System.out.println("Car accelerates"); }
}

class Circle extends Shape implements Drawable {
    private double radius;
    private double x;

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public double getX() { return x; }
    public void setX(double x) { this.x = x; }

    public double area() { return Math.PI * radius * radius; }
    public void draw() { System.out.println("Drawing Circle"); }
    public void resize() { System.out.println("Resizing Circle"); }
    public void move() { System.out.println("Moving Circle"); }
}

class BankAccount implements Account {
    private String accountNumber;
    private double balance;

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public double getBalance() { return balance; }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { if (balance >= amount) balance -= amount; }
}

class Laptop implements Device {
    private String brand;
    private String operatingSystem;

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    
    public String getOperatingSystem() { return operatingSystem; }
    public void setOperatingSystem(String operatingSystem) { this.operatingSystem = operatingSystem; }

    public void powerOn() { System.out.println("Laptop powering on"); }
    public void powerOff() { System.out.println("Laptop powering off"); }
    public void reset() { System.out.println("Laptop resetting"); }
}

