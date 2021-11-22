package lessons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TapeEquilibrium {
	
	public TapeEquilibrium() {
		// TODO Auto-generated constructor stub
		
		int[] A = {3,1,2,4,3};
		int[] B = new int[100001];
		for(int i = 0; i < 100001; i++){
			if(i > 1000){
				B[i]=i;
			} else {
				B[i]=i/102;
			}
						
		}
		int answer = solution2(A);
		System.out.println("The answer is " + answer);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TapeEquilibrium();

	}

	public int solution(int[] A){
		
		int answer = 0;
		
		int pSize = A.length-1;
		
		List<Integer> numList = new ArrayList<Integer>();
		
		System.out.println("Array Size : " + A.length);
		
		for(int i = 1; i <= pSize; i++){
			
			int[] start = {0, i-1};
			int[] end = {i, pSize};
			
			int startNum = 0;
			int endNum = 0;
			
			for(int j = start[0]; j <= start[1]; j++){
				startNum += A[j];
			}
			
			for(int j = end[0]; j <= end[1]; j++){
				endNum += A[j];
			}
			
			answer = startNum - endNum;
			if(answer < 0){
				answer *= -1;
			}
			
			
			numList.add(answer);
			
		}
		
		if(!numList.isEmpty()){
			Collections.sort(numList);			
			answer = numList.get(0);
		}
						
		return answer;
	}
	
	public int solution2(int[] A){
		int answer = 0;
		
		List numList = new ArrayList<>();
		
		int left = 0;
		int right = 0;
		int sum = 0;
		
		for(int i = 0; i < A.length; i++){
			sum += A[i];
		}
		
		for(int i = 1; i < A.length; i++){
			left += A[i-1];
			right = sum-left;
			numList.add(Math.abs(left-right));
		}
		
		answer = (int)Collections.min(numList);
		
		return answer;
	}
}
