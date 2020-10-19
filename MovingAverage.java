/*
Design a class, MovingAverage, which contains a method, next that is responsible for returning the moving average from a stream of integers.
Note: a moving average is the average of a subset of data at a given point in time.

Ex: Given the following series of events...

// i.e. the moving average has a capacity of 3.
MovingAverage movingAverage = new MovingAverage(3);
m.next(3) returns 3 because (3 / 1) = 3
m.next(5) returns 4 because (3 + 5) / 2 = 4 
m.next(7) = returns 5 because (3 + 5 + 7) / 3 = 5
m.next(6) = returns 6 because (5 + 7 + 6) / 3 = 6
*/

import java.util.*;

public class MovingAverage {
	Queue<Integer> q;
	int capacity;
	/**
	 * Initializes a MovingAverage with a
	 * capacity of `size`.
	 */
	public MovingAverage(int size) {
		q = new LinkedList<>();
		capacity = size;
	}

	/**
	 * Adds `val` to the stream of numbers
	 * and returns the current average of the numbers.
	 */
	public double next(int val) {
		//keep the no of elements in q exactly to capacity
		q.add(val);
		if(q.size() == capacity + 1)
   			q.poll();
   		
   		double sum = 0;
   		
   		for(int n : q)
   			sum += n;
   		
	   	return (sum / q.size());
	}
	
	public static void main(String ar[]){
		MovingAverage m = new MovingAverage(3);
		
		System.out.println(m.next(3));
		System.out.println(m.next(5));
		System.out.println(m.next(7));
		System.out.println(m.next(6));
	}
}

