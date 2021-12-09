package com.joins.Joins.Operations.Service;

import com.joins.Joins.Operations.Entity.College;
import com.joins.Joins.Operations.Repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeServiceImp implements CollegeService{
    @Autowired
    CollegeRepository collegeRepository;
    @Override
    public void createCollege(College college) {
        collegeRepository.save(college);
    }

    @Override
    public List<College> getAllCollege() {
        return (List<College>) collegeRepository.findAll();
    }

    @Override
    public College getByIdCollege(int id) {
        return collegeRepository.findById(id).get();
    }

    @Override
    public void deleteCollege(int id) {
        collegeRepository.deleteById(id);
    }

    @Override
    public College updateCollege(int id, College college) {
        College college1 = collegeRepository.findById(id).get();
        college1.setCollegeName(college.getCollegeName());
        college1.setBranch(college.getBranch());
        college1.setYear(college.getYear());
        collegeRepository.save(college1);
        return college1;
    }
}
