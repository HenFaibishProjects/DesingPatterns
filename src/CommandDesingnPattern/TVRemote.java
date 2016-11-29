package CommandDesingnPattern;
public class TVRemote {
	
	public static ElectronicDevice getDevice(){
		
		return new Television();
		
	}
}