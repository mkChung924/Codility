package lessons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermMissingElem {
	
	public PermMissingElem() {
		// TODO Auto-generated constructor stub
		/*int[] A = new int[100000];
		
		for(int i = 0; i < 100000; i++){
			A[i] = i+1;
		}*/
		
		int[] A = {1};
		
		int answer = solution(A);
		
		System.out.println("The answer is " + answer);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new PermMissingElem();

	}
	
	public int solution(int[] A){
		int answer = 0;
		
		int length = A.length;
		
		List<Integer> numList = new ArrayList<Integer>();
		
		if(length == 0){
			
			answer = 1;
			
		} else if(length == 1){
			
			if(A[0] != 1) {
				answer = 1;
			} else {
				answer = A[0];
			}
			
		} else {
			
			for(int i = 0; i < A.length; i++){
				numList.add(A[i]);
			}
			
			Collections.sort(numList);
			
			int startNum = numList.get(0);
			
			if(startNum != 1){
				
				answer = 1;
				
			} else {
				
				for(int i = 0; i < length; i++){				
					
					if(i+startNum != numList.get(i)){
						answer = i+startNum;
						break;
					} else {
						answer = i+startNum+1;
					}
					
				}
				
			}					
			
		}
		
		
		return answer;
	}

}
