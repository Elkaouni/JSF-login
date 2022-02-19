package beans;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@ManagedBean
@ApplicationScoped
public class SignUpBean {
    private String login, password;
    private String nom, prenom;
    private Date birth;
    private String adresse;
    private String ville;
    private int postal;
    private String pays;
    private String numRue, nomRue;
    private String villePostal;

    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public Date getBirth() {
        return birth;
    }
    public String getAdresse() {
        return adresse;
    }
    public String getVille() {
        return ville;
    }
    public int getPostal() {
        return postal;
    }
    public String getPays() {
        return pays;
    }
    public String getVillePostal() {
        return villePostal;
    }
    public String getNumRue() {
        return numRue;
    }
    public String getNomRue() {
        return nomRue;
    }
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }

   
    public String signUp(){
        if(login.equals(password))
            return "error";
        else{
            Pattern pattern = Pattern.compile("[a-z]+[a-z0-9\\.]*", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher("Visit W3Schools!");
            boolean matchFound = matcher.find();
            if(matchFound) {
                System.out.println("Match found");
            } else {
                System.out.println("Match not found");
            }
        }
        return "user";
    }
}
