package com.test.basics;

public class palandrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="rotor";
		for(int i=s.length()-1;i>=0;i--){
			for(int j=i;j<=s.length();j++){
				
				if(s.charAt(i)!=s.charAt(j)){
					System.out.println("its  not palan");
				}else{
					System.out.println("its  palan");
				}
			}
		}
	}

}
