package ru.bmstu.rench.fclient;
interface TransactionEvents {
    String enterPin(int ptc, String amount);
    void transactionResult(boolean result);
}
