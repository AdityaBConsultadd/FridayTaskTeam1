import java.util.HashMap;

class Problem2{
    public static void main(String[] args) {
        
    	//Vaibhav
    	VaibhavP2 frequencyString = new VaibhavP2(new char[] { 'a', 'a', 'a', 'b', 'b', 'd', 'd', 'd', 'c' });
		frequencyString.countChars();
    	
    }
}

class VaibhavP2 {

	HashMap<Character, Integer> frequencyMap = new HashMap<Character, Integer>();
	char[] charArray;

	VaibhavP2(char[] cs) {
		this.charArray = cs;
	}

	public void countChars() {

		for (char c : charArray) {
			
			frequencyMap.put(c, (frequencyMap.getOrDefault(c, 0) + 1));
		}
		
		for (char ks: frequencyMap.keySet()) {
			System.out.print(ks+""+frequencyMap.get(ks));
		}

	}
}