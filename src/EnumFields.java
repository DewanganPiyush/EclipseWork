
public class EnumFields {
	
	enum Month {
	    JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30),
	    JULY(31), AUGUST(31), SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31);

	    private final int days;

	    
	    Month(int days) {
	        this.days = days;
	    }

	    
	    public int getDays() {
	        return days;
	    }
	    
	}
	    
	    enum Day {
	        MONDAY("Start of the work week"),
	        TUESDAY("Second day of the work week"),
	        WEDNESDAY("Midweek day"),
	        THURSDAY("Almost there"),
	        FRIDAY("End of the work week"),
	        SATURDAY("Weekend!"),
	        SUNDAY("Relax and prepare for the week");
	    	
	    	private String description;
	    	
	    	Day(String description) {
	            this.description = description;
	        }
	    	
	    	public String getDescription() {
	            return description;
	        }
	    	
	    
	}

	public static void main(String[] args) {
		
		Month month = Month.FEBRUARY;
        System.out.println("February has " + month.getDays() + " days.");

        for (Day day : Day.values()) {
            System.out.println(day + ": " + day.getDescription());
            
        }
	}

}
