import java.io.FileReader;
import java.io.File;
import java.io.IOException;
public class WordCount {
    static int readFireAndWordCount(String fileName){
        int wordCount=0;//return 単語数のカウント
        boolean isWord=false;//単語の一部か判定する

        try(FileReader fr=new FileReader(fileName)){
            int nowChar;//今読み込んだ文字
            while((nowChar=fr.read())!=-1){
                if(nowChar==' '||nowChar=='\n'){//今読み込んだ文字が空白か改行だったら
                    if(isWord){//直前まで文字が続いていた場合
                        wordCount++;//空白までのnowcharを１単語とみなす
                        isWord=false;//reset
                    }
                }else{//今読み込んだ文字が本当にただの文字だったら
                    isWord=true;//単語の一部だと判定する
                }
            }
            if(isWord){//最後に文字があれば
            wordCount++;//それを単語とカウントする
            }
        }catch(IOException e){
            System.out.println("ファイルの読み込み中にエラーが発生しました:"+e.getMessage());
        }
            return wordCount;
    }
}
