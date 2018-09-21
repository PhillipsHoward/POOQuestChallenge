public class Wilder {

    //Initialization variables
    private String firstname;
    private boolean aware;

    //Constructor

    public Wilder (String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    //Getters and Setters

    public String getFirstName() {
        return this.firstname;
    }

    public boolean isAware() {
        return this.aware;
    }
    
    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    //Methods
    
    public String whoAmI() {
        String result = "";
        result = "Je m'appelle " + getFirstName();
        if(isAware()) {
            result += " et je suis aware.";
        } else {
            result += " et je ne suis pas aware.";
        }

        return result;
    }

    

}