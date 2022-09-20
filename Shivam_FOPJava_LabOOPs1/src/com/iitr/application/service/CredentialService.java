package com.iitr.application.service;

import java.util.Random;

public class CredentialService {
	
	/***
	 * 
	 * generatePassword
	 * @return 
	 */
	public String generatePassword() {
		 String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 String smallLetters = "abcdefghijklmnopqrstuvwxyz";
			String numbers = "0123456789";
			String specialCharacters = "!@#$%^&*_+=/.?<>)";
			
			String letters = capitalLetters + smallLetters + numbers + specialCharacters;
			int length =8;
			char[] password = new char[length];
			Random random = new Random();
			for(int index = 0; index < length; index++) {
				int randomNumber = random.nextInt(letters.length());
				char c = letters.charAt(randomNumber);
				password[index]= c;
			}
			return String.copyValueOf(password);
		
	}
	
	
	/**
	 * 
	 * 
	 * generateEmailAddress
	 * @return
	 */
	
	public String generateEmailAddress(String firstname,String lastName,String department) {
		return firstname+lastName+"@"+department+".company.com";
		
	}
	
	

	/**
	 * 
	 * 
	 * showcredentials
	 * @return
	 */
	
	public void showCredentials(String email, String password) {
		System.out.println("Email "+ email);
		System.out.println("Password "+ password);
		
	}

}
