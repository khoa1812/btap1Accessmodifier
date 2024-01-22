package btap1;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(5);
        Circle c3 = new Circle(2);

        System.out.println("Diện tích của các hình tròn lần lượt là: " + "\n Hình 1: " + c1.area() + "\n hình 2: " + c2.area() + "\n Hình 2: " + c3.area());
        System.out.println("Chu vi của các hình tròn lần lượt là: " + "\n Hình 1: " + c1.perimeter() + "\n hình 2: " + c2.perimeter() + "\n Hình 2: " + c3.perimeter());
        System.out.println("Số đối tượng được tạo ra: " + Circle.getCount());
        System.out.println("Hình tròn có bán kính lớn nhất có bán kính là: " + Circle.getMaxRadius());
        System.out.println("Tổng diện tích các hình tròn được tạo rea là: " + Circle.getTotalArea());

    }
}
