package com.joins.Joins.Operations.Repository;

import com.joins.Joins.Operations.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query(value = "select * from student INNER JOIN college ON student.s_id=college.std_id", nativeQuery = true)
                                                   // OR
    // @Query(value = "select * from student Join college on student.s_id=college.std_id where college.branch='FGIET'",nativeQuery = true)
    public List<Student> innerJoin();

    @Query(value = "select * from student LEFT JOIN college ON student.s_id=college.std_id", nativeQuery = true)
    public List<Student> leftJoin();

    @Query(value = "select * from student RIGHT JOIN college ON student.s_id=college.std_id", nativeQuery = true)
    public List<Student> rightJoin();

    @Query(value = "select * from student LEFT JOIN college ON student.s_id=college.std_id  UNION select * from student RIGHT JOIN college ON student.s_id=college.std_id", nativeQuery = true)
    public List<Student> fullOuterJoin();
                         // Cross Join not working Properly
    /*@Query(value = "select * from student CROSS JOIN college ON college.branch='CSE'", nativeQuery = true)
    public List<Student> crossJoin();*/

}
