package com.String;

public class StringBuilderMain {

    public static void main(String[] args) {

        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and Goodbye");

        java.lang.StringBuilder helloWorldBuilder = new java.lang.StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        java.lang.StringBuilder emptyStart = new java.lang.StringBuilder();
        emptyStart.append("a".repeat(57));

        java.lang.StringBuilder emptyStart32 = new java.lang.StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart32);

        java.lang.StringBuilder builderPlus = new java.lang.StringBuilder("Hello" + " World");
        builderPlus.append(" and Goodbye");

        builderPlus.deleteCharAt(16).insert(16, 'g');
        System.out.println(builderPlus);

        builderPlus.replace(16, 17, "G");
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);
    }

    public static void printInformation(String string) {

        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }

    public static void printInformation(java.lang.StringBuilder builder) {

        System.out.println("StringBuilder = " + builder);
        System.out.println("length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());
    }


}
