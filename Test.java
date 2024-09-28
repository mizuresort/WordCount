public class Test {
    public static void main(String[] args) {
        String fileName="path of file";

        int wordCount=WordCount.readFireAndWordCount(fileName);

        System.out.println("ファイル内の単語数:"+wordCount);
    }
}
