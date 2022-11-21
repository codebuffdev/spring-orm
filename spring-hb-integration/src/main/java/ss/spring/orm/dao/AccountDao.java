package ss.spring.orm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import ss.spring.orm.entities.Account;

import java.util.List;

@Repository
public class AccountDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    public Account getAccount(int id) {
        return hibernateTemplate.get(Account.class, id);
    }

    public int saveAccount(Account account) {
        return (int) hibernateTemplate.save(account);
    }

    public void updateAccount(Account account) {
        hibernateTemplate.update(account);
    }

    public List<Account> getAccounts(String accountType) {
        return (List<Account>) hibernateTemplate.findByNamedQueryAndNamedParam("getAccountByAccountType", "accountType",accountType);
    }


}
