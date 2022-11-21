package ss.spring.orm.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ss.spring.orm.bo.AccountBo;
import ss.spring.orm.dao.AccountDao;
import ss.spring.orm.entities.Account;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountService {
    @Autowired
    AccountDao accountDao;

    @Transactional(readOnly = true)
    public AccountBo getAccountBo(int id){
        AccountBo accountBo = new AccountBo();
        Account account = null;

        account = accountDao.getAccount(id);
        BeanUtils.copyProperties(account,accountBo);
        return accountBo;
    }

    @Transactional(readOnly = false,rollbackFor = Exception.class,noRollbackFor = RuntimeException.class,
            isolation = Isolation.READ_COMMITTED,timeout = 30,propagation = Propagation.REQUIRED)
    public int addNewAccount(AccountBo accountBo){
        Account account = new Account();
        BeanUtils.copyProperties(accountBo,account);
        return accountDao.saveAccount(account);
    }

    @Transactional(readOnly = false)
    public void updateAccount(AccountBo accountBo){
        Account account = new Account();
        BeanUtils.copyProperties(accountBo,account);
        accountDao.updateAccount(account);
    }

    public List<AccountBo> getAccount(String accountType){
        return accountDao.getAccounts(accountType).
                stream().
                map(account -> {
                    AccountBo accountBo = new AccountBo();
                    BeanUtils.copyProperties(account,accountBo);
                    return accountBo;})
                .collect(Collectors.toList());
    }
}
