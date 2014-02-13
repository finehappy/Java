package IfStringAnagramsQuestion1_4;

public class IfStringAnagramsQuestion1_4 {

		public static boolean anagram(String s, String t) { //回文变换字母位置后左右对称；所有元素为偶数个；一个元素为奇数，其他为偶可构成回文
			if (s.length() != t.length()) return false;
			int[] letters = new int[256];
			int num_unique_chars = 0;
			int num_completed_t = 0;
			char[] s_array = s.toCharArray();
			for (char c : s_array) { // count number of each char in s，冒号指把s_array里的每个元素都拿出来放到c里.
				if (letters[c] == 0) ++num_unique_chars;
				++letters[c];
			}
			for (int i = 0; i < t.length(); ++i) {
				int c = (int) t.charAt(i);
				if (letters[c] == 0) { // Found more of char c in t than in s.
					return false;
				}
				--letters[c];
				if (letters[c] == 0) {
					++num_completed_t;
					if (num_completed_t == num_unique_chars) {
						// it抯 a match if t has been processed completely
						return i == t.length() - 1;
					}
				}
			}
			return false;
		}
		
		public static void main(String[] args) {
			String[][] pairs = {{"apple", "papel"}, {"carrot", "tarcor"}, {"hello", "llloh"}};
			for (String[] pair : pairs) {
				String word1 = pair[0];
				String word2 = pair[1];
				boolean anagram = anagram(word1, word2);
				System.out.println(word1 + ", " + word2 + ": " + anagram);
			}
		}
	}
