
package practica4_kata;

import practica4_kata.persistance.MailListReader;
import practica4_kata.view.HistogramDisplay;
import practica4_kata.view.MailHistogramBuilder;
import practica4_kata.model.Histogram;
import practica4_kata.model.Mail;
import java.util.List;

public class Practica4_kata {
    
    private static String fileName;
    private static List<Mail> mailList;
    private static Histogram<String> mailHistogram;
    
    public static void main(String[] args) {
        fileName = "email.txt";
        execute();
    }
    
    private static void execute() {
        input();
        process();
        output();
    }

    private static void input() {
        mailList = MailListReader.read(fileName);
    }

    private static void process() {
        mailHistogram = MailHistogramBuilder.build(mailList);
    }

    private static void output() {
        new HistogramDisplay(mailHistogram).execute();
    }
}
