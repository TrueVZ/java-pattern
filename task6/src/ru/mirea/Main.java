import Builder.PythonDeveloper;
import Builder.TeamLead;
import abstractFactory.FactoryMaker;
import abstractFactory.Keyboard;
import abstractFactory.Mouse;
import abstractFactory.PeripheryFactory;
import factoryMethod.Developer;
import factoryMethod.DeveloperFactory;
import prototype.DockerImage;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("------------Test factory method------------");
        Developer java = DeveloperFactory.getDeveloper("Java");
        Developer python = DeveloperFactory.getDeveloper("Python");
        java.writeCode();
        python.writeCode();

        System.out.println("------------Test abstract factory------------");
        PeripheryFactory peripheryFactory = FactoryMaker.makeFactory(FactoryMaker.PeripheryType.LOG);
        Keyboard logKeyboard = peripheryFactory.createKeyboard();
        logKeyboard.getDescription();
        peripheryFactory = FactoryMaker.makeFactory(FactoryMaker.PeripheryType.RAZ);
        Mouse razMouse = peripheryFactory.createMouse();
        razMouse.getDescription();

        System.out.println("------------Test builder------------");
        TeamLead teamLead = new TeamLead();
        teamLead.setDeveloperBuilder(new PythonDeveloper());
        teamLead.constructDeveloper();
        System.out.println(teamLead.getDeveloper());

        System.out.println("------------Test prototype------------");
        DockerImage image1 = new DockerImage("redis", "6.2-rc3");
        DockerImage image2 = image1.clone();
        System.out.println("Image1: " + image1.toString());
        System.out.println("Image2: " + image2.toString());
    }
}
