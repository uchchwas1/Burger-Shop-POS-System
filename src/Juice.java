import javax.swing.JOptionPane;

public class Juice extends Beverage {
    private String fruit;
    String[] fruits = { "Oreo", "Munch", "Nutella" };

    public Juice(String size, int amount, Label lbl) {
        super(size, amount);
        try {
            fruit = (String) JOptionPane.showInputDialog(lbl, "Select a fruit.", "Select a fruit",
                    JOptionPane.QUESTION_MESSAGE, null, fruits, fruits[0]);
            double price;
            if (size.equals("Small"))
                price = 75;
            else if (size.equals("Medium"))
                price = 99;
            else
                price = 135;
            if (fruit.equals("Oreo"))
                price *= 1.25;
            if (fruit.equals("Munch"))
                price *= 1.5;
            setPrice(price);
        } catch (NullPointerException e) {
        }
    }

    @Override
	public String toString() {
		return super.toString()+fruit+" juice";
	}
}
