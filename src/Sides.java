public class Sides {
    private int amount;
    private double price;
    private String itemName;

//    public Sides(int amount, String itemName){
//        super();
//        this.amount = amount;
//        this.itemName = itemName;
//        price = 0.0;
//    }

    public Sides(int amount){
        super();
        this.amount = amount;
        price = 0.0;
    }



    public int getAmount() {
        return amount;
    }

//    public String getItemName() {
//        return itemName;
//    }
//
//    public void setItemName(String itemName) {
//        this.itemName = itemName;
//    }

    public double getPrice() {
        return price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%d (es) of ", this.getAmount());
    }
}
