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
        /*if (!users.containsKey(user))
        this.users.put(user, new ArrayList<Account>());*/
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
            if (userAccounts != null) {
                if (!userAccounts.contains(account))
                    userAccounts.add(account);
            }
        }
    }

    /**
     * method to find user with key passport
     * @param passport
     * @return username
     */
    public User findByPassport(String passport) {
        User result = null;
        Set<User> userList = this.users.keySet();
        for (User user: userList) {
            if (user.getPassport().equals(passport))
                result = user;
                break;
        }
        return result;
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
            List<Account> userAccounts = this.users.get(user);
            if (userAccounts != null) {
                for (Account account : userAccounts) {
                    if (account.getRequisite().equals(requisite)) {
                        result = account;
                        break;
                    }
                }
            }
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
        User userSrc = findByPassport(srcPassport);
        Account accountSrc = findByRequisite(srcPassport, srcRequisite);
        if (userSrc != null && accountSrc != null) {
            if ((accountSrc.getBalance() - amount) >= 0) {
                User userDest = findByPassport(destPassport);
                Account accountDest = findByRequisite(destPassport, destRequisite);
                if (userDest != null && accountDest != null) {
                    accountDest.setBalance(accountDest.getBalance() + amount);
                    accountSrc.setBalance(accountSrc.getBalance() - amount);
                    rsl = true;
                }
            }
        }
        return rsl;
    }
}
