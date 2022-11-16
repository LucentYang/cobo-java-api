package com.cobo.custody.api.client.domain.transaction;

import java.util.List;

public class MPCTransactions {
    private List<MPCTransaction> transactions;

    public List<MPCTransaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<MPCTransaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "{" +
                "transactions='" + transactions + '\'' +
                '}';
    }
}
