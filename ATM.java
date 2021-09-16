class ATM {
public int countBanknotes(int sum) {

        int money500 = sum / 500;
        int ostatok500 = sum % 500;

        int money200 = ostatok500 / 200;
        int ostatok200 = ostatok500 % 200;

        int money100 = ostatok200 / 100;
        int ostatok100 = ostatok200 % 100;

        int money50 = ostatok100 / 50;
        int ostatok50 = ostatok100 % 50;

        int money20 = ostatok50 / 20;
        int ostatok20 = ostatok50 % 20;

        int money10 = ostatok20 / 10;
        int ostatok10 = ostatok20 % 10;

        int money5 = ostatok10 / 5;
        int ostatok5 = ostatok10 % 5;

        int money2 = ostatok5 / 2;
        int ostatok2 = ostatok5 % 2;

        int money1 = ostatok2;

        int result = money500 + money200 + money100 + money50 + money20 + money10 + money5 + money2 + money1;

        return result;
    }
}
