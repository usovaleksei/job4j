package ru.job4j.collections.bank;

import java.util.*;

/**
 * Class main bank service
 * @author Aleksei Usov
 * @since 13/10/2020
 */

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * method to add new user
     * @param user info about user
     */
    public void addUser(User user) {
        this.users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * method to add new bank account
     * @param account
     * @param passport
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> userAccounts = this.users.get(user);
                if (!userAccounts.contains(account))
                    userAccounts.add(account);
        }
    }

    /**
     * method to find user with key passport
     * @param passport
     * @return username
     */
    public User findByPassport(String passport) {

        return this.users.keySet().stream()
                                  .filter(u -> u.getPassport().equals(passport))
                                  .findFirst().orElse(null);
    }

    /**
     * method to find account with key passport and requisite
     * @param passport
     * @param requisite
     * @return account
     */
    public Account findByRequisite(String passport, String requisite) {
        Account result = null;
        User user = findByPassport(passport);
        if (user != null) {
            result = this.users.get(user).stream()
                                         .filter(r -> r.getRequisite().equals(requisite))
                                         .findFirst().orElse(null);
            }
        return result;
    }

    /**
     * method to transfer money from one account to another account
     * @param srcPassport passport user sender
     * @param srcRequisite requisite user sender
     * @param destPassport passport user recipient
     * @param destRequisite requisite user recipient
     * @param amount amount for transfer
     * @return
     */

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account accountSrc = findByRequisite(srcPassport, srcRequisite);
        Account accountDest = findByRequisite(destPassport, destRequisite);
        if (accountSrc != null && accountDest != null && (accountSrc.getBalance() - amount) >=0) {
                    accountDest.setBalance(accountDest.getBalance() + amount);
                    accountSrc.setBalance(accountSrc.getBalance() - amount);
                    rsl = true;
            }
        return rsl;
    }
}
