package com.capgemini.bankapp.dao.impl;

import java.util.Set;

import com.capgemini.bankapp.Database.Database;
import com.capgemini.bankapp.dao.BankAccountDao;

import com.capgemini.bankapp.model.BankAccount;

public class BankAccountDaoImpl implements BankAccountDao {

	Set<BankAccount> bankAccounts = Database.getBankAccount();

	@Override
	public double getBalance(long accountId) {
		for (BankAccount bankAccount : bankAccounts) {
			if (bankAccount.getAccountId() == accountId) {
				return bankAccount.getAccountBalance();
			}
		}
		return 0;
	}

	@Override
	public boolean updateBalance(long accountId, double newBalance) {
		for (BankAccount bankAccount : bankAccounts) {
			if (bankAccount.getAccountId() == accountId) {
				bankAccount.setAccountBalance(newBalance);
				return true;
			}
		}
		return false;
	}
}