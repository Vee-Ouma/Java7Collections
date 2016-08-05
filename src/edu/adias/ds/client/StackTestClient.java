package edu.adias.ds.client;

import java.util.Scanner;

import edu.adias.ds.StackOfStrings;

public class StackTestClient {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		StackOfStrings stack = new StackOfStrings();

		while(sc.hasNext()){
			String s = sc.next();
			if(s.equals("-")){
				System.out.print(stack.pop()+" ");
			}else{
				stack.push(s);
			}
		}
		
		sc.close();
	}

}
