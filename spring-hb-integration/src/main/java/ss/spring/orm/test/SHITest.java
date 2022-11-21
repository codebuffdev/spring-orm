package ss.spring.orm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ss.spring.orm.bo.AccountBo;
import ss.spring.orm.config.RootConfig;
import ss.spring.orm.entities.Account;
import ss.spring.orm.service.AccountService;

public class SHITest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(RootConfig.class);
        AccountService accountService = applicationContext.getBean(AccountService.class);

        //get Account
        /*AccountBo bo = accountService.getAccountBo(1);
        System.out.println(bo);*/

        //add account
        /*
        AccountBo account = new AccountBo("James" , "saving", 1000, "86969568", "james.gmail.com");
        int newAccountPK = accountService.addNewAccount(account);
        System.out.println(newAccountPK);*/

        //update account
        /*AccountBo accountInfo = accountService.getAccountBo(2);
        System.out.println(accountInfo);
        accountInfo.setAccountType("Saving");
        accountService.updateAccount(accountInfo);
        accountInfo = null;
        accountInfo = accountService.getAccountBo(2);
        System.out.println(accountInfo);*/

        //hql query
        accountService.getAccount("saving").forEach(System.out::println);

    }
}
