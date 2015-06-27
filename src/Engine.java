import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Engine {
	public static void generateRandomArray()
	{
		int idx;
	    String random;
	    String sampleString;
	    String wordGen[];
	    
	    int control = 0;
	    int control2 = 0;
        int J = 0;
        int clusterSizeController = 3;
        
        ArrayList<String> wordBank = new ArrayList<String>();
	     
	     String[] words = new String[]{"a","this","that","those","their","the","him",
	             "his","her","apple","umbrella","doctor","bicycle","question","word",
	             "entity","read","your","impossible","open","possible","surely","unrelated",
	             "algebra","document","message","period","item","quest","typing","blink",
	             "touch","smell","taste","hear","feel","amazing","happy","sad","confused",
	             "female","male","church","believe","wonderful","concerned","related",
	             "priest","fruit","banana","peach","steal","return","favor","mister"};
	    do
	    {
	    	idx = new Random().nextInt(words.length);
	    	random = (words[idx]);   
	    	wordGen = random.split("\\s");
	    	
	    	wordBank.toString();
	    	//wordBank.toArray();
	    	
	    	control += 1;
	    	control2 +=1;
	    		if (control2 <= 10){
	    			System.out.print(random + " ");
	    			wordBank.add(random);
	    			
		    		//System.out.print(Arrays.toString(wordGen));
	    			}	
	    		else{
	    			wordBank.remove(random);
	    			System.out.print("\n");
	    			control2 = 0;
	    			}	
	    		if (control == 30){
	    			
	    	    	System.out.print("\n" + wordBank);
	    	    	
	    	    	
	    	    	
	    	    		
	    	    }
	    
	    }
	    while (control <= 29);
	    
	    
	    
	    
//		for (int a = 1; a <=clusterSizeController; a+=1)
//        {
//            
//            String wordGen[] = new String[200];
//            
//        do
//        {
//            idx = new Random().nextInt(words.length);
//            random = (words[idx]);   
//            wordGen = random.split("\\s");
//            wordGen = addElement(wordGen,random);
//            
//           
//            //sampleString = Arrays.toString(wordGen);
//            System.out.print(Arrays.toString(wordGen));
//            System.out.print(random + " ");
//            //System.out.print(random.length());
//            control += 1;
//            J += 1;            
//        }
//        while (J <= 4 && (random.length() < 29));
//        
//    
//            if (J == 5)
//            {
//                System.out.print("\n"); 
//                J = 0;                
//            }
//            if (control == 15)
//            	System.out.print("hello");
//            
//              
//        }
		
		
	}
	
}

	
	

