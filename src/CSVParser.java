
public class CSVParser {
	
	private String csvLine;
	
	public CSVParser(String csvLine){
		this.csvLine=csvLine;
		}
	
	public int countComma(){
		int count=0;
		for(int i = 0; i < this.csvLine.length();i++){
			if (this.csvLine.charAt(i) == ','){
				count++;
			}
		}
		
		return count;
	}
	
	public String[] parse(){
		String[] array = new String[countComma()+1];
		
		for (int i = 0; i < this.csvLine.length();i++){
			if (this.csvLine.charAt(i) == ','){
				
			}
		
		return array;
	}

}
