
class Continent {
    protected String continentName;

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public void displayContinent() {
        System.out.println("Continent: " + continentName);
    }
}

class Country extends Continent {
    protected String countryName;

    public Country(String continentName, String countryName) {
        super(continentName);
        this.countryName = countryName;
    }

    public void displayCountry() {
        System.out.println("Country: " + countryName);
    }
}

class State extends Country {
    protected String stateName;

    public State(String continentName, String countryName, String stateName) {
        super(continentName, countryName);
        this.stateName = stateName;
    }

    public void displayState() {
        System.out.println("State: " + stateName);
    }
}

public class SetA1 extends State {
    private String placeName;

    public SetA1(String continentName, String countryName, String stateName, String placeName) {
        super(continentName, countryName, stateName);
        this.placeName = placeName;
    }

    public void displayPlace() {
        System.out.println("Place: " + placeName);
    }

    public static void main(String[] args) {
        SetA1 place = new SetA1("North America", "USA", "California", "Los Angeles");
        place.displayPlace();
        place.displayState();
        place.displayCountry();
        place.displayContinent();
    }
}

