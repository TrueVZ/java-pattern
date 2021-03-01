package factoryMethod;

import factoryMethod.Developer;

public class PythonDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Python code....");
    }
}
