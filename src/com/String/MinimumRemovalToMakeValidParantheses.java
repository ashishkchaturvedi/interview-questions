package com.String;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class MinimumRemovalToMakeValidParantheses {

	public static void main(String[] args) {
		String s = "lee(t(c)o)de)";
		System.out.println(minRemoveToMakeValid(s));

	}
	
	public static String minRemoveToMakeValid(String s){
		Set<Integer> indexesToRemove = new HashSet<>();
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '('){
				stack.push(i);
			}
			else if(s.charAt(i) == ')'){
				if(stack.isEmpty()){
					indexesToRemove.add(i);
				}
				else{
					stack.pop();
				}
			}
		}
			
		while(!stack.isEmpty()){
			indexesToRemove.add(stack.pop());
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++){
			if(!indexesToRemove.contains(i)){
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}

}
