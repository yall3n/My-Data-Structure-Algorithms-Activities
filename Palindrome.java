import java.util.Scanner;

public class Palindrome{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		boolean isPalindrome = true;
		System.out.println("Enter a word: ");
		String word = scan.nextLine();

		for(int a = 0; a < word.length()/2; a++){
			if(word.charAt(a)!=word.charAt(word.length()-1-a)){
				isPalindrome = false; break;
				}
			}

			if(isPalindrome){
				System.out.println("Palindrome");
				}else{
					System.out.println("Not Palindrome");
					}


		scan.close();
		}
	}