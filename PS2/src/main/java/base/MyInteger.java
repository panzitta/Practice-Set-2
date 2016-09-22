package base;


public class MyInteger {
	
	private int iValue;
	public MyInteger(int iValue) {
		this.iValue = iValue;
	}
	public int getiValue(){
		return iValue;
	}
	
//Using iValue	
public boolean isEven() {
	return isEven(getiValue());
}

public boolean isOdd(){
	return isOdd(getiValue());
}
public boolean isPrime(){
	return isPrime(getiValue());
	}
//Using integer i
public static boolean isEven(int i){
	if (i%2==0){
		return true;}
		else {
			return false;}
	}

public static boolean isOdd(int i){
	if (isEven(i)==false){
		return true;}
	else {
		return false;}
	}

public static boolean isPrime(int i){
	if (i == 2){
		return true;}
	if (isEven(i)==true){
		return false;}
	for (int k=3; i<k ; k++){
		if (i%k==0){
			return false;}}
	return true;}
	

//Using MyInteger
public static boolean isEven(MyInteger i){
	return i.isEven();
	}
public static boolean isOdd (MyInteger i){
	return i.isOdd();
}
	
public static boolean isPrime(MyInteger i){
	return i.isPrime();
}


//Equals
public boolean equals(int i){
	if (i==iValue){
		return true;}
	return false;
	}
public boolean equals(MyInteger i){
	return equals(i.getiValue());
}
}


	

	

