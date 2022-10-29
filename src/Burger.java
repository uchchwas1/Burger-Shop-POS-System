public class Burger {
    private String size;
    private int amount;
    private double price;

    public Burger(int amount){
        super();
        this.amount = amount;
        price = 0.0;
    }

    public String getSize() {
        return size;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return String.format("%d burger(es) of ", this.getAmount());
    }
}
