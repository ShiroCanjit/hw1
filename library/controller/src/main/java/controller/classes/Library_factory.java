package controller.classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Library_factory {
    File file = new File("file1");


       public String getAuthor(String author) throws IOException {
           FileReader fr = new FileReader(file);
           String find = null;
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                find = sc.nextLine();
                if(find.contains(author)) break;
        }
        fr.close();
        return find;
    }

    public ArrayList<String> getLibrary() throws IOException {
        ArrayList<String> lib = new ArrayList<String>();
        FileReader fr = new FileReader(file);
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            lib.add(sc.nextLine()) ;
        }
        fr.close();
        return lib;
    }

}
