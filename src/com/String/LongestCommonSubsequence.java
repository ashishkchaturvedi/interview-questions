package com.String;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		String text1 = "ABCDGHLQR";
        String text2 = "AEDPHR";
        System.out.println(longestCommonSubsequence(text1, text2));

	}
	
	public static int longestCommonSubsequence(String text1, String text2){
		StringBuilder sb = new StringBuilder();
		if(text1.length() == text2.length()) return 0;
		int[][] dp = new int[text1.length()+1][text2.length()+1];
		
		for(int i = 1; i < dp.length; i++){
			for(int j = 1; j < dp[0].length; j++){
				if(text1.charAt(i-1) == text2.charAt(j-1)){
					dp[i][j] = dp[i-1][j-1] + 1;
					sb.append(text1.charAt(i-1));
				}
				else{
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		System.out.println(sb.toString());
		return dp[text1.length()][text2.length()];
	}

}
