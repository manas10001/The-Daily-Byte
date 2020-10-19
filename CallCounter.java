/*
Create a class CallCounter that tracks the number of calls a client has made within the last 3 seconds. Your class should contain one method, ping(int t) that receives the current timestamp (in milliseconds) of a new call being made and returns the number of calls made within the last 3 seconds.
Note: you may assume that the time associated with each subsequent call to ping is strictly increasing.

Ex: Given the following calls to ping…

ping(1), return 1 (1 call within the last 3 seconds)
ping(300), return 2 (2 calls within the last 3 seconds)
ping(3000), return 3 (3 calls within the last 3 seconds)
ping(3002), return 3 (3 calls within the last 3 seconds)
ping(7000), return 1 (1 call within the last 3 seconds)

Question URL: https://leetcode.com/problems/number-of-recent-calls/
*/
import java.util.*;

class CallCounter{
	//queue to store stuff locally
	Queue<Integer> q;
	public CallCounter() {
	    q = new LinkedList<>();
	}
	
	public int ping(int t) {
	    q.add(t);
	    while(q.peek() < (t - 3000))
	        q.poll();
	    
	    return q.size();
	}
	
	public static void main(String ar[]){
		CallCounter cc = new CallCounter();
		System.out.println(cc.ping(1));
		System.out.println(cc.ping(300));
		System.out.println(cc.ping(3000));
		System.out.println(cc.ping(3002));
		System.out.println(cc.ping(7000));
	}
}
