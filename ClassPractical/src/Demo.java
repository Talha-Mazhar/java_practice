class Calculator {
    int a;

    public int add(int n1, int n2) {
        int r = n1 + n2;
        return r;
    }
}

public class Demo {

    public static void main(String[] args) {

        int num1 = 4; // primitive type
        int num2 = 5;

        Calculator calc = new Calculator(); // non-primitive type

        int result = calc.add(num1, num2);

        System.out.println(result);
    }

}