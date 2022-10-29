import javax.swing.*;

public class BeefBurger extends Burger{
    private String burgerType;
    String[] types = { "Beef Smoky BBQ Cheese", "Beef with Bacon", "Beef with Sausage", "Beef Cheese Blast", "Beef Signature", "Binge Beef" };

    public BeefBurger(int amount, Label lbl) {
        super(amount);
        try {
            burgerType = (String) JOptionPane.showInputDialog(lbl, "Select a Burger Type.", "Select a Burger",
                    JOptionPane.QUESTION_MESSAGE, null, types, types[0]);
            double price = 0.0;

            if (burgerType.equals("Beef Smoky BBQ Cheese"))
                price = 225;
            if (burgerType.equals("Beef with Bacon"))
                price = 230;
            if (burgerType.equals("Beef with Sausage"))
                price = 250;
            if (burgerType.equals("Beef Cheese Blast"))
                price = 100;
            if (burgerType.equals("Beef Signature"))
                price = 320;
            if (burgerType.equals("Binge Beef"))
                price = 380;
            setPrice(price);
        } catch (NullPointerException e) {
        }
    }

    @Override
    public String toString() {
        return super.toString()+burgerType+" Burger";
    }
}
