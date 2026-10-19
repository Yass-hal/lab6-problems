package problem1;

public class Item {
    private String name;
    private double price;
    private double quantity;
    public Item(String name,double price,double quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }
}
