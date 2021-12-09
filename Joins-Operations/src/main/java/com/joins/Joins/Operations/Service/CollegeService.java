package com.joins.Joins.Operations.Service;

import com.joins.Joins.Operations.Entity.College;

import java.util.List;

public interface CollegeService {

    public void createCollege(College college);

    public List<College> getAllCollege();

    public College getByIdCollege(int id);

    public void deleteCollege(int id);

    public College updateCollege(int id,College college);
}
