package com.example.simple_controller.repository;

import com.example.simple_controller.entity.Template;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

    @Repository
    public interface TemplateRepository extends JpaRepository<Template, Long>
    {
        @Query("SELECT t FROM Template t WHERE t.templateId = :templateId")
        Optional<Template> findByTemplateId(@Param("templateId") String templateId);

        @Query("SELECT t FROM Template t WHERE t.templateId = :buttonId")
        Optional<Template> findTemplateByTemplateId(@Param("buttonId") String buttonId);

    }
