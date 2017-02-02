    /**
     * 
     */
    package com.svr.strings;
    
    import java.lang.reflect.Field;
    
    /**
     * @author Venkata Saripella
     *
     */
    public class AnagramAndReverse {
    
    /**
    * @param args
     * @throws IllegalAccessException 
     * @throws IllegalArgumentException 
     * @throws SecurityException 
     * @throws NoSuchFieldException 
    */
    public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        
    if(args.length >0){
        String name = args[0];
        /**
         * 
         *  check reverse string ways
         */
    System.out.println("Actual : "+name +" reverse : "+reflection(name)); 
    System.out.println("Actual : "+name +" reverse : "+stringtoCharArrayMethod(name)); 
    System.out.println("Actual : "+name +" reverse : "+stringcharAtMethod(name)); 
    System.out.println("Actual : "+name +" reverse : "+sBReverseMethod(name)); 
    System.out.println("Actual : "+name +" reverse : "+stringSplitMethod(name));
    boolean status  = checkAnagram(name);
    if(status){
    System.out.println("Given name is  Anagram :: "+name);
    }else{
    System.out.println("Given name is not Anagram :: "+name);
    }
    }else{
        System.out.println("Enter anagram string for checking");
    }
    
    }
    public static boolean checkAnagram(String name) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
        
       return (name != null && name.equals(reflection(name))) ? true : false;
    }
    
    public static String sBReverseMethod(String name){
        if (name.length() < 2) {
            return name;
        }
         return new StringBuffer(name).reverse().toString();
    }
    
    public static String stringtoCharArrayMethod(String name){
        if (name.length() < 2) {
            return name;
        }
        char[]       chars = name.toCharArray();
        int          length = chars.length;
        char[]       rev    = new char[length];
        int          size   = chars.length - 1;
        for (int i = 0; i < length; i++) {
        rev[i] = chars[size--];
        }
       return new String(rev);
    }
    
    public static String stringcharAtMethod(String name){
        if (name.length() < 2) {
            return name;
        }
        int          length = name.length();
        char[]       chars  = new char[length];
        for(int i=0; i<length; i++){
        chars[i] = name.charAt(i);
        }
        char[]       rev    = new char[length];
        int          size   = chars.length -1;
        for (int i = 0; i < length; i++) {
        rev[i] = chars[size--];
        }
        return new String(rev);
     }
    
    public static String reflection(String name) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
        if (name.length() < 2) {
            return name;
        }
        Field  declaredFied = String.class.getDeclaredField("value");
        declaredFied.setAccessible(true);
        char[]       chars  = (char[]) declaredFied.get(name);
        Integer      length = chars.length;
        char[]       rev    = new char[length];
        Integer      size   = chars.length -1;
        for (int i = 0; i < length; i++) {
        rev[i] = chars[size--];
        }
        return new String(rev);
     }
    
    public static String stringSplitMethod(String name){
        if (name.length() < 2) {
            return name;
        }
        String[]     strings = name.split("");
        int          length  = strings.length;
        String[]     rev     = new String[length];
        int          size    = strings.length - 1;
        for (int i = 0; i < length; i++) {
        rev[i] = strings[size--];
        }
       return String.join("", rev);
    }
    
    
}