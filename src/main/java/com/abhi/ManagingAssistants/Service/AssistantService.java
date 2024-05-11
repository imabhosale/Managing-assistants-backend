package com.abhi.ManagingAssistants.Service;

import java.util.List;

import com.abhi.ManagingAssistants.Model.Assistants;

public interface AssistantService {
    int createAssistant(Assistants assistant);
    Assistants getAssistantById(int id);
    void updateAssistant(int id, Assistants assistant);
    void deleteAssistant(int id);
	List<Assistants> getAllAssistants();
}