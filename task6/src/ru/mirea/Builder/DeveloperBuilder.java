package Builder;

public abstract class DeveloperBuilder {
    protected Developer developer;

    public Developer getDeveloper(){ return developer;}
    public void createDeveloper(){
        developer = new Developer();
    }

    public abstract void buildLanguage();
    public abstract void buildExperience();

}
