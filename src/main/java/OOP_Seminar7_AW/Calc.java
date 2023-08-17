package OOP_Seminar7_AW;

public class Calc {
    private CompNum add(CompNum num1, CompNum num2) {
        double realPart = num1.getReal() + num2.getReal();
        double imaginaryPart = num1.getImag() + num2.getImag();
        return new CompNum(realPart, imaginaryPart);
    }

    private CompNum multiply(CompNum num1, CompNum num2) {
        double realPart = (num1.getReal() * num2.getReal()) - (num1.getImag() * num2.getImag());
        double imaginaryPart = (num1.getReal() * num2.getImag()) + (num1.getImag() * num2.getReal());
        return new CompNum(realPart, imaginaryPart);
    }

    private CompNum divide(CompNum num1, CompNum num2) {
        double denominator = Math.pow(num2.getReal(), 2) + Math.pow(num2.getImag(), 2);
        double realPart = ((num1.getReal() * num2.getReal()) + (num1.getImag() * num2.getImag())) / denominator;
        double imaginaryPart = ((num1.getImag() * num2.getReal()) - (num1.getReal() * num2.getImag())) / denominator;
        return new CompNum(realPart, imaginaryPart);
    }

    public void performCalculations(CompNum num1, CompNum num2) {
        CompNum sum = add(num1, num2);
        CompNum product = multiply(num1, num2);
        CompNum quotient = divide(num1, num2);

        System.out.println("Сложение: " + sum.getReal() + " + " + sum.getImag() + "i");
        System.out.println("Умножение: " + product.getReal() + " + " + product.getImag() + "i");
        System.out.println("Деление: " + quotient.getReal() + " + " + quotient.getImag() + "i");
    }
}
