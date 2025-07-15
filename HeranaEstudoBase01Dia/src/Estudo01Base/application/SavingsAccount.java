package Estudo01Base.application;

// final e para evitar que a class seja erdada, noa se pode usar o extends para ela
public final class  SavingsAccount extends Account {
    private Double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Double interestRate, Integer number, String holder, Double balance){
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(Double interestRate){
        this.interestRate = interestRate;

    }
    public void updateBalance(){
        balance += balance * interestRate;
    }
    @Override
    public void withdraw(double amount){
        balance -= amount ;
    }
}
