package com.lpg.productservice.repository;

import com.lpg.productservice.domain.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    // Page<Product> findAll(Pageable pageable);

//    public List<Product> findByLastName(String lastName);
}


//public interface ExamRepository extends JpaRepository<Exam, Long>, JpaSpecificationExecutor<Exam> {
//}

//public interface SchoolRepository extends JpaRepository<School, Integer> {
//    @Query("select new com.kypnt.edutest.testcentreservice.controller.school.model.SchoolDto(s.eduwayId,s.titleKz,s.schoolType,s.parentEduwayId) " +
//            "from School s order by s.titleKz asc")
//    List<SchoolDto> findAllByOrderByTitleKzAsc();
//
//    @Query("select new com.kypnt.edutest.testcentreservice.controller.school.model.SchoolDto(s.eduwayId,s.titleRu,s.schoolType,s.parentEduwayId) " +
//            "from School s order by s.titleRu asc")
//    List<SchoolDto> findAllByOrderByTitleRuAsc();
//
//    Optional<School> findByIdAndSchoolType(Integer id, SchoolTypeEnum type);
//}