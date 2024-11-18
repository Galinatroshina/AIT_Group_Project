package Exchange.dao;

import Exchange.model.Transaction;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OperationsImpl implements Operations {

    List<Transaction> transactions;

    public OperationsImpl(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public void mainMenu() {

    }

    @Override
    public Transaction addTrans(int num) {
        // Создаём транзакцию, добавляем её в список
        Transaction newTransaction = new Transaction(num, "USD", true, LocalDate.now(), 100.0, 5.0);
        transactions.add(newTransaction);
        return newTransaction;
    }

    @Override
    public boolean removeTrans(int num) {
        // Ищем транзакцию по номеру и удаляем
        return transactions.removeIf(transaction -> transaction.getNumber() == num);
    }

    @Override
    public Transaction findTrans(int num) {
        // Возвращаем транзакцию по номеру
        for (Transaction transaction : transactions) {
            if (transaction.getNumber() == num) {
                return transaction;
            }
        }
        return null; // Если не найдена
    }

    @Override
    public List<Transaction> findTransByDate(LocalDate dateFrom, LocalDate dateTo) {
        List<Transaction> result = new ArrayList<>();
        for (Transaction transaction : transactions) {
            LocalDate date = transaction.getDate();
            if ((date.isEqual(dateFrom) || date.isAfter(dateFrom)) &&
                    (date.isEqual(dateTo) || date.isBefore(dateTo))) {
                result.add(transaction);
            }
        }
        return result;
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
