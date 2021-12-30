package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class emplClass = Class.forName("reflection.Employee");
//        Class emplClass2 = Employee.class;
//        Employee emp = new Employee();
//        Class emplClass3 = emp.getClass();

        Field someField = emplClass.getField("id");
        System.out.println("Type of id field = " + someField.getType());
        System.out.println("------------------------------------------");

        Field[] fields = emplClass.getFields();
        for (Field field : fields) {
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }
        System.out.println("*************************");

        Field[] allFields = emplClass.getDeclaredFields();
        for (Field field : allFields) {
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }
        System.out.println("*************************");

        Method someMethod1 = emplClass.getMethod("increaseSalary");
        System.out.println("Return type of method increaseSalary = " +
                someMethod1.getReturnType() + ", parameter types = " + Arrays.toString(someMethod1.getParameterTypes()));
        System.out.println("*************************");

        Method someMethod2 = emplClass.getMethod("setSalary", double.class);
        System.out.println("Return type of method setSalary = " +
                someMethod2.getReturnType() + ", parameter types = " + Arrays.toString(someMethod2.getParameterTypes()));
        System.out.println("*************************");

        Method[] methods = emplClass.getMethods();
        for (Method method : methods) {
            System.out.println("Name of method = " + method.getName() +
                    ", return type = " + method.getReturnType() +
                    ", parameter types = " +
                    Arrays.toString(method.getParameterTypes()));
        }
        System.out.println("*************************");

        Method[] allMethods = emplClass.getDeclaredMethods();
        for (Method method : allMethods) {
            System.out.println("Name of method = " + method.getName() +
                    ", return type = " + method.getReturnType() +
                    ", parameter types = " +
                    Arrays.toString(method.getParameterTypes()));
        }
        System.out.println("*************************");

        Method[] allMethods2 = emplClass.getDeclaredMethods();
        for (Method method : allMethods2) {
            if (Modifier.isPublic(method.getModifiers())) {
                System.out.println("Name of method = " + method.getName() +
                        ", return type = " + method.getReturnType() +
                        ", parameter types = " +
                        Arrays.toString(method.getParameterTypes()));
            }
        }
        System.out.println("*************************");

        Constructor constructor1 = emplClass.getConstructor();
        System.out.println("Constructor has " + constructor1.getParameterCount() +
                " parameters, their types are: " +
                Arrays.toString(constructor1.getParameterTypes()));
        System.out.println("*************************");

        Constructor constructor2 = emplClass.getConstructor(int.class, String.class, String.class);
        System.out.println("Constructor has " + constructor2.getParameterCount() +
                " parameters, their types are: " +
                Arrays.toString(constructor2.getParameterTypes()));
        System.out.println("*************************");

        Constructor[] constructors = emplClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("Constructor " + constructor.getName() +
                    "Constructor has " + constructor.getParameterCount() +
                    " parameters, their types are: " +
                    Arrays.toString(constructor.getParameterTypes()));
        }
    }
}
