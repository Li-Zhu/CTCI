/*
Write a method to replace all spaces in a string with "%20". You may assume that the string has sufficient 
space at the end to hold the additional characters, and that you are given the "true" length of the string. 
*/

import java.util.*;

class URLify {

	public static void main(String[] args){
		char[] array = {'M','R',' ','J','o','h','n',' ','S','m','i','t','h',' ', ' ',' '};
		int l=13;
		System.out.println(doUrlify(array,l));
		

	}

	static char[] doUrlify (char[] sentence, int length){
		int spacecount = 0;
		for (int i =0; i < length; i++){
			if( sentence[i] ==' '){
				spacecount++;

			}
		}
		int newlength= length+ 2*spacecount;
		char[] newsentence = new char[newlength];
		int j=0;
		for (int i=0;i<length;i++){
			if (sentence[i]==' '){
				newsentence[j]='%';
				newsentence[j+1]='2';
				newsentence[j+2]='0';
				j+=3;

			}
			else{
				newsentence[j]=sentence[i];
				j++;

			}
		}
		return newsentence;

		
	}
	/*
	static char[] doUrlify (char[] str, int length){
		int spacecount = 0;
		for (int i = 0 ; i < length; i ++){
			if (str[i] ==' '){
				spacecount++;
			}
		}
		int newlength = length + 2*spacecount;
		//str[newlength] = '\0';
		for (int i = length -1; i>=0; i--){
			if (str[i] == ' '){
				str[newlength - 1] = '0';
				str[newlength - 2] = '2';
				str[newlength - 3] = '%';
				newlength = newlength- 3;
			}
			else{
				str[newlength-1] = str[i];
				newlength = newlength -1;
			}
		}
		return str;
	}
	*/
}
