public class Detective extends Book {
    private String theCrimeUnderInvestigation;
    private String theMainSuspects;
    private String plotDevelopment;

    public Detective(String nameOfFantastic1, String nameOfAuthor1, int yearOfCreating1, String world1, String uniqueElement1, String theCentralIdea1) {
    }

    public String getPlotDevelopment() {
        return plotDevelopment;
    }

    public void setPlotDevelopment(String plotDevelopment) {
        this.plotDevelopment = plotDevelopment;
    }

    public String getTheCrimeUnderInvestigation() {
        return theCrimeUnderInvestigation;
    }

    public void setTheCrimeUnderInvestigation(String theCrimeUnderInvestigation) {
        this.theCrimeUnderInvestigation = theCrimeUnderInvestigation;
    }

    public String getTheMainSuspects() {
        return theMainSuspects;
    }

    public void setTheMainSuspects(String theMainSuspects) {
        this.theMainSuspects = theMainSuspects;
    }

    public Detective(String name) {

        super(name);
    }
    public static void getInfo() {
        System.out.println("Детективы");
    }
}
