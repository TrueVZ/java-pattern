package factoryMethod;

import factoryMethod.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java code...");
    }
}
