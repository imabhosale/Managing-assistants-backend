package com.abhi.ManagingAssistants.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhi.ManagingAssistants.Model.Assistants;

@Repository
public interface AssistantRepo extends JpaRepository<Assistants,Integer> {
}
