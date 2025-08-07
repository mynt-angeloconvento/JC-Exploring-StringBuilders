package org.example;

public class ExploringStringBuilder {
    public static void main(String[] args) {

        // // Prediction: "Hello, Cadets!"
        // StringBuilder sb = new StringBuilder("Hello");
        // sb.append(", Cadets!");
        // System.out.println(sb);
        // sb.append(" Welcome to");
        // sb.append(" 2025");
        // sb.append(".");
        // System.out.println(sb);

        // Prediction: "Java is really great!"
        StringBuilder sb = new StringBuilder("Java is great!");
        sb.insert(8, "really ");
        System.out.println(sb);
    }
}