package CurseWordFilter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class SensitiveWordInit {
    private String ENCODING = "UTF-8";

    public static final String separator = File.separator;

    public Set initKeyWord(){
        Set<String> wordSet = readSensiviteWordFile();
        return wordSet;
    }

    public Set<String> readSensiviteWordFile() {
        Set<String> wordSet = null;

        File file = new File("src/a/"  + "censorwords.txt");
/*        File file = new File("./c");*/

        try{
            InputStreamReader reader = new InputStreamReader(new FileInputStream(file), ENCODING);
            if (file.isFile() && file.exists()){
                wordSet = new HashSet<String>();
                BufferedReader bufferedReader = new BufferedReader(reader);
                String word = null;
                while((word = bufferedReader.readLine()) != null){
                    wordSet.add(word);
                }
                bufferedReader.close();
            }
            reader.close();
            for (String s : wordSet) {
                System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return wordSet;
    }

    public static void main(String[] args) {
        SensitiveWordInit s = new SensitiveWordInit();
        s.initKeyWord();
    }
}
