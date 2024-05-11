package com.abhi.ManagingAssistants.ServiceImpl;

import com.abhi.ManagingAssistants.Model.Assistants;
import com.abhi.ManagingAssistants.Repo.AssistantRepo;
import com.abhi.ManagingAssistants.Service.AssistantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssistantServiceImpl implements AssistantService {

    @Autowired
    private AssistantRepo assistantRepo;

    @Override
    public int createAssistant(Assistants assistant) {
        Assistants createdAssistant = assistantRepo.save(assistant);
        return createdAssistant.getId();
    }

    @Override
    public Assistants getAssistantById(int id) {
        Optional<Assistants> optionalAssistant = assistantRepo.findById(id);
        return optionalAssistant.orElse(null);
    }

    @Override
    public void updateAssistant(int id, Assistants updatedAssistant) {
        if (assistantRepo.existsById(id)) {
            updatedAssistant.setId(id);
            assistantRepo.save(updatedAssistant);
        }
    }

    @Override
    public void deleteAssistant(int id) {
        assistantRepo.deleteById(id);
    }

    @Override
    public List<Assistants> getAllAssistants() {
        return assistantRepo.findAll();
    }
}
