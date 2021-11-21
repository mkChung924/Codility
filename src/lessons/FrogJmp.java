package lessons;

/* 
A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.

Count the minimal number of jumps that the small frog must perform to reach its target.

Write a function:

class Solution { public int solution(int X, int Y, int D); }

that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.

For example, given:

  X = 10
  Y = 85
  D = 30
the function should return 3, because the frog will be positioned as follows:

after the first jump, at position 10 + 30 = 40
after the second jump, at position 10 + 30 + 30 = 70
after the third jump, at position 10 + 30 + 30 + 30 = 100
Write an efficient algorithm for the following assumptions:

X, Y and D are integers within the range [1..1,000,000,000];
X ≤ Y.
Copyright 2009–2021 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
*/

public class FrogJmp {
	
	public FrogJmp() {
		// TODO Auto-generated constructor stub
		
		int currentPosition = 60;
		int targetPosition = 60;
		int jumpDistance = 27;
		
		int answer = solution(currentPosition, targetPosition, jumpDistance);
		System.out.println("The answer is [ "+ answer + " ]");
	}
	
	public static void main(String[] args) {
		new FrogJmp();
	}
	
	public int solution(int X, int Y, int D){
		
		int answer = 0;
		
		int remainedDistance = Y-X;
		
		if(remainedDistance == 0){
			return answer;
		}
		
		if(D-remainedDistance > 0){
			
			answer = 1;
			
		} else {
			
			int num = remainedDistance/D;
			int remainder = remainedDistance%D;
			
			if(remainder > 0){
				answer = num+1;
			} else {
				answer = num;
			}
			
		}
		
		return answer;
	}

}
