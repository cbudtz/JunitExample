package com.company;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EKGDaoTest {

    @org.junit.jupiter.api.Test
    void saveBatch() {
        EKGDao ekgDao = new EKGDAOSQLImpl();
        List<EKGDTO> data = new ArrayList<EKGDTO>();
        //EKGDATA er IKKE Færdig!
        data.add(new EKGDTO("cpr?!?"));

        ekgDao.saveBatch(data);

        List<EKGDTO> ekgdtos = ekgDao.loadBatch("cpr?!?");
        assertEquals(ekgdtos,data);

    }

    @org.junit.jupiter.api.Test
    void loadBatch() {
    }
}