package com.abhi.ManagingAssistants.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Assistants {
	 @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    String name; 
    Long mobile; 
    String email; 
    double salary; 
    String city; 
    String country;
    String department;
    String role;
}