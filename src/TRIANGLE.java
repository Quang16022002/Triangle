public class TRIANGLE {
    public static String classifyTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "notATriangle";
        } else if (a == b && b == c) {
            return "Equilateral";
        } else if (a == b || b == c || a == c) {
            return "Isosceles";
        } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            return "RightTriangle";
        } else {
            return "Scalene";
        }
    }

    public static void main(String[] args) {
        int a = 3, b = 4, c = 5;
        System.out.println("Classification: " + classifyTriangle(a, b, c));
    }
}
