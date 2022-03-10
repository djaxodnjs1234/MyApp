class Accounting{
	public double ValueOfSupply;
	public double vatRate;
	public double expenseRate;

	public void print() {
		System.out.println("Value of supply : "+ValueOfSupply);
		System.out.println("VAT : "+ getVAT() );
		System.out.println("Total : "+getTotal() );
		System.out.println("Expense : "+getExpense() );
		System.out.println("Income : "+getIncome() );
		System.out.println("Dividend 1 : "+getDividend1());
		System.out.println("Dividend 2 : "+getDividend2());
		System.out.println("Dividend 3 : "+getDividend3());
	}
	public double getDividend1() {
		return getIncome() * 0.5;
	}
	public double getDividend2() {
		return getIncome() * 0.3;
	}
	public double getDividend3() {
		return getIncome() * 0.2;
	}

	public double getIncome() {
		return ValueOfSupply - getExpense();
	}

	public double getExpense() {
		return ValueOfSupply*expenseRate;
	}

	public double getTotal() {
		double total = ValueOfSupply + getVAT();
		return total;
	}

	private double getVAT() {
		return ValueOfSupply*vatRate;
	}
}

public class AccountingClassApp {
	public static void main(String[] args) {
//		Accounting1.expenseRate = 0.3;
//		Accounting1.ValueOfSupply = 10000.0;
//		Accounting1.vatRate = 0.1;
//		Accounting1.print();
//		
//		Accounting2.expenseRate = 0.3;
//		Accounting2.ValueOfSupply = 10000.0;
//		Accounting2.vatRate = 0.1;
//		Accounting2.print();
//		
//		Accounting1.print();
//		
		//instance
		Accounting a1 = new Accounting();
		a1.ValueOfSupply = 10000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();
		
		Accounting a2 = new Accounting();
		a2.ValueOfSupply = 20000.0;
		a2.vatRate = 0.05;
		a2.expenseRate = 0.2;
		a2.print();
		
		a1.print();

	}

}
