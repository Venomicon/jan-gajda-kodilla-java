package com.kodilla.stream;

import com.kodilla.stream.*;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier beautifier = new PoemBeautifier();

        beautifier.beautify("Ala ma kota.",(string) -> "ABC " + string + " ABC");
        beautifier.beautify("Ala ma kota.",(string) -> string.toUpperCase());
        beautifier.beautify("Ala ma kota.",(string) -> "***" + string + "***");
        beautifier.beautify("Ala ma kota.",(string) -> string + "( ͡° ͜ʖ ͡°)");

    }
}