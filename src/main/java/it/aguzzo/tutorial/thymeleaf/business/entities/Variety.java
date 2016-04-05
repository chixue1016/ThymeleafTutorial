package it.aguzzo.tutorial.thymeleaf.business.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Variety {

	private Integer id = null;
	private String name = null;
}