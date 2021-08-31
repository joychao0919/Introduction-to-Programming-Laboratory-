package date;

public class Date {
	int mode = 0;
	boolean error=false;
	int year_int;
	int month_int;
	int day_int;
	String month_special;
	
	public Date(String year, String month, String day) {
		mode = 1;
		boolean leap;
		year_int = Integer.parseInt(year);
		month_int = Integer.parseInt(month);
		day_int = Integer.parseInt(day);
		//year
		if(year_int<0) {
			error = true;
		}
		else { //year>0
			if((year_int%4==0 && year_int%100!=0) || year_int%400==0) { //leap year
	        	leap = true;
			}
	        else {
	            leap = false;
	        }
	        //month: 2
	        if(month_int==2) {
	        	if(leap) {
	        		if(day_int>29 || day_int<0) {
	        			error = true;
	       		    }
	        	}
	        	else {
	        		if(day_int>28 || day_int<0) {
	        			error = true;
	        		}
	        	}
	        }
	        else if(month_int<0 || month_int>12) {
	        	error = true;
	       	}
	       	//month: 1 3 5 7 8 10 12
	       	else if((month_int<8 && month_int%2==1)||(month_int>7 && month_int%2==0)) { 
	       		if(day_int>31 || day_int<0) {
	       			error = true;
	       		}
	       	}
	       	//month: 4 6 9 11
	       	else if((month_int<8 && month_int%2==0)||(month_int>7 && month_int%2==1)) {
	       		if(day_int>30 || day_int<0) {
	       			error = true;
	       		}
	       	} 	
		}
	}
	
	public Date(int year, String month, int day) {
		mode = 2;
		boolean leap;
		year_int = year;
		month_int = 0;
		day_int = day;
		month_special = month;
		if(month=="January") {
			month_int = 1;
		}
		else if(month=="Febuary") {
			month_int = 2;
		}
		else if(month=="March") {
			month_int = 3;
		}
		else if(month=="April") {
			month_int = 4;
		}
		else if(month=="May") {
			month_int = 5;
		}
		else if(month=="June") {
			month_int = 6;
		}
		else if(month=="July") {
			month_int = 7;
		}
		else if(month=="August") {
			month_int = 8;
		}
		else if(month=="September") {
			month_int = 9;
		}
		else if(month=="October") {
			month_int = 10;
		}
		else if(month=="November") {
			month_int = 11;
		}
		else if(month=="December") {
			month_int = 12;
		}
		else {
			error = true;
		}
		//year
		if(year_int<0) {
			error = true;
		}
		else { //year>0
			if((year_int%4==0 && year_int%100!=0) || year_int%400==0) { //leap year
	        	leap = true;
			}
	        else {
	            leap = false;
	        }
	        //month: 2
	        if(month_int==2) {
	        	if(leap) {
	        		if(day_int>29 || day_int<0) {
	        			error = true;
	       		    }
	        	}
	        	else {
	        		if(day_int>28 || day_int<0) {
	        			error = true;
	        		}
	        	}
	        }
	        else if(month_int<0 || month_int>12) {
	        	error = true;
	       	}
	       	//month: 1 3 5 7 8 10 12
	       	else if((month_int<8 && month_int%2==1)||(month_int>7 && month_int%2==0)) { 
	       		if(day_int>31 || day_int<0) {
	       			error = true;
	       		}
	       	}
	       	//month: 4 6 9 11
	       	else if((month_int<8 && month_int%2==0)||(month_int>7 && month_int%2==1)) {
	       		if(day_int>30 || day_int<0) {
	       			error = true;
	       		}
	       	} 	
		}	
	}
	
	public Date(int year, int month, int day) {
		mode = 3;
		boolean leap;
		year_int = year;
		month_int = month;
		day_int = day;
		//year
		if(year_int<0) {
			error = true;
		}
		else { //year>0
			if((year_int%4==0 && year_int%100!=0) || year_int%400==0) { //leap year
	        	leap = true;
			}
	        else {
	            leap = false;
	        }
	        //month: 2
	        if(month_int==2) {
	        	if(leap) {
	        		if(day_int>29 || day_int<0) {
	        			error = true;
	       		    }
	        	}
	        	else {
	        		if(day_int>28 || day_int<0) {
	        			error = true;
	        		}
	        	}
	        }
	        else if(month_int<0 || month_int>12) {
	        	error = true;
	       	}
	       	//month: 1 3 5 7 8 10 12
	       	else if((month_int<8 && month_int%2==1)||(month_int>7 && month_int%2==0)) { 
	       		if(day_int>31 || day_int<0) {
	       			error = true;
	       		}
	       	}
	       	//month: 4 6 9 11
	       	else if((month_int<8 && month_int%2==0)||(month_int>7 && month_int%2==1)) {
	       		if(day_int>30 || day_int<0) {
	       			error = true;
	       		}
	       	} 	
		}	
	}
	
