package Builder;

public class TeamLead {
    private DeveloperBuilder developerBuilder;

    public void setDeveloperBuilder(DeveloperBuilder db) {
        developerBuilder = db;
    }
    public Developer getDeveloper(){
        return developerBuilder.getDeveloper();
    }

    public void constructDeveloper(){
        developerBuilder.createDeveloper();
        developerBuilder.buildExperience();
        developerBuilder.buildLanguage();
    }
}
