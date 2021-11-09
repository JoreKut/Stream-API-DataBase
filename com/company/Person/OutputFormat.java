package com.company.Person;

public enum OutputFormat {
    WordLength(18),
    BracketLength(7);

    public static int wordLength = 18;
    public static int bracketLength = 7;
    public String value;

    OutputFormat(int value){
        this.value = "%-" + value + "s" ;
    }

}
