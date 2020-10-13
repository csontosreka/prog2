package order;

public class Order {
    private String id;
    private String date;
    private int price;
    private DeliveryType deliveryType;

    public String getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public int getPrice() {
        return price;
    }

    public DeliveryType getDeliveryType() {
        return deliveryType;
    }

}
