import javax.swing.*;

public class FrenchFries extends Sides {
    private String sidesType;
    private String itemName;
    String[] types = {"French Fries Regular", "Chicken Fingers", "Chicken Wings"};

    public FrenchFries(int amount, Label lbl) {
        super(amount);
        try {
            sidesType = (String) JOptionPane.showInputDialog(lbl, "Select a side Type.", "Select a side",
                    JOptionPane.QUESTION_MESSAGE, null, types, types[0]);
            double price = 0.0;

            if (sidesType.equals("French Fries Regular")){
                price = 75;
                setItemName("French Fries Regular");
            }

            if (sidesType.equals("Chicken Fingers")){
                setItemName("Chicken Fingers");
                price = 120;
            }

            if (sidesType.equals("Chicken Wings")){
                price = 130;
                setItemName("Chicken Wings");
            }

            setPrice(price);
        } catch (NullPointerException e) {
        }
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        return String.format("%d %s   ", this.getAmount(), this.getItemName());
    }
}
