
public class Enum {

	public static void main(String[] args) {
		Day day = Day.SATURDAY;
		
		switch(day){
			case MONDAY:{
				System.out.println("Today is working Monday");
				break;
			}
			case SATURDAY:{
				System.out.println("Today is holiday " + Day.SATURDAY);
				break;
			}
			default:{
				System.out.println("out of station");
			}
		}
		
		

	}

}
