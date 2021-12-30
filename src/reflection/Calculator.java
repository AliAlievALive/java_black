package reflection;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calculator {
    void sum(int a, int b) {
        int result = a + b;
        System.out.println("Sum " + a + " and " + b + " = " + result);
    }
    void subtraction(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction " + a + " and " + b + " = " + result);
    }
    void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication " + a + " and " + b + " = " + result);
    }
    void division(int a, int b) {
        int result = a / b;
        System.out.println("Division " + a + " and " + b + " = " + result);
    }
}

class TestCalc {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("excluded_files\\test100.txt"))) {
            String methodName = reader.readLine();
            String firstArg = reader.readLine();
            String secondArg = reader.readLine();

            Calculator calculator = new Calculator();
            Class cl = calculator.getClass();
            Method method = null;

            Method[] methods = cl.getDeclaredMethods();
            for (Method myMethod : methods) {
                if (myMethod.getName().equals(methodName)) {
                    method = myMethod;
                }
            }

            method.invoke(calculator, Integer.parseInt(firstArg),
                    Integer.parseInt(secondArg));

        } catch (IllegalAccessException | InvocationTargetException | IOException e) {
            e.printStackTrace();
        }
    }
}