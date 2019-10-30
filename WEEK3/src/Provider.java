public class Provider {
    private int id;
    private String name;
    private String contactInformation;
    private String providedCar;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public String getProvidedCar() {
        return providedCar;
    }

    public Provider(int id, String name, String contactInformation, String providedCar) {
        this.id = id;
        this.name = name;
        this.contactInformation = contactInformation;
        this.providedCar = providedCar;
    }
}
