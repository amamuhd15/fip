package example;

interface Animal {
    void eat();
    void sleep();
    void makeSound();
}

interface Vehicle {
    void start();
    void stop();
    void accelerate();
}

interface Drawable {
    void draw();
    void resize();
    void move();
}

interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

interface Device {
    void powerOn();
    void powerOff();
    void reset();
}
