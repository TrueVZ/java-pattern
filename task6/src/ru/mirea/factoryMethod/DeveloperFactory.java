package factoryMethod;

public class DeveloperFactory {
    public static Developer getDeveloper(String type){
        if (type.equals("Java")){
            return new JavaDeveloper();
        } else {
            return new PythonDeveloper();
        }
    }
}
