package _004_Sysout;

public class _020_Color {


		public static void main(String args[]) {

	        System.out.println("Default String value of Java Enum Color.RED is "
	                + Color.RED);
	        System.out.println("Custom String value of Java Enum  ColorWithToString.RED is "
	                + ColorWithToString.RED);
	        System.out.println("Custom String value of Enum in Java, ColorWithSpecificString.RED is "
	                + ColorWithSpecificString.RED.getCustomString());
	    }

	    private enum Color {

	        RED, GREEN, BLUE;
	    }

	   
	    private enum ColorWithToString {

	        RED {

	                    @Override
	                    public String toString() {
	                        return "Red";
	                    }
	                },
	        GREEN {

	                    @Override
	                    public String toString() {
	                        return "Green";
	                    }
	                },
	        BLUE {

	                    @Override
	                    public String toString() {
	                        return "Blue";
	                    }
	                };
	    }


	    
	    private enum ColorWithSpecificString {

	        RED("red"), BLUE("blue"), GREEN("green");

	        private String custom;

	        private ColorWithSpecificString(String custom) {
	            this.custom = custom;
	        }

	        public String getCustomString() {
	            return custom;
	        }

	    }

		
		

}
