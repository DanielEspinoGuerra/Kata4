
package practica4_kata.model;

public class Mail {

    private final String mail;
    
    public Mail(String mail) {
        this.mail = mail;
    }
    
    public String getDomain() {
        return mail.substring(mail.indexOf("@") + 1);
    }
}
