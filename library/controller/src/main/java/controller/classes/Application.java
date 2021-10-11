package controller.classes;

import controller.classes.Library;
import org.gradle.internal.impldep.com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Scanner;

public class Application {
    private static String author;
    private static String answer;
    public static void main(String[] args) throws IOException {
        System.out.println("Введите имя автора (autor1 или autor2)");
        Scanner sc1 = new Scanner(System.in);
        author= sc1.nextLine();
        Library_factory lab = new Library_factory();
        answer = lab.getAuthor(author);
        StringWriter writer = new StringWriter();
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(writer, answer);
        String result = writer.toString();
        System.out.println(result);
    }

}
