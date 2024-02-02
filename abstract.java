
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape{
    void draw() {
        System.out.println("Drawing a Circle");//implementation of abstract method
    }
}

 class Abstract {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();

    }
}
