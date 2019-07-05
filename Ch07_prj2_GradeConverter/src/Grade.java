
public class Grade {
	private int number;
	
	
	public Grade(int x) {
		this.number = x;
		
	}
	
	

	public Grade() {
		this.number = 0;
		
	}



	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getLetter() {
		int x = getNumber();
		String grade = " ";
		if(x >= 88) {
			grade = "A";
		} else if (x >= 80 && x <= 87 ) {
			grade = "B";
		} else if (x >= 67 && x <= 79) {
			grade = "C";
		}else if (x >= 60 && x <= 67) {
			grade = "D";
		}else if (x < 60) {
			grade = "F";
		}
		return grade; 
	}
}

