public class Sales {
    private int id;
    private String name;
    private String saledCar;
    private int amountpay;
    private String date;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSaledCar() {
        return saledCar;
    }

    public int getAmountpay() {
        return amountpay;
    }

    public String getDate() {
        return date;
    }

    public Sales(int id, String name, String saledCar, int amountpay, String date) {
        this.id = id;
        this.name = name;
        this.saledCar = saledCar;
        this.amountpay = amountpay;
        this.date = date;
    }
}