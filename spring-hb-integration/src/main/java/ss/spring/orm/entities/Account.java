package ss.spring.orm.entities;

import javax.persistence.*;

@Entity
@Table(name = "account")
@NamedQueries({
        @NamedQuery(name = "getAccountByAccountType", query = "from Account a where accountType like :accountType")
})
public class Account implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_no")
    protected int accountNo;
    @Column(name = "account_holder_name")
    protected String accountHolderName;
    @Column(name = "account_type")
    protected String accountType;
    @Column(name = "balance")
    protected double balance;
    @Column(name ="mobile_no")
    protected String mobileNo;
    @Column(name = "email_address")
    protected String emailAddress;

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", accountType='" + accountType + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", balance=" + balance +
                '}';
    }


    public Account() {
        //no param
    }
}
