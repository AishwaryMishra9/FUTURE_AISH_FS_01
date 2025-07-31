package com.portfolio.service.interfaces;

import com.portfolio.entity.Skill;

import java.util.List;

public interface SkillService {
    List<Skill> getAllSkills();

    List<Skill> getSkillsByCategory(String category);

    Skill findById(int theId);

    Skill save(Skill theEmployee);

    void deleteById(int theId);

}
