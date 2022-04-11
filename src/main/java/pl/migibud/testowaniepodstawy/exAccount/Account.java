package pl.migibud.testowaniepodstawy.exAccount;

public class Account {

    private static final int MAX_DEBIT = -1000;
    private static final String BOUNDARY = "\t|\t";
    private String name;
    private int balance;
    private boolean debit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public boolean getDebit() {
        return debit;
    }

    public void deposit(int amount) {

        int balanceBeforeOpp = this.balance;
        if (amount > 0) {
            this.balance += amount;
            this.validateDebit();
            this.print(balanceBeforeOpp,"Wpłata",amount,this.balance);
        } else {
            System.out.println("Kwota wplaty/wyplaty musi byc dodatnia!");
        }
    }

    public void withdraw(int amount) throws IllegalWithdrawExeption {

        int balanceBeforeOpp = this.balance;
        if (amount > 0) {

            if (this.balance - amount >= MAX_DEBIT) {
                this.balance -= amount;
                this.print(balanceBeforeOpp,"Wypłata",amount,this.balance);
            } else {
                throw new IllegalWithdrawExeption();
            }
            this.validateDebit();
        } else {
            System.out.println("Kwota wplaty/wyplaty musi byc dodatnia!");
        }

    }

    private void validateDebit() {
        if (this.balance < 0) {
            this.debit = true;
            System.out.println("Ujemny stan konta");
        } else {
            this.debit = false;
        }
    }

    private void print(int balanceBeforeOpp, String operationName, int amount, int balanceAfterOpp){

        StringBuilder sb = new StringBuilder();

        sb.append("Stan konta: "+balanceBeforeOpp);
        sb.append(BOUNDARY);
        sb.append(operationName+": "+amount);
        sb.append(BOUNDARY);
        sb.append("Po operacji: "+balanceAfterOpp);
        System.out.println(sb);
    }

    public void transfer(Account otherAccount, int amount){

        try {
            this.withdraw(amount);
            otherAccount.deposit(amount);
        }catch (IllegalWithdrawExeption e){
            System.out.println("Nie można wykonać operacji");
        }



    }

    class IllegalWithdrawExeption extends Exception{

        public IllegalWithdrawExeption(){
            super("Błąd: Brak wystarczających środków na koncie.");
        }
    }

}
