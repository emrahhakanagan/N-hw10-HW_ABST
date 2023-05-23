import account.Account;
import account.SimpleAccount;
import account.CreditAccount;
import logger.Logger;
import logger.SimpleLogger;
import logger.SmartLogger;

public class Main {
    public static void main(String[] args) {

        Account simpleAccount = new SimpleAccount(0);
        Account simpleAccount2 = new SimpleAccount(500);
        Account creditAccount = new CreditAccount(750);
        Account creditAccount2 = new CreditAccount(250);

        Logger simpleLogger = new SimpleLogger();
        Logger smartLogger = new SmartLogger();

        boolean status;

        System.out.println(simpleAccount.getBalance() + " руб. - баланс ДС до пополнения\n");

//        System.out.println(simpleAccount.add(150) + " - баланс пополнен");
        status = simpleAccount.add(150);
        simpleLogger.log("баланс пополнен");
        smartLogger.log("баланс пополнен",status);
        System.out.println(simpleAccount.getBalance() + " руб. - баланс после пополнения\n");


//        System.out.println(simpleAccount.add(-10)  + " - баланс пополнен");
        status = simpleAccount.add(-10);
        simpleLogger.log("баланс пополнен");
        smartLogger.log("баланс пополнен",status);
        System.out.println(simpleAccount.getBalance() + " руб. - баланс после пополнения\n");

//        System.out.println(simpleAccount.pay(-20)  + " - потрачена из баланса");
        status = simpleAccount.pay(-20);
        simpleLogger.log("потрачена из баланса");
        smartLogger.log("потрачена из баланса",status);
        System.out.println(simpleAccount.getBalance() + " руб. - баланс после затраты\n");

//        System.out.println(simpleAccount.pay(40)  + " - потрачена из баланса");
        status = simpleAccount.pay(40);
        simpleLogger.log("потрачена из баланса");
        smartLogger.log("потрачена из баланса",status);
        System.out.println(simpleAccount.getBalance() + " руб. - баланс после затраты\n");

//        System.out.println(simpleAccount.transfer(creditAccount, 111)  + " - переведена из баланса");
        status = simpleAccount.transfer(creditAccount, 111);
        simpleLogger.log("переведена из баланса");
        smartLogger.log("переведена из баланса",status);
        System.out.println(simpleAccount.getBalance() + " руб. - баланс после перевода\n");

//        System.out.println(simpleAccount.transfer(creditAccount, 55)  + " - переведена из баланса");
        status = simpleAccount.transfer(creditAccount, 55);
        simpleLogger.log("переведена из баланса");
        smartLogger.log("переведена из баланса",status);
        System.out.println(simpleAccount.getBalance() + " руб. - баланс после перевода\n");


        System.out.println("\n----------------------\n");

        System.out.println(creditAccount.getAmount() + " руб. баланс КС до пополнения\n");

//        System.out.println(creditAccount.add(751) + " - баланс пополнен");
        status = creditAccount.add(751);
        simpleLogger.log("баланс пополнен");
        smartLogger.log("баланс пополнен",status);
        System.out.println(creditAccount.getAmount() + " руб. - баланс после пополнения\n");

//        System.out.println(creditAccount.add(250) + " - баланс пополнен");
        status = creditAccount.add(250);
        simpleLogger.log("баланс пополнен");
        smartLogger.log("баланс пополнен",status);
        System.out.println(creditAccount.getAmount() + " руб. - баланс после пополнения\n");

//        System.out.println(creditAccount.pay(-30)  + " - потрачена из баланса");
        status = creditAccount.pay(-30);
        simpleLogger.log("потрачена из баланса");
        smartLogger.log("потрачена из баланса",status);
        System.out.println(creditAccount.getBalance() + " руб. - баланс после затраты\n");

//        System.out.println(creditAccount.pay(50)  + " - потрачена из баланса");
        status = creditAccount.pay(50);
        simpleLogger.log("потрачена из баланса");
        smartLogger.log("потрачена из баланса",status);
        System.out.println(creditAccount.getBalance() + " руб. - баланс после затраты\n");

//        System.out.println(creditAccount.pay(151)  + " - потрачено из баланса");
        status = creditAccount.pay(151);
        simpleLogger.log("потрачена из баланса");
        smartLogger.log("потрачена из баланса",status);
        System.out.println(creditAccount.getBalance() + " руб. - баланс после затраты\n");

//        System.out.println(creditAccount.transfer(simpleAccount, 70)  + " - переведена из баланса");
        status = creditAccount.transfer(simpleAccount, 70);
        simpleLogger.log("переведена из баланса");
        smartLogger.log("переведена из баланса",status);
        System.out.println(creditAccount.getBalance() + " руб. - баланс после перевода\n");

//        System.out.println(creditAccount.transfer(simpleAccount, 24)  + " - переведена из баланса");
        status = creditAccount.transfer(simpleAccount, 24);
        simpleLogger.log("переведена из баланса");
        smartLogger.log("переведена из баланса",status);
        System.out.println(creditAccount.getBalance() + " руб. - баланс после перевода\n");

        System.out.println(creditAccount.getCreditLimit() + " руб. - лимит КС");
        System.out.println(creditAccount2.getCreditLimit() + " руб. - лимит КС-2\n");

        System.out.println(simpleAccount.getBalance() + " руб. - баланс ДС");
        System.out.println(simpleAccount2.getBalance() + " руб. - баланс ДС-2\n");
        System.out.println(creditAccount.getBalance() + " руб. - баланс КС");
        System.out.println(creditAccount2.getBalance() + " руб. - баланс КС-2");

        System.out.println("\n---------------------- ПЕРЕВОД ИЗ ДС-2\n");

//        simpleAccount2.transfer(simpleAccount, 66);
        status = simpleAccount2.transfer(simpleAccount, 66);
        simpleLogger.log("переведена из ДС-2 на ДС");
        smartLogger.log("переведена из ДС-2 на ДС",status);
        System.out.println(simpleAccount2.getBalance() + " руб. - баланс после перевода\n");

//        simpleAccount2.transfer(creditAccount, 246);
        status = simpleAccount2.transfer(creditAccount, 246);
        simpleLogger.log("переведена из ДС-2 на КС");
        smartLogger.log("переведена из ДС-2 на КС",status);
        System.out.println(simpleAccount2.getBalance() + " руб. - баланс после перевода\n");

        System.out.println("\n---------------------- ПЕРЕВОД ИЗ КС-2\n");

//        System.out.println(creditAccount2.add(251) + " - баланс пополнен");
        status = creditAccount2.add(-251);
        simpleLogger.log("баланс КС-2 пополнен");
        smartLogger.log("баланс КС-2 пополнен",status);
        System.out.println(creditAccount2.getAmount() + " руб. - баланс КС-2 после пополнения\n");

//        System.out.println(creditAccount2.add(105) + " - баланс пополнен");
        status = creditAccount2.add(105);
        simpleLogger.log("баланс КС-2 пополнен");
        smartLogger.log("баланс КС-2 пополнен",status);
        System.out.println(creditAccount2.getAmount() + " руб. - баланс КС-2 после пополнения\n");

//        creditAccount2.transfer(creditAccount, 55);
        status = creditAccount2.transfer(creditAccount, 55);
        simpleLogger.log("переведена из КС-2 на КС");
        smartLogger.log("переведена из КС-2 на КС",status);
        System.out.println(creditAccount2.getBalance() + " руб. - баланс после перевода\n");

//        creditAccount2.transfer(simpleAccount2, 35);
        status = creditAccount2.transfer(simpleAccount2, 35);
        simpleLogger.log("переведена из КС-2 на ДС-2");
        smartLogger.log("переведена из КС-2 на ДС-2",status);
        System.out.println(creditAccount2.getBalance() + " руб. - баланс после перевода\n");

//        System.out.println(creditAccount2.add(150) + " - баланс пополнен");
        status = creditAccount2.add(80);
        simpleLogger.log("баланс КС-2 пополнен");
        smartLogger.log("баланс КС-2 пополнен",status);
        System.out.println(creditAccount.getAmount() + " руб. - баланс КС-2 после пополнения\n");

        System.out.println("\n----------------------\n");

        System.out.println(simpleAccount.getBalance() + " руб. - баланс ДС");
        System.out.println(simpleAccount2.getBalance() + " руб. - баланс ДС-2\n");
        System.out.println(creditAccount.getBalance() + " руб. - баланс КС");
        System.out.println(creditAccount2.getBalance() + " руб. - баланс КС-2");

    }
}