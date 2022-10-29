import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Label extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private JLabel lblSize, lblBev, lblGlass, lblReport, lblReportBurger, lblBurger, lblBurgerx, lblSides, lblSidesx, lblReportSides;
	private JComboBox<String> size;
	private JComboBox<String> burgerSize;
	private JRadioButton rdJuice,rdWater,rdTea,rdCoffee;
	private JRadioButton rdChickenBurger, rdBeefBurger, rdSides, rdWings;
	private ButtonGroup btnGroup;
	private JTextField txtGlass, txtBurger, txtSides;
	private JButton btnAdd,btnOrder;
	int amount_of, amount_of_burger, amount_of_sides;


	ArrayList<Beverage> list_of_bvr = new ArrayList<Beverage>();
	ArrayList<Burger> list_of_burger = new ArrayList<Burger>();
	ArrayList<Sides> list_of_sides = new ArrayList<Sides>();


	public Label() {
		setLayout(null);
		setSize(550,900);
		setLocationRelativeTo(null);
		setTitle("Order");
		init();
		btnAdd.addActionListener(this); 
		btnOrder.addActionListener(this);
		setVisible(true);
	}
	
	public void init() {
//		lblSize = new JLabel("Select size of Burger:"); // a JLabel that labels the comboBox
//		lblSize.setSize(250, 50);
//		lblSize.setLocation(100, 10);
//		add(lblSize);
		//burger items
		/*String[] burgerSize = {"Small","Medium","Large"};
		size = new JComboBox<String>(burgerSize);//
		size.setSelectedIndex(0);//default selection is small
		size.setSize(100, 25);
		size.setLocation(100, 50);
		add(size);*/

		lblBurger = new JLabel("Select which type of Burger you want to order:"); //a JLabel that labels the radioButtons
		lblBurger.setSize(500, 50);
		lblBurger.setLocation(100, 75);
		add(lblBurger);

		btnGroup = new ButtonGroup();

		rdChickenBurger = new JRadioButton("Chicken Burger");
		rdChickenBurger.setSize(150, 50);
		rdChickenBurger.setLocation(100, 110);
		add(rdChickenBurger);

		rdBeefBurger = new JRadioButton("Beef Burger");
		rdBeefBurger.setSize(150, 50);
		rdBeefBurger.setLocation(250, 110);
		add(rdBeefBurger);

		btnGroup.add(rdChickenBurger);
		btnGroup.add(rdBeefBurger);

		lblBurgerx = new JLabel("Type how many Burger you want to order:");//a JLabel that labels the Text Field
		lblBurgerx.setSize(250, 50);
		lblBurgerx.setLocation(100, 150);
		add(lblBurgerx);

		txtBurger = new JTextField();//a JTextField to get how many burgers of beverage is the user want
		txtBurger.setSize(300, 25);
		txtBurger.setLocation(100, 200);
		add(txtBurger);




		//beverage items
		lblSize = new JLabel("Select size of Beverage:"); // a JLabel that labels the comboBox
		lblSize.setSize(250, 50);
		lblSize.setLocation(100, 220);
		add(lblSize);

		String[] sizes = {"Small","Medium","Large"};
		size = new JComboBox<String>(sizes);//
		size.setSelectedIndex(0);//default selection is small
		size.setSize(100, 25);
		size.setLocation(100, 260);
		add(size);

		lblBev = new JLabel("Select which type of beverage you want to order:");//a JLabel that labels the radioButtons
		lblBev.setSize(250, 50);
		lblBev.setLocation(100, 290);
		add(lblBev);

		btnGroup = new ButtonGroup();

		rdJuice = new JRadioButton("Juice");
		rdJuice.setSize(75, 50);
		rdJuice.setLocation(100, 320);
		add(rdJuice);

		rdWater = new JRadioButton("Water");
		rdWater.setSize(75, 50);
		rdWater.setLocation(175, 320);
		add(rdWater);

		rdTea = new JRadioButton("Tea");
		rdTea.setSize(75, 50);
		rdTea.setLocation(250, 320);
		add(rdTea);

		rdCoffee = new JRadioButton("Coffee");
		rdCoffee.setSize(75, 50);
		rdCoffee.setLocation(325, 320);
		add(rdCoffee);

		btnGroup.add(rdJuice);
		btnGroup.add(rdWater);
		btnGroup.add(rdTea);
		btnGroup.add(rdCoffee);

		lblGlass = new JLabel("Type how many glasses you want to order:");//a JLabel that labels the Text Field
		lblGlass.setSize(250, 50);
		lblGlass.setLocation(100, 350);
		add(lblGlass);

		txtGlass = new JTextField();//a JTextField to get how many glasses of beverage is the user want
		txtGlass.setSize(300, 25);
		txtGlass.setLocation(100, 400);
		add(txtGlass);

		//Slides
		lblSides = new JLabel("Select which type of Others Items you want to order:"); //a JLabel that labels the radioButtons
		lblSides.setSize(500, 50);
		lblSides.setLocation(100, 430);
		add(lblSides);

		btnGroup = new ButtonGroup();

		rdSides = new JRadioButton("Sides Items");
		rdSides.setSize(100, 50);
		rdSides.setLocation(100, 465);
		add(rdSides);

		rdWings = new JRadioButton("Pankha Wings");
		rdWings.setSize(150, 50);
		rdWings.setLocation(220, 465);
		add(rdWings);
//
		btnGroup.add(rdSides);
		btnGroup.add(rdWings);
//
		lblSidesx = new JLabel("Type how much quantity you want to order:");//a JLabel that labels the Text Field
		lblSidesx.setSize(250, 50);
		lblSidesx.setLocation(100, 500);
		add(lblSidesx);

		txtSides = new JTextField();//a JTextField to get how many burgers of beverage is the user want
		txtSides.setSize(300, 25);
		txtSides.setLocation(100, 550);
		add(txtSides);
		//End
		
		btnAdd = new JButton("Add");
		btnAdd.setSize(120, 40);
		btnAdd.setLocation(100, 630);
		add(btnAdd);

		btnOrder = new JButton("Order");
		btnOrder.setSize(120, 40);
		btnOrder.setLocation(280, 630);
		btnOrder.setEnabled(false);
		add(btnOrder);

		lblReport = new JLabel();//will be showing report of the beverages that added.
		lblReport.setSize(800, 50);
		lblReport.setLocation(100, 680);
		add(lblReport);

		lblReportBurger = new JLabel();//will be showing report of the beverages that added.
		lblReportBurger.setSize(800, 50);
		lblReportBurger.setLocation(100, 700);
		add(lblReportBurger);

		lblReportSides = new JLabel();//will be showing report of the beverages that added.
		lblReportSides.setSize(800, 50);
		lblReportSides.setLocation(100, 720);
		add(lblReportSides);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String size_of = (String)size.getSelectedItem();
		if(e.getSource().equals(btnAdd)) {
			if( rdWings.isSelected()  || rdSides.isSelected() || rdBeefBurger.isSelected() || rdChickenBurger.isSelected() || rdJuice.isSelected() || rdTea.isSelected() || rdCoffee.isSelected() || rdWater.isSelected() && !(txtGlass.getText().isEmpty()) || !(txtBurger.getText().isEmpty()) || !(txtSides.getText().isEmpty())) {
				try {
					amount_of  = Integer.parseInt(txtGlass.getText().trim());
					amount_of_burger  = Integer.parseInt(txtBurger.getText().trim());
					amount_of_sides = Integer.parseInt(txtSides.getText().trim());
					Beverage bvg;
					Burger burger;
					Sides sides;

					if(rdJuice.isSelected())  { bvg = new Juice(size_of,amount_of,this); }
					else if(rdWater.isSelected())  { bvg = new Water(size_of,amount_of,this); }
					else if(rdTea.isSelected())    { bvg = new Tea(size_of,amount_of,this); }
					else { bvg = new Coffee(size_of,amount_of,this); }

					if(rdChickenBurger.isSelected()){
						burger = new ChickenBurger(amount_of_burger,this);
					}
					else if(rdBeefBurger.isSelected()){
						burger = new BeefBurger(amount_of_burger,this);
					}
					else {
						burger = new ChickenBurger(amount_of_burger,this);
					}

					if(rdSides.isSelected()) {
						sides = new FrenchFries(amount_of_sides, this);

					}else if(rdWings.isSelected()) {
						sides = new Wings(amount_of_sides, this);

					}else{
						sides = new FrenchFries(amount_of_sides, this);
					}

					txtGlass.setText(null);
					list_of_bvr.add(bvg);
					list_of_burger.add(burger);
					list_of_sides.add(sides);
					lblReport.setText(bvg.toString()+" added");
					lblReportBurger.setText(burger.toString()+" added");
					lblReportSides.setText(sides.toString()+" added");

					btnGroup.clearSelection();
					btnOrder.setEnabled(true);
				}
				catch(NumberFormatException e1) {//if written data in TextField can't be converted to an integer[String,char,double etc...]
					JOptionPane.showMessageDialog(this, "Enter an integer as amount");
				}
			}	
			else { JOptionPane.showMessageDialog(this, "Choose a beverage type and enter an amount"); 
			//if none of the radio buttons are selected or the textField is empty
			}
		}
		if(e.getSource().equals(btnOrder)) {
			String report = "";
			double pay=0.0;
			for(int i=0;i<list_of_bvr.size();i++) {
				Beverage bvgi = list_of_bvr.get(i);
				report += bvgi.toString();
				double totalprice_of_bvg = bvgi.getAmount() * bvgi.getPrice();
				pay += totalprice_of_bvg; // add the total amount to be paid
				report = report + " - "+totalprice_of_bvg+" BDT\n";
			}
			JOptionPane.showMessageDialog(this, report);

			for(int i=0;i<list_of_burger.size();i++) {
				Burger burger = list_of_burger.get(i);
				report += burger.toString();
				double totalprice_of_burger = burger.getAmount() * burger.getPrice();
				pay += totalprice_of_burger; // add the total amount to be paid
				report = report + " - "+totalprice_of_burger+" BDT\n";
			}

			for(int i=0;i<list_of_sides.size();i++) {
				Sides sides = list_of_sides.get(i);
				report += sides.toString();
				double totalprice_of_sides = sides.getAmount() * sides.getPrice();
				pay += totalprice_of_sides; // add the total amount to be paid
				report = report + " - "+totalprice_of_sides+" BDT\n";
			}

			JOptionPane.showMessageDialog(this, report);
			JOptionPane.showMessageDialog(this,	 "You should pay "+pay+" BDT");
			lblReport.setText(null);
			btnOrder.setEnabled(false);
			list_of_bvr.clear();
			list_of_burger.clear();
		}	
	}

	public static void main(String[] args) {
		new Label();
	}
}
