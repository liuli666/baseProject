package com.base.util.stringutil;

public class StringUtils {
   public static boolean isEmpty(String str){
	   if(str==null) return true;
	   if(str.equals("null")) return true;
	   if(str.equals(""))return true;
	   return false;
   }
   public static boolean isNotEmpty(String str){
	   if(str==null) return false;
	   if(str.equals("null")) return false;
	   if(str.equals(""))return false;
	   return true;
   }
   public static boolean isNotBlank(String str){
	   if(str==null) return false;
	   if(str.equals("null")) return false;
	   if(str.equals(""))return false;
	   return true;
   }
}
