
package practica4_kata.persistance;

import practica4_kata.view.MailParser;
import practica4_kata.model.Mail;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MailListReader {

    public static List<Mail> read(String fileName) {
        List<Mail> list = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            while(true) {
                String line = reader.readLine();
                if (line == null) break;
                
                if(MailParser.isMail(line)) {
                    list.add(new Mail(line));
                }    
            }
        } catch (FileNotFoundException exception) {
            System.out.println("ERROR MailListReader::read (File not Found) " + exception.getMessage());
        } catch (IOException exception) {
            System.out.println("ERROR MailListReader::read (IO) " + exception.getMessage());
        }
        return list;
    }
    
}
