import java.util.ArrayList;
import java.util.Random;


public class Engine{

	String random;
	String sampleString;
	String wordGen[];

	int idx;
	int control = 0;	//this is meant to control the length of the generation
	int control2 = 0;
	int i = 0;//this is meant to control the amount of words in one row

	ArrayList<String> wordBank = new ArrayList<String>();
	
	//static TypingTest obj = new TypingTest();

	String[] words = new String[]{"a","this","that","those","their","the","him",
			"his","her","apple","umbrella","doctor","bicycle","question","word",
			"entity","read","your","impossible","open","possible","surely","unrelated",
			"algebra","document","message","period","item","quest","typing","blink",
			"touch","smell","taste","hear","feel","amazing","happy","sad","confused",
			"female","male","church","believe","wonderful","concerned","related",
			"priest","fruit","banana","peach","steal","return","favor","mister"};

	public ArrayList<String> generateRandomArray()
	{

		do
		{
			idx = new Random().nextInt(words.length);
			random = (words[idx]);   
			//wordGen = random.split("\\s");

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

				//obj.getInput();
				

			}

		}
		while (control <= 31);
		return wordBank;

	}
	public void clearConsole()
	{
		do
		{
			System.out.println("\n");
			i += 1;
		}
		while (i <= 16);
		
	}
	

}




