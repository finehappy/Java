package RemoveDuplicateCharactersQuestion1_3;
import CareerCupLibrary.AssortedMethods;

public class RemoveDuplicateCharactersQuestion1_3 {

		public static void removeDuplicates(char[] str) {
			if (str == null) {
				return;
			}
			int len = str.length;
			if (len < 2) {
				return;
			}
			int tail = 1;
			
			for (int i = 1; i < len; ++i) {
				int j;
				for (j = 0; j < tail; ++j)
					if (str[i] == str[j]) {
						break;
					}
				if (j == tail) {
					str[tail] = str[i];
					++tail;
				}
			}
			str[tail] = 0;
		} 
		
		public static void removeDuplicatesEff(char[] str) {
			if (str == null) return;
			int len = str.length;
			if (len < 2) return;

			boolean[] hit = new boolean[256];
		
			hit[str[0]] = true;

			int tail = 1;
			for (int i = 1; i < len; ++i) 
			{
				if (!hit[str[i]]) 
				{
					str[tail] = str[i];
					++tail;
					hit[str[i]] = true;
				}
				int s= 1;
			}
			str[tail] = 0;
		}
		
		public static void main(String[] args) {
			String s = "helloiloveyou";
			
			char[] arr = s.toCharArray();
			removeDuplicatesEff(arr);
			System.out.print(AssortedMethods.charArrayToString(arr));
		}

	}
