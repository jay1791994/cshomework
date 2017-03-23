package edu.nyu.cs9053.homework6;

import java.lang.annotation.Annotation;

public class SafetyDepositBox {

	 final Long safetyId ;
	
public SafetyDepositBox(Long l){
	this.safetyId = l ;
}

public boolean canGetTools(Mine mine) {
	
	  long 	OrgPassword ;
	  OrgPassword = Long.valueOf("2492133812");
	  if(mine.password()== OrgPassword){
	        return true;
	}
	 return false;
}

public boolean canCashIn(Mine mine, int gems) {
	
	return true;
}


}
