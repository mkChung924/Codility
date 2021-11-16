package lessons;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryGap {
	
	int N, answerN;
	
	public BinaryGap() {
		
		N = 1610612737;
		answerN = solution(N);
		System.out.println(answerN);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BinaryGap();

	}
	
	public int solution(int number){
		
		int divider = 2;			
		
		List<Integer> binaryNumber = new ArrayList<>();
		int quotient = 0;
		int remainder = 0;
		
		boolean isContinue = true;
		
		while (isContinue){				
									
			quotient = number/divider;
			remainder = number%divider;
			
			//System.out.println(""+ quotient + "--- " + remainder);

			binaryNumber.add(remainder);
			
			number = quotient;
			
			if(quotient < 2){
				binaryNumber.add(number);
				isContinue = false;
			}
			
		}
		
		//System.out.println(binaryNumber);
		Collections.reverse(binaryNumber);
		//System.out.println(binaryNumber);		
		
		List<Integer> indexList = new ArrayList<>();
		List<Integer> numberList = new ArrayList<>();
		
		isContinue = true;
		
		int idx = 0;
		while (isContinue){
			
			int tmpNum = idx;
			idx = binaryNumber.indexOf(1);
			//System.out.println(idx);
			if(idx < 0){
				break;				
			}
			if(!indexList.isEmpty()){
				numberList.add(idx-tmpNum);
				indexList.add(idx+1);				
			} else {
				indexList.add(idx+1);
			}
			
			binaryNumber.remove(idx);
					
		}
		
		//System.out.println(indexList);
		//System.out.println(numberList);
		
		//System.out.println(Collections.max(numberList));
		
		int answer = 0;
		if(!numberList.isEmpty()){
			answer = Collections.max(numberList);
		}
		
		
		return answer;
		
	}
	
	

}
