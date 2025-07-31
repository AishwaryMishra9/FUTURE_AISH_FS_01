package com.portfolio.service.interfaces;

import com.portfolio.entity.Education;
import com.portfolio.entity.Skill;

import java.util.List;

public interface EducationService {
    List<Education> getAllEducationDetails();

    Education findById(int theId);

    Education save(Education theEducation);

    void deleteById(int theId);
}
