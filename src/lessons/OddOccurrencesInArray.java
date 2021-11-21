package lessons;

import java.util.HashMap;
import java.util.Iterator;

public class OddOccurrencesInArray {

	public OddOccurrencesInArray() {
		// TODO Auto-generated constructor stub
		
		int[] array = {9,3,9,3,9,7,9};
		
		int answer = solution3(array);
		System.out.println("");
		System.out.println("Answer is a number [ " + answer + " ]");
		
	}
	
	public static void main(String[] args) {
		new OddOccurrencesInArray();
	}
	
	public int solution(int[] A){
		
		HashMap<Integer, Boolean> hashMap = new HashMap<>();
		int answer = 0;
		
		for(int i = 0; i < A.length; i++){
			
			if(hashMap.get(A[i]) != null){						
				hashMap.put(A[i], true);
				continue;
			}			
			
			hashMap.put(A[i], false);
			
		}
		
		Iterator<Integer> keys = hashMap.keySet().iterator();
		while ( keys.hasNext() ){
			int key = keys.next();
			boolean isPaired = hashMap.get(key);
			System.out.println("key : " + key + ", value : " + isPaired);
			
			if(!isPaired){
				answer = key;
				break;
				
			}
			
		}
		
		return answer;
	}
	
	public int solution2(int[] A){
		
		HashMap<Integer, HashMap<Integer, Integer>> hashMap = new HashMap<>();
		int answer = 0;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < A.length; i++){
			
			
			
			if(hashMap.get(A[i]) != null){
				//System.out.println("index : " + i);
				map = hashMap.get(A[i]);
				int count = map.get(A[i]);				
				//System.out.println("key : " + A[i] +", count : " + count);
				map.put(A[i], count+1);			
				hashMap.put(A[i], map);
				continue;
			}			
			
			map.put(A[i], 1);			
			hashMap.put(A[i], map);
									
		}				
		
		Iterator<Integer> keys = hashMap.keySet().iterator();
		while ( keys.hasNext() ){						
			int key = keys.next();
			
			//HashMap<Integer, Integer> map = hashMap.get(key);			
			map = hashMap.get(key);
			int count = map.get(key);			
			System.out.println("key : " + key +", count : " + count);
			
			if(count%2>0){
				answer = key;
			}
			
		}
		
		return answer;
	}
	
	public int solution3(int[] A){
		
		int answer = 0;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < A.length; i++){
			
			if(map.get(A[i]) != null){
				//System.out.println("index : " + i);
				int count = map.get(A[i]);				
				//System.out.println("key : " + A[i] +", count : " + count);
				map.put(A[i], count+1);			
				continue;
			}			
			
			map.put(A[i], 1);			
									
		}				
		
		Iterator<Integer> keys = map.keySet().iterator();
		while ( keys.hasNext() ){						
			int key = keys.next();
			int count = map.get(key);			
			System.out.println("key : " + key +", count : " + count);
			
			if(count%2>0){
				answer = key;
				break;
			}
			
		}
		
		return answer;
	}
	
}