	int dateDistance(Date d) {
		if(this.error || d.error) {
			return 0;
		}
		else {
			int leapyear1 = 0;
			int leapyear2 = 0;
			int monthday1 = 0;
			int monthday2 = 0;
			int one = 0;
			int two = 0;
			if(error==false) {
				for(int i=0; i<this.year_int; i++) {
					if((i%4==0 && i%100!=0) || i%400==0){
						leapyear1++;
					}
				}
				for(int j=0; j<d.year_int; j++) {
					if((j%4==0 && j%100!=0) || j%400==0){
						leapyear2++;
					}
				}
				//first date
				if(this.month_int==1) {
					monthday1 = 0;
				}
				else if(this.month_int==2) {
					monthday1 = 31;
				}
				else if(this.month_int==3) {
					monthday1 = 59;
				}
				else if(this.month_int==4) {
					monthday1 = 90;
				}
				else if(this.month_int==5) {
					monthday1 = 120;
				}
				else if(this.month_int==6) {
					monthday1 = 151;
				}
				else if(this.month_int==7) {
					monthday1 = 181;
				}
				else if(this.month_int==8) {
					monthday1 = 212;
				}
				else if(this.month_int==9) {
					monthday1 = 243;
				}
				else if(this.month_int==10) {
					monthday1 = 273;
				}
				else if(this.month_int==11) {
					monthday1 = 304;
				}
				else if(this.month_int==12) {
					monthday1 = 334;
				}
				if((this.year_int%4==0 && this.year_int%100!=0) || this.year_int%400==0){
					one = this.year_int*365 + leapyear1 + monthday1 + 1 + this.day_int;
				}
				else {
					one = this.year_int*365 + leapyear1 + monthday1 + this.day_int;
				}
				
				//second date
				if(d.month_int==1) {
					monthday2 = 0;
				}
				else if(d.month_int==2) {
					monthday2 = 31;
				}
				else if(d.month_int==3) {
					monthday2 = 59;
				}
				else if(d.month_int==4) {
					monthday2 = 90;
				}
				else if(d.month_int==5) {
					monthday2 = 120;
				}
				else if(d.month_int==6) {
					monthday2 = 151;
				}
				else if(d.month_int==7) {
					monthday2 = 181;
				}
				else if(d.month_int==8) {
					monthday2 = 212;
				}
				else if(d.month_int==9) {
					monthday2 = 243;
				}
				else if(d.month_int==10) {
					monthday2 = 273;
				}
				else if(d.month_int==11) {
					monthday2 = 304;
				}
				else if(d.month_int==12) {
					monthday2 = 334;
				}
				if((d.year_int%4==0 && d.year_int%100!=0) || d.year_int%400==0){
					two = d.year_int*365 + leapyear2 + monthday2 + 1 + d.day_int;
				}
				else {
					two = d.year_int*365 + leapyear2 + monthday2 + d.day_int;
				}
			}
			int distance = one - two;
			if(distance<0) {
				return (-distance);
			}
			else
				return distance;
		}
	}
	
	void print() {
		if(mode==1) {
			if(error==true) {
				System.out.println("error");
			}
			else {
				System.out.println(day_int + "/" + month_int + "/" + year_int);
			}
		}
		else if(mode==2) {
			if(error==true) {
				System.out.println("error");
			}
			else {
				System.out.println(month_special + " " + day_int + ", " + year_int);
			}
		}
		else if(mode==3) {
			if(error==true) {
				System.out.println("error");
			}
			else {
				System.out.println(year_int + " " + "¦~" + " " + month_int + " " + "¤ë" + " " + day_int + " " + "¤é");
			}
		}
	}
}
