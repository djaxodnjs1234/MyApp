
public class AccountingApp {

	public static void main(String[] args) {
		
		double ValueOfSupply = Double.parseDouble(args[0]);
		double expenseRate = 0.3;
		double vatRate = 0.1;
		double vat = ValueOfSupply*vatRate;
		double total = ValueOfSupply + vat;
		double expense = ValueOfSupply*expenseRate;
		double income = ValueOfSupply - expense;
		double dividen1 = income * 0.5;
		double dividen2 = income * 0.3;
		double dividen3 = income * 0.2;
		
		System.out.println("Value of supply : "+ValueOfSupply);
		System.out.println("VAT : "+vat );
		System.out.println("Total : "+total );
		System.out.println("Expense : "+expense );
		System.out.println("Income : "+income );
		System.out.println("Dividend 1 : "+dividen1);
		System.out.println("Dividend 2 : "+dividen2);
		System.out.println("Dividend 3 : "+dividen3);
		
		

	}

}
