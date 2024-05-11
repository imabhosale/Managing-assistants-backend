package com.abhi.ManagingAssistants.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.ManagingAssistants.Model.Assistants;
import com.abhi.ManagingAssistants.Service.AssistantService;

@RestController
@RequestMapping("/assistants")
public class Controller {

	
	 @Autowired
	 private AssistantService assistantService;
	 
	@GetMapping("/abhi")
	public String check(){
		return "hi this is working !!!";
	}
	
	  @PostMapping
	  public ResponseEntity<Integer> createAssistant(@RequestBody Assistants assistant) {
	        int assistantId = assistantService.createAssistant(assistant);
	        return new ResponseEntity<>(assistantId, HttpStatus.CREATED);
	    }
	  
	  
	  @GetMapping("/{id}")
	    public ResponseEntity<Assistants> getAssistantById(@PathVariable("id") int id) {
	        Assistants assistant = assistantService.getAssistantById(id);
	        if (assistant != null) {
	            return new ResponseEntity<>(assistant, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	  
	  
	  @PutMapping("/{id}")
	  public ResponseEntity<String> updateAssistant(@PathVariable("id") int id, @RequestBody Assistants updatedAssistant) {
	      assistantService.updateAssistant(id, updatedAssistant);
	      return ResponseEntity.ok("Assistant with ID " + id + " updated successfully.");
	  }
	  
	  
	  @DeleteMapping("/{id}")
	  public ResponseEntity<String> deleteAssistant(@PathVariable("id") int id) {
	      assistantService.deleteAssistant(id);
	      return ResponseEntity.ok("Assistant with ID " + id + " deleted successfully.");
	  }

	  
	  
	  @GetMapping
	    public ResponseEntity<List<Assistants>> getAllAssistants() {
	        List<Assistants> assistants = assistantService.getAllAssistants();
	        return new ResponseEntity<>(assistants, HttpStatus.OK);
	    }
	  
	  

}


