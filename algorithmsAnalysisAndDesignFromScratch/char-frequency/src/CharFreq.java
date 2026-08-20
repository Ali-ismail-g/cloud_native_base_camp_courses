public class CharFreq {
    public CharFreq(){}
    public static void asciiMethod(String message){
        int[] freq = new int[Character.MAX_VALUE + 1];
        for(int i=0;i< message.length();i++){
            int current_code = (int)message.charAt(i);
            freq[current_code]++;
        }
        for(int i=0;i< freq.length;i++){
            if(freq[i] > 0){
                char c = (char) i;
                System.out.println(c + " : " + freq[i]);
            }
        }
    }
}
