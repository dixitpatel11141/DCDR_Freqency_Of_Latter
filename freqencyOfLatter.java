import java.util.Scanner;

public class freq {
	
	static final int SIZE = 26; 
	private static Scanner x;
	
	static void printCharWithFreq(String str) 
	
	{ 
		 
		int n = str.length(); 
		float ent=0;
		
		float[] prob=new float [str.length()];
		int[] freq = new int[SIZE]; 

		for (int i = 0; i < n; i++) 
			freq[str.charAt(i) - 'a']++; 

		System.out.println("Character\tFrequency\tProbability\n");
		for (int i = 0; i < n; i++) { 

			if (freq[str.charAt(i) - 'a'] != 0) { 

				prob[i] = (float)(freq[str.charAt(i) - 'a'])/str.length();
				System.out.print(str.charAt(i)); 
				System.out.println("\t\t" + freq[str.charAt(i) - 'a'] + "\t\t" + prob[i]); 
				ent += (-prob[i]) * (java.lang.Math.log10((double)prob[i]) / 0.3010);
				
				freq[str.charAt(i) - 'a'] = 0; 
			} 
		}
		System.out.println("\nEntropy Of Given String is: " + ent);
	} 
	
	 
	public static void main(String args[]) 
	{ 
				x = new Scanner(System.in);
				String str = null;
				int f=1;
				do
				 {
					System.out.println("Enter String:");
					str = x.nextLine();
					
					for (int i = 0; i < str.length(); i++) 
						if (Character.isDigit(str.charAt(i))  
						    == true) 
						 {
							System.out.println("\nEnter String Only In Character!");
							f=0;
							break;
						 }
						else 
							f=1;
						
				} while(f==0);

		printCharWithFreq(str); 
		
		x.close();
	} 
} 

