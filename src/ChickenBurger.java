import javax.swing.JOptionPane;

public class ChickenBurger extends Burger{
    private String burgerType;
    String[] types = { "Chicken Smoky BBQ Cheese", "Chicken with Bacon", "Chicken with Sausage", "Chicken Cheese Blast", "Chicken Signature", "Binge Chicken" };

    public ChickenBurger(int amount, Label lbl) {
        super(amount);
        try {
            burgerType = (String) JOptionPane.showInputDialog(lbl, "Select a Burger Type.", "Select a Burger",
                    JOptionPane.QUESTION_MESSAGE, null, types, types[0]);
            double price = 0.0;

            if (burgerType.equals("Chicken Smoky BBQ Cheese"))
                price = 225;
            if (burgerType.equals("Chicken with Bacon"))
                price = 230;
            if (burgerType.equals("Chicken with Sausage"))
                price = 250;
            if (burgerType.equals("Chicken Cheese Blast"))
                price = 100;
            if (burgerType.equals("Chicken Signature"))
                price = 320;
            if (burgerType.equals("Binge Chicken"))
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
