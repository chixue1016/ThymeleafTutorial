package it.aguzzo.tutorial.thymeleaf.web.conversion;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import it.aguzzo.tutorial.thymeleaf.business.entities.Variety;
import it.aguzzo.tutorial.thymeleaf.business.services.VarietyService;

public class VarietyFormatter implements Formatter<Variety> {
	
	@Autowired
    private VarietyService varietyService;

    public VarietyFormatter() {
        super();
    }

    public Variety parse(final String text, final Locale locale) throws ParseException {
        final Integer varietyId = Integer.valueOf(text);
        return this.varietyService.findById(varietyId);
    }

    public String print(final Variety object, final Locale locale) {
        return (object != null ? object.getId().toString() : "");
    }
}