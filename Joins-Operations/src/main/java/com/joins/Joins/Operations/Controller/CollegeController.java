package com.joins.Joins.Operations.Controller;

import com.joins.Joins.Operations.Entity.College;
import com.joins.Joins.Operations.Service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CollegeController {
    @Autowired
    CollegeService collegeService;
    @PostMapping("/createCollege")
    public String createCollege(@RequestBody College college){
        collegeService.createCollege(college);
        return "Data SuccessFully Created";
    }
    @GetMapping("/getAllCollege")
    public List<College> getAllCollege(){
        return collegeService.getAllCollege();
    }
    @GetMapping("/getByIdCollege/{id}")
    public College getByIdCollege(@PathVariable int id)
    {
       return collegeService.getByIdCollege(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteCollege(@PathVariable int id){
        collegeService.deleteCollege(id);
        return "Data Deleted";
    }
    @PutMapping("/updateCollege/{id}")
    public College updateCollege(@PathVariable int id, @RequestBody College college){
        return collegeService.updateCollege(id, college);
    }

}
