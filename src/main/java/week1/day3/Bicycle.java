package week1.day3;

public class Bicycle {

	String numberOfWheels = "2";
	private String bell = "";
	public void doPedal() {
		System.out.println(bell);
		System.out.println(Integer.parseInt(numberOfWheels));
	}
	public void applyBreak() {
		String frontBreak="Apply";
		System.out.println(frontBreak);
	}

	public String getColor(String whom) {
/*		if (whom.equals("MySelf")) {
			return "Green";
		}else if(whom.equals("Kid")){
			return "Black";
		} else {
			return "Blue";
		}*/
		String color ="";
		switch(whom) {
		case "MySelf" : color ="Green";
		break;
		case "Kid"    : color ="Black";
		break;
		case "father" : color ="Blue";
		break;

		}
		
		return color;

	}
	public static void main(String[] args) {
		Bicycle be = new Bicycle();
		String color = be.getColor("MySelf");
		System.out.println(color);
	}

}
