public class Main {
    private static String getCircumferenceAndArea(Shape shape){
        return "The Circumference of the " + shape.getClass() + " = " + shape.getCircumference() + "\n" +
                "The Area of the " + shape.getClass() + " = " + shape.getArea();

    }
    public static void main(String[] args) {
        Circle cr = new Circle(4);
        Rectangle r = new Rectangle(4, 5);
        Square sq = new Square(4);
        Triangle tr = new Triangle(3,4,5);

        System.out.println(getCircumferenceAndArea(cr));
        System.out.println(getCircumferenceAndArea(r));
        System.out.println(getCircumferenceAndArea(sq));
        System.out.println(getCircumferenceAndArea(tr));
    }
}