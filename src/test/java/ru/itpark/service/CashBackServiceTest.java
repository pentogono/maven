package ru.itpark.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashBackServiceTest {

    @Test
    @DisplayName("should calculate cashback for under limit amount")
    void cashbackUnderLimit() {
        CashBackService cashBackService = new CashBackService();
        int cashback = cashBackService.cashback(1_000);
        assertEquals(50, cashback);
    }
}