
package practica4_kata;

import practica4_kata.persistance.MailListReader;
import practica4_kata.view.HistogramDisplay;
import practica4_kata.view.MailHistogramBuilder;
import practica4_kata.model.Histogram;
import practica4_kata.model.Mail;
import java.util.List;

public class Practica4_kata {

    public static void main(String[] args) {
        
        String fileName = new String("email.txt");
        List<Mail> mailList = MailListReader.read(fileName);
        Histogram<String> mailHistogram = MailHistogramBuilder.build(mailList);
       
        HistogramDisplay histo = new HistogramDisplay(mailHistogram);
        histo.execute();
    }
}
