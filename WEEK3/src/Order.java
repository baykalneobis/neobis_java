public class Order {
    private int id;
    private String name;
    private String date;
    private boolean pay;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public boolean isPay() {
        return pay;
    }

    public Order(int id, String name, String date, boolean pay) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.pay = pay;
    }
}
