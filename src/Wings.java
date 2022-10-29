import javax.swing.*;

public class Wings extends Sides{
    private String sidesType;
    private String itemName;
    String[] types = {"Sweet N Naga", "Cheesy Wings", "BBQ Wings"};

    public Wings(int amount, Label lbl) {
        super(amount);
        try {
            sidesType = (String) JOptionPane.showInputDialog(lbl, "Select a side Type.", "Select a side",
                    JOptionPane.QUESTION_MESSAGE, null, types, types[0]);
            double price = 0.0;

            if (sidesType.equals("Sweet N Naga")){
                price = 75;
                setItemName("Sweet N Naga");
            }

            if (sidesType.equals("Cheesy Wings")){
                setItemName("Cheesy Wings");
                price = 120;
            }

            if (sidesType.equals("BBQ Wings")){
                price = 130;
                setItemName("BBQ Wings");
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
