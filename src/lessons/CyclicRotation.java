package lessons;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CyclicRotation {
	
	Random random;
	
	public CyclicRotation() {
		// TODO Auto-generated constructor stub
		
		random = new Random();
		
		for(int i = 0; i < 100; i++){
			int randomNum = random.nextInt(2);
			//System.out.print(randomNum);
		}
		
		int positiveNum = random.nextInt(101);
		int negativeNum = random.nextInt(101)*-1;
		int chooseNum = random.nextInt(2);
		
		int[] A = {-1,-4,-7};
		int K = 1000;
		
		solution(A,K);
	}
	
	public static void main(String[] args) {
		
		new CyclicRotation();
	}
	
	public int[] solution(int[] A, int K){
		
		int[] answer = new int[A.length];
		int[] tmp = new int[A.length + ((A.length-1)*K)];
		
		for(int i = 0; i < tmp.length; i++){
			
			if(i<A.length){
				tmp[i] = A[i];
			} else {
				tmp[i] = 0;
			}
		}
		
		for(int i = 0 ; i < tmp.length; i++){
			System.out.print(tmp[i]);
		}
		
		System.out.println("");
		
		for(int i = 0; i < (A.length-1)*K; i++){
			
			tmp[i+A.length] = tmp[i];
			
		}
		
		for(int i = 0 ; i < tmp.length; i++){
			System.out.print(tmp[i]);
		}
		
		System.out.println("");
		
		List<Integer> answerList = new ArrayList<>();
		
		for(int i = tmp.length-A.length; i < tmp.length; i++){					
			answerList.add(tmp[i]);
		}
		
		for(int i = 0; i < answerList.size(); i++){
			answer[i] = answerList.get(i);
		}
		
		for(int i = 0 ; i < answer.length; i++){
			System.out.print(answer[i]);
		}
		
		return answer;
	}

}
