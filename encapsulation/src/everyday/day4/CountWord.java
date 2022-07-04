package everyday.day4;

/**
 * @Description 统计单词出现次数
 * @Author clovenine
 * @Date 2022/7/4 9:06

 */
public class CountWord {

    public static void main(String[] args){

    }

    public int wordCount(String article, String word){
        //1.先把文章打散
        // article.split(" ").var
        String[] words = article.split(" ");
        int res = 0;
        // word.fori
        for (int i = 0; i < words.length; i++) {
            if(words[i].equalsIgnoreCase(word)){//忽略大小写
                res++;
            }
        }
        return res;
    }

}
