package example;

abstract class Person {
    protected String name;
    protected int age;

    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    abstract void work();
}

abstract class Shape {
    protected String color;
    protected boolean filled;

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }

    abstract double area();
}

abstract class Machine {
    protected String model;
    protected String manufacturer;

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    
    public String getManufacturer() { return manufacturer; }
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }

    abstract void operate();
}

