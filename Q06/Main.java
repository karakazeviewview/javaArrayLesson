import java.util.*;
public class Main{
	public static void main(String[] args){
		System.out.print("単語を入れてね>");
		String word=new Scanner(System.in).next();
		//文字数をもとにchar配列を作成(配列変数名chars)
		char[] chars=new char[word.length()];
		for(int i=0;i<chars.length;i++){
			//配列にお尻の文字から詰めていく処理、尻から詰めるには、文字数-1-i
			chars[i]=word.charAt(chars.length-1-i);
		}
		System.out.println(Arrays.toString(chars));
	}
}

/*
public class Main7{
  public static void main(String[] args){
    System.out.print("単語を入れてね>");
    String word=new Scanner(System.in).next();
    char[] chars=new char[word.length()];
    for(int i=chars.length-1;i>=0;i--){
      chars[i]=word.charAt(i);   
      System.out.println(chars[i]);
    }
	}
}
*/


