package serverInterface;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface IConsoleOutput {

	public void initPage() throws FileNotFoundException, IOException;
	
	public void optionsPage() throws FileNotFoundException, IOException;
}
