package prob3;

public class Prob3 {
	
	public static void main(String args[]) {
		
		char[] array1 = reverse("Hello World");
		printCharArray(array1);
		
		char[] array2 = reverse("Java Programming!");
		printCharArray(array2);
		
	}
	
	public static char[] reverse(String str){
		/* 구현코드 */
		char[] array = new char[str.length()];
		for(int i=0;i<str.length();i++){
			array[i]=str.charAt(str.length()-i-1);
		}
		return array;
	}
	
	public static void printCharArray(char[] array){
		/* 구현코드 */
		System.out.println(array);
	}
}
