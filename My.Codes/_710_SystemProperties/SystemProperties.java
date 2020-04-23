package _710_SystemProperties;

public class SystemProperties {

	public static void main(String[] args) {

		String value [] ={ 
				"file.separator", 
				"java.class.path", 
				"java.home",
				"java.vendor",
				"java.vendor.url",
				"java.version",
				"os.arch",
				"os.name",
				"os.version",
				"user.dir",
				"user.home",
				"user.name"
		};
		
				
		for (int x=0; x<value.length;x++)
			System.out.printf("%-20s : [%s] %n",value[x],System.getProperty(value[x]));
		
	}

}
