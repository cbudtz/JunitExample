package com.company;

import java.util.List;

public interface EKGDao {
    void saveBatch(List<EKGDTO> batchData);
    List<EKGDTO> loadBatch(String cpr);
}
