public class Fantastic extends Book{
private String world;
private String uniqueElements;
private String theCentralIdea;

    public String getTheCentralIdea() {
        return theCentralIdea;
    }

    public void setTheCentralIdea(String theCentralIdea) {
        this.theCentralIdea = theCentralIdea;
    }

    public String getUniqueElements() {
        return uniqueElements;
    }

    public void setUniqueElements(String uniqueElements) {
        this.uniqueElements = uniqueElements;
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }

    public Fantastic(String nameOfFantastic, String nameOfAuthor, int yearOfCreating, String world, String uniqueElement, String theCentralIdea) {
        super();
    }


    public static void getInfo() {
        System.out.println("Фантастика");
    }
}
