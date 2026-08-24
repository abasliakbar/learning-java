public enum Day {
    SUNDAY("WORK"),
    MONDAY("WORK"),
    THUSDAY("REST");


    private String work;

    Day(String work) {
        this.work = work;
    }
    public String getWork(){
        return work;
    }
}
