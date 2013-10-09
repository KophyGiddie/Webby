import javax.swing.JOptionPane;
public class salary {
	public static void main(String[] args) {
		String name = askForString();
		double bonus = askForBonus();
		double basic_wage = askForSalaryLevel();
		if ((basic_wage == 2000) || (basic_wage == 5000)){
			bonus = calculateBonus(bonus);
		}
		double tax = calculateDeductions(basic_wage);
		double grossIncome = calculateGrossIncome(bonus, basic_wage);
		double salary = calculateSalary(grossIncome, tax);
		outputResult(name + " Your salary is "+ salary );
	}

	static double calculateGrossIncome(double basicWage, double bonus){
			double grossIncome = basicWage + bonus;
			return grossIncome;
	}

	static double calculateDeductions(double grossIncome){
		double tax = 0.0475 * grossIncome;
		return tax;
	}
	static double calculateBonus(double bonus){
		double tax1 = 0.1 * bonus;
		double tax = bonus - tax1;
		return tax;
	}
	static double askForBonus(){
		String bonus_input = JOptionPane.showInputDialog("Please enter your bonus");
		double bonus = Double.parseDouble(bonus_input);
		return bonus;
	}


	static String askForString(){
		String name_input = JOptionPane.showInputDialog("Please enter your name");
		return name_input;
	}
	
	static double askForSalaryLevel(){
		double basicWage = 0;
		String bonus_input = JOptionPane.showInputDialog("Please enter your Salary level");
		switch(bonus_input) {
			case "A": basicWage = 1000;
					break;
			case "B": basicWage = 1200;
					break;
			case "C": basicWage = 2000;
					break;
			case "D": basicWage = 5000;
					break;
			default : System.out.println("You must enter A - D");
		}
		return basicWage;
	}

	
	static double calculateSalary(double grossIncome, double deductions){
			double salary = grossIncome - deductions;
			return salary;
	}
	
	static void outputResult(String message){
		JOptionPane.showMessageDialog(null, message);
	}
}