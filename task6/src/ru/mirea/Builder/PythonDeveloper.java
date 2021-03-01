package Builder;

public class PythonDeveloper extends DeveloperBuilder{
    @Override
    public void buildLanguage() {
        developer.setProgrammingLanguage("Python");
    }

    @Override
    public void buildExperience() {
        developer.setExperience("Middle");
    }


}
