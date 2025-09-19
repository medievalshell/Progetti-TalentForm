package com.string;

public class TextBlockMain {


    public static void main(String[] args) {

        String text = """
                Example text     
                
                
                
      
             """;

        System.out.println(text);

        String escape = """
                                
                 This is a long test which looks to \\
                 have a newline but actually does not""\";
                """;

        System.out.println(escape);
    }
}

