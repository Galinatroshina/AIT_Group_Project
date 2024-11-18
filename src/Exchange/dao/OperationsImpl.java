package Exchange.dao;

import Exchange.model.Transaction;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OperationsImpl implements Operations {

    List<Transaction> transaction;

    public OperationsImpl(List<Transaction> transaction) {
        this.transaction = transaction;
    }


    @Override
    public void mainMenu() {

    }

    @Override
    public Transaction addTrans(int num) {
        return null;
    }

    @Override
    public boolean removeTrans(int num) {
        return false;
    }

    @Override
    public Transaction findTrans(int num) {
        return null;
    }

    @Override
    public List<Transaction> findTransByDate(LocalDate dateFrom, LocalDate dateTo) {
        return List.of();
    }

    @Override
    public List<Transaction> findTransByType(boolean type) {
        return List.of();
    }

    @Override
    public int quantity() {
        return 0;
    }

    @Override
    public double calcRes(String name) {
        return 0;
    }

    @Override
    public double calcMarge(double sum) {
        return 0;
    }

    @Override
    public void printTrans() {

    }
}
