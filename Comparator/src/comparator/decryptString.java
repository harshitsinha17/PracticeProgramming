package comparator;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


/*
aPple432
234Pa*ple000
*/
public class decryptString {

    /*
     * Complete the 'decryptPassword' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String decryptPassword(String s) {
    // Write your code here
        System.out.println(s);
        char arr [] =s.toCharArray();
    
        
        for(int i = 0;i<s.length()-1;i++){
            if(arr[i] == '*'){
                arr[i]=' ';
                
                continue;
            }
        
            if(Character.isDigit(arr[i]) && arr[i] !='0'){
            
                for(int j =s.length()-1;j>=0;j--){
                    if(arr[j] == '0'){
                    arr[j] = arr[i];
                    arr[i] = ' ';
                    break;
                    }
                }
                //i++;
            
            }
            else if(Character.isUpperCase(arr[i])){
                if(Character.isLowerCase(arr[i+1])){
                    char c = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = c;
                }
                //System.out.println(arr[i]+" "+arr[i+1]);
                i = i+2;
            }
        }
        
        

            if(Character.isDigit(arr[s.length()-1])){
            
                for(int j =s.length()-1;j>=0;j--){
                    if(arr[j] == '0'){
                    arr[j] = arr[s.length()-1];
                    arr[s.length()-1] = ' ';
                    break;
                    }
                }
                //i++;
            
            }
            else if( arr[s.length()-1] == '*' ){
                arr[s.length()-1] = ' ';
            }
        
        
        String a = new String(arr);
        a = a.replaceAll("\\s+", "");
        a = a.replaceAll("\\*", "");
        //System.out.println("******"+a);
        return a;
    
    }
    
    public static void main(String args[]) {
    	String x = decryptPassword("234Pa*ple000");
    	System.out.println(x);
    }

}

