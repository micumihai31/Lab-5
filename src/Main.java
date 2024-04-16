import java.util.HashMap;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.io.File;



public class Main {

    public static void main(String[] args) throws FilenotFoundException {
        HasMap<String,Integer> map=new HasMap<String, Integer>();
        Scanner fisier= new Scanner(new File("C:\\Users\\Mihai\\IdeaProjects\\Lab.5\\src"));
        while (fisier.hasNext()){
            String word=fisier.next();
            if(map.containsKey(word)){
                int count=map.get(word)+1;
                map.put(word,count);
            }else{
                map.put(word,1);
            }
        }
        fisier.close();
        for(Map.Entry<String,Integer>entry:map.entrySet()){
            System.out.println(entry);
        }






    }
}