package it.aguzzo.tutorial.thymeleaf.business.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeedStarter {
	
	private Integer id = null;
    private Date datePlanted = null;
    private Boolean covered = null;
    private Type type = Type.PLASTIC;
    private Feature[] features = null;
    
    private List<Row> rows = new ArrayList<Row>();
}