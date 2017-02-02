/**
 * 
 */
package com.svr.strings;

/**
 * @author Venkata Saripella
 *
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class MostOccuredWordsInFile {

/**
* @param args
* @throws IOException 
*/
public static void main(String[] args) throws IOException {
List<String>         words       = new ArrayList<String>();
Map<String, Integer> wordsCount  = new LinkedHashMap<String, Integer>();

if(args.length >0 && args[0] != null){
BufferedReader br     = new BufferedReader(new FileReader(args[0]));
String         line   = br.readLine();
while( line != null){
for(String word : line.split(" ")){
words.add(word);
}
line = br.readLine();
}
br.close();
for(String word : words){
    wordsCount.put(word, wordsCount.containsKey(word)? wordsCount.get(word)+1 : 1);
}
System.out.println("Total word's count :: "+wordsCount);
List<WordCount> list=new ArrayList<WordCount>();
for(Map.Entry<String, Integer> entry : wordsCount.entrySet()){
WordCount wordCount = new WordCount();
wordCount.setNo(entry.getValue());
wordCount.setName(entry.getKey());
list.add(wordCount);
}
Collections.sort(list,new WordCount());
System.out.println("Sorted List of word's and count :: "+ list);
int count = 0;
for(WordCount mostOccured : list){
System.out.println(mostOccured);
if(count ==2) break;
count++;
}
}else{
System.out.println("Give a valid file location");
}
}

}
