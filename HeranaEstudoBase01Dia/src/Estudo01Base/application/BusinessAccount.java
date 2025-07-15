package Estudo01Base.application;
// usando o extends para conseguir todos os atributos e metodos da class account
public class BusinessAccount extends Account {
    private Double loanLimit;

    public BusinessAccount(){
        // resguarda no futuro caso seja, caso seja incluido alguma lgc no construtor Account
        super();
        // super serve para executar a lgc do construtor account
    }

    public BusinessAccount(Double loanLimit, Integer number, String holder, Double balance) {
        super(number, holder, balance);
        this.setLoanLimit(loanLimit);
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
    public void loan(double amount){
        if (amount <= loanLimit){
            // para usar o balance foi preciso muda de public para protect o atributo
            balance += amount - 10.0;
        }

    }
}

