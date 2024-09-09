package com.example.simple_controller.service;

import com.example.simple_controller.entity.Template;
import com.example.simple_controller.repository.TemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TemplateService {

    @Autowired
    private TemplateRepository templateRepository;

    public Template saveTemplate(Template template) {
        return templateRepository.save(template);
    }

    public List<Template> getAllTemplates() {
        return templateRepository.findAll();
    }


    public Optional<Template> getTemplateByButtonId(String buttonId) {
        return templateRepository.findByTemplateId(buttonId);
    }





    public void deleteTemplate(Long id) {
        templateRepository.deleteById(id);
    }
}
