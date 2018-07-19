package DataObjects;

import java.math.BigDecimal;

public class Transaction {

	String accountNum;
	BigDecimal amount;
	String confirmationNum;

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getConfirmationNum() {
		return confirmationNum;
	}

	public void setConfirmationNum(String confirmationNum) {
		this.confirmationNum = confirmationNum;
	}

	public Transaction(String accountNum, BigDecimal amount, String confirmationNum) {
		super();
		this.accountNum = accountNum;
		
		this.amount = amount;
		this.confirmationNum = confirmationNum;
	}

	@Override
	public String toString() {
		return "Transaction [accountNum=" + accountNum + ", amount=" + amount + ", confirmationNum=" + confirmationNum
				+ "]";
	}

}
