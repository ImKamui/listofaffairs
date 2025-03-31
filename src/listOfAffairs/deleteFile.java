package listOfAffairs;

import java.io.PrintWriter;
import java.io.IOException;

public class deleteFile implements delete{
	public void deleteFile(String fileName)
	{
		try
		{
			PrintWriter eraser = new PrintWriter(fileName);
			eraser.print("");
			eraser.flush();
			eraser.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		chooser useChooser = new chooser();
		useChooser.chooseVariant();
	}
}
