package UniqueCharactersQuestion1_1;

public class UniqueCharactersQuestion1_1 {

			public static boolean isUniqueChars(String str) {
				int checker = 0;
				for (int i = 0; i < str.length(); ++i) {
					int val = str.charAt(i) - 'a';
					if ((checker & (1 << val)) > 0) return false;
					checker |= (1 << val);
				}
				return true;
			}
			
			public static boolean isUniqueChars2(String str) {
				boolean[] char_set = new boolean[256];
				for (int i = 0; i < str.length(); i++) {
					int val = str.charAt(i);           //charAt(i)返回在i位置上的char的值
					if (char_set[val]) 
					{
						return false;
					}
					char_set[val] = true;
				}
				return true;
			}
			
			public static void main(String[] args) {
				String[] words = {"abcde", "hello", "apple", "kite", "padle"};
				for (String word : words) {
					System.out.println(word + ": " + isUniqueChars(word) + " " + isUniqueChars2(word));
				}
			}

	}

