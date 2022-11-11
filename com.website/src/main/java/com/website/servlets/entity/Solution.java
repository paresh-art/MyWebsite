package com.website.servlets.entity;

import java.util.*;
import java.io.*;

class Solution {
    
    public static boolean isPalindrome(String sub){
        //System.out.println(sub);
    	if(sub.equals(""))return false;
        int i =0;
        int j = sub.length()-1;
        while(i<j){
            if(sub.charAt(i)==sub.charAt(j)){
                i++;
                j--;
            }
            else return false;
            
        }
        return true;
    }
    
    public static void f(int idx,int n,String s,StringBuilder str,List<String> list){
        if(idx == n){
            if(isPalindrome(str.toString())) list.add(str.toString());
            return;
        }
        
        String sub = s.substring(idx,idx+1);
        //System.out.println(sub);
        str.append(sub);
        f(idx+1,n,s,str,list);
        str.deleteCharAt(str.length()-1);
        f(idx+1,n,s,str,list);
    }
        
    public static List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        
        for(int i=0;i<s.length()-1;i++){
            String sub = s.substring(0,i+1);
          //  System.out.println(sub);
            if(isPalindrome(sub)){
                List<String> list = new ArrayList<>();
                list.add(sub);
                f(i+1,s.length(),s,new StringBuilder(),list);
                ans.add(list);
            }
        }
       
       return ans; 
    }
    public static void main(String[] args) {
    	String s = "cdd";
    	System.out.println(partition(s));
    }
}