import java.util.Arrays;

class Problem2 {
    public static void main(String[] args) {
        char[] ch = {'a', 'a', 'a', 'a', 'b', 'b', 'b', 'c', 'c', 'c', 'c'};
        System.out.print(Arrays.toString(ch) + " = ");
        int[] freq = new int[ch.length];
        int i;
        String str = "";
        for (i = 0; i < ch.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    freq[i]++;
                    ch[j] = '0';
                }
            }
        }
        for (i = 0; i < freq.length; i++) {
            if (ch[i] != ' ' && ch[i] != '0')
                System.out.print(ch[i] + "" + freq[i]);
        }

    }

}
