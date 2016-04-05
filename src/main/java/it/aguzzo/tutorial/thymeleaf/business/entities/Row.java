package it.aguzzo.tutorial.thymeleaf.business.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Row {

	private Variety variety = null;
	private Integer seedsPerCell = null;
}