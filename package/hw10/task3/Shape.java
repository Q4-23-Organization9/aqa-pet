package hw10.task3;

import java.util.Objects;

public abstract class Shape {

    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    protected abstract void printInfo();
    protected abstract double calculateArea();
    protected abstract double calculatePerimeter();
    protected abstract void paint();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape shape)) return false;
        return Objects.equals(color, shape.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }

}
