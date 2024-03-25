public class Novel extends Book {

    private String mainHero;
    private String events;

    public Novel(String name,String mainHero,String events,String nameOfAuthor,int yearOfCreating) {

        super(name,mainHero,yearOfCreating);
    }

    public Novel(String nameOfFantastic2, String nameOfAuthor2, int yearOfCreating2, String world2, String uniqueElement2, String theCentralIdea2) {
    }

    public String getEvents() {
        return events;
    }

    public void setEvents(String events) {
        this.events = events;
    }

    public String getMainHero() {
        return mainHero;
    }

    public void setMainHero(String mainHero) {
        this.mainHero = mainHero;
    }


    public static void getInfo() {
        System.out.println("Роман");
    }
}
