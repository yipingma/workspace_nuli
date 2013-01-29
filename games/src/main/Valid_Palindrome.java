/*
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * 
For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.
 */
package main;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Object;

public class Valid_Palindrome {
	private static String myinput;
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
<<<<<<< HEAD
<<<<<<< HEAD
		// TODO Auto-generated method stub
		System.out.println("myp");
=======
=======
>>>>>>> f1874717c3456ffd84de22c23c0a3c6b7bf8af11
		//Scanner**
		Scanner input=new Scanner(System.in);
		System.out.println("Input the string:");
		myinput=input.nextLine();
		//int number = input.nextInt();
		//float decimal = input.nextFloat();

		int i, j;
		//ArrayList<element> array_name=new ArrayList()**
		ArrayList<String> mylist=new ArrayList();
		for(i=0; i<myinput.length(); i++){
			//Character.isLetter** determine if a char is a letter--Character.isDigit(ch), Character.isSpaceChar(ch)
			if(Character.isLetter(myinput.charAt(i))){
				//Character.toString()** convert char to string(arraylist.add() only support string as parameters)
				mylist.add(Character.toString(myinput.charAt(i)));				
			}
		}
		System.out.println(mylist);
		
		//size()** for arraylist, length()** is for array
		for(j=0; j<mylist.size(); j++){
			//arraylist.add(int index)**,arraylist.get(int index)**
			//equals()** equalsIgnoreCase()** comparing string should not use ==, which is comparing the reference
			if(mylist.get(j).equalsIgnoreCase(mylist.get(mylist.size()-1-j))){
				continue;
			}else{
				System.out.println("This is NOT a palindrome");
				return;
			}
		}
		System.out.println("COOL!!!! This is a palindrome");
<<<<<<< HEAD
>>>>>>> f1874717c3456ffd84de22c23c0a3c6b7bf8af11
=======
>>>>>>> f1874717c3456ffd84de22c23c0a3c6b7bf8af11
	}

}

