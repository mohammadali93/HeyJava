package com.class24;



//THIS IS METHOD OVERRIDING
public class Bank {
public int chargeInterest() {// public class can be only ONE.
	return 0;
}
}
class BOA extends Bank{
	@Override// annotation // just to see
	public int chargeInterest() {
		return 2;
	}
}
class  PNC extends Bank{
	@Override
	public int chargeInterest() {
		return 3;
	}
}
