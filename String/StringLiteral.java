public class StringLiteral {
    public static void main(String[] args) {
        // string is immutable
        // String char[]
        String str = "kaushal";
        String str5 = new String("hello");
        // StringBuilder sb = new StringBuilder
        // StringBuffer(0)
        
        //string declare using string literal
        String str1 = "kaushal";
        String str2 = "kaushal";
        
        // equals function is used to compare strings contents
        if(str2.equals(str2)){
            System.out.println("yes");
        }
        if(str1 == str2){
            System.out.println("both string points to same memory");
        }else{
            System.out.println("no");
        }

        String str3 = new String("kaushal");
        if(str1 == str3){
            System.out.println("yes");
        }else{
            System.out.println("this will print no");
        }

        // compareTo function is used to compare strings lexographically
        // it returns a 0 is string equals
        // if s1 > greater then it will return positive value else negative
        int res = str1.compareTo(str2);
        System.out.println("compareTo = "+res);
        
        int res1 = str1.compareTo(str5);
        System.out.println("compareTo = "+res1);

        //contains function return boolean value
        System.out.println(str1.contains("kau"));

        // indexOf return negative if string not present else first occurrence
        // 2nd parameter [start index of search string]
        System.out.println(str1.indexOf("kau"));

        
    }
}
