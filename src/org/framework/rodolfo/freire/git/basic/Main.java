package org.framework.rodolfo.freire.git.basic;

import org.framework.rodolfo.freire.git.basic.controller.BasicControllerGeneric;
import org.framework.rodolfo.freire.git.basic.model.Account;
import org.framework.rodolfo.freire.git.basic.model.Business;
import org.framework.rodolfo.freire.git.basic.model.Card;
import org.framework.rodolfo.freire.git.basic.model.Person;

public class Main {

    public static void main(String[] args) {

        /*
         * Instance of Model;
         */

        Person person = new Person();
        // Add Setters to Person

        Business business = new Business();
        // Add Setters to Business

        Account account = new Account();
        // Add Setters to Account

        Card card = new Card();
        // Add Setters to Card


        /*
         * Instance of Controller;
         */

        BasicControllerGeneric<Person, Long> personController = new BasicControllerGeneric<>();
        BasicControllerGeneric<Business, Long> businessController = new BasicControllerGeneric<>();
        BasicControllerGeneric<Account, Long> accountController = new BasicControllerGeneric<>();
        BasicControllerGeneric<Card, Long> cardController = new BasicControllerGeneric<>();

        /*
         * Call os Methods Controller Person;
         */

        personController.findAll();
        personController.findById(person.getId());
        personController.save(person);
        personController.update(person.getId());
        personController.deleteById(person.getId());


        /*
         * Call os Methods Controller Business;
         */

        businessController.findAll();
        businessController.findById(business.getId());
        businessController.save(business);
        businessController.update(business.getId());
        businessController.deleteById(business.getId());

        /*
         * Call os Methods Controller Account;
         */

        accountController.findAll();
        accountController.findById(account.getId());
        accountController.save(account);
        accountController.update(account.getId());
        accountController.deleteById(account.getId());

        /*
         * Call os Methods Controller Card;
         */

        cardController.findAll();
        cardController.findById(card.getId());
        cardController.save(card);
        cardController.update(card.getId());
        cardController.deleteById(card.getId());


    }
}
