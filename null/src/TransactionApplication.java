import dao.TransactionDB;
import entity.transaction;

import java.util.Arrays;
import java.util.List;

public class TransactionApplication
{
    public static void main(String[]args)
    {
        TransactionDB tdb = new TransactionDB();
        List<transaction> transactions = tdb.getAll();
        transactions.forEach(System.out :: println);

    }

}
