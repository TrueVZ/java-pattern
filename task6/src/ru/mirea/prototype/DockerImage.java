package prototype;

public class DockerImage implements Cloneable{
    protected String name;
    protected String tag;

    @Override
    public DockerImage clone() throws CloneNotSupportedException{
        DockerImage copy = (DockerImage) super.clone();
        return copy;
    }

    public DockerImage(String name, String tag) {
        this.name = name;
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "DockerImage{" +
                "name='" + name + '\'' +
                ", tag='" + tag + '\'' +
                '}';
    }
}
