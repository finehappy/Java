package careercup;


public class careercup {
	
	public static void main(String[] args){
		int i = 1;
		 System.out.println("aaaaa");
		 String s;
		 System.out.println("true ����û���ظ��ģ�false�������ظ��ģ������"+ isUniqueChars2("abcdefghijklmn13455%^&*#)"));
		 
	}
	 public static boolean isUniqueChars2(String str) { 
		  boolean[] char_set = new boolean[256]; 
		  try
		  {
		  for (int i = 0; i < str.length(); i++) { 
			  int val = str.charAt(i);      
		      if (char_set[val]) return false; 
		            char_set[val] = true; 
		  } 
		  
		  }catch(IndexOutOfBoundsException e)
		  {
			  System.out.println(e.getMessage());
		  }
		  return true; 
	 } 

}
