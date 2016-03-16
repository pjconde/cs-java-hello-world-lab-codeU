package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        // I won't work!
        String temp = System.getProperty("java.version");
        Double v = Double.parseDouble(temp.substring(0,3));
        return v;
    }

    public static void main(String[] args) {
	    // you can test the output of getVersion() here
        System.out.println(getVersion());
    }
}
