package package2;

import package1.Calculator;

public class package_of_calculator {
    public static void main(String[] args) {
        // Create object of Calculator from package1
        Calculator calc = new Calculator();
        calc.runCalculator();  // Run the calculator
    }
}
