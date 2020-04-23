package _700_Working_with_Files;
import java.io.File;
public class _501_working_with_files_write_something_to_file {
	
	public static void main(String args[])
    {
        final String fileName="d:/my_file.txt";
         
        try
        {
            File objFile=new File(fileName);
            if(objFile.createNewFile())
            {
                System.out.println("File created successfully.");
            }
            else
            {
                System.out.println("File creation failed!!!");
            }
        }
        catch (Exception Ex)
        {
            System.out.println("Exception : " + Ex.toString());
        }
    }


}
