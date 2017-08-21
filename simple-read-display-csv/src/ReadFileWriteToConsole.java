import java.io.FileNotFoundException;
import java.io.IOException;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class ReadFileWriteToConsole {
	
	private static final int MAXROW = 3;
	private static final int MAXCOL = 3;
    private static final String inFile = "in.csv";
	   
    public String[][] sheet = new String[MAXROW][MAXCOL];
	   
    public static void main(String args[]) throws IOException {
    	// create a ReadWriteToConsole object
    	//  Do not change the signature of this method.
    	// ... insert code here ...
    	// invoke readSheet()
    	// ... insert code here ...
    	// invoke writeSheet()
    	// ... insert code here ...
    	ReadFileWriteToConsole rwtc = new ReadFileWriteToConsole();
    	rwtc.readSheet();
    	rwtc.writeSheet();
    }	
	   
    public void readSheet() throws IOException {
    	// ... insert code here ...
    	CsvReader reader = new CsvReader(inFile);
    	int i = 0;
    	while(reader.readRecord()){
    		sheet[i] = reader.getRawRecord().split(",");
    		i++;
    	}
    	
    	//  Do not change the signature of this method.
	}
	   
	public void writeSheet(){
		// ... insert code here ...
		int i = 0;
		while (i < MAXCOL){
			for (String string : sheet[i]){
			System.out.print("["+string+"]");
		}
			System.out.println("");
			i++;
    	//  Do not change the signature of this method.
	}
}
}
