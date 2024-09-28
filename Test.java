public class Test {
    public static void main(String[] args) {
        String fileName="/Users/suisei/Documents/pro2/p2_3_kadai4_1/resource/java.txt";

        int wordCount=WordCount.readFireAndWordCount(fileName);

        System.out.println("ファイル内の単語数:"+wordCount);
    }
}
