import java.time.LocalDate;
import java.util.List;

public class Customer {
    
    private String fullName;
    private LocalDate birthday;
    private String residence;
    private long numberPhone;
    private String email;
    private String id;
    private List<Account> accountList;

    public Customer() {}

    public Customer(String fullName, LocalDate birthday, String residence
    , long numberPhone, String email, List<Account> accounts, String id) {

        this.fullName = fullName;
        this.birthday = birthday;
        this.residence = residence;
        this.numberPhone = numberPhone;
        this.email = email;
        this.accountList = accounts;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
    
    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String getResidence() {
        return residence;
    }

    public void setNumberPhone(long numberPhone) {
        this.numberPhone = numberPhone;
    }

    public Long getNumberPhon() {
        return numberPhone;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void getAccountList(List<Account> accounts) {
        this.accountList = accounts;
    }
}
