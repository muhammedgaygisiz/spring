package com.example.spring5petclinic.formatters;

import com.example.spring5petclinic.model.PetType;
import com.example.spring5petclinic.services.PetTypeService;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;
import java.util.Set;

@Component
public class PetTypeFormatter implements Formatter<PetType> {

  private final PetTypeService petTypeService;

  public PetTypeFormatter(PetTypeService petTypeService) {
    this.petTypeService = petTypeService;
  }

  @Override
  public String print(PetType petType, Locale locale) {
    return petType.getName();
  }

  @Override
  public PetType parse(String text, Locale locale) throws ParseException {
    Set<PetType> petTypes = petTypeService.findAll();

    for (PetType type : petTypes) {
      if(type.getName().equals(text)) {
        return type;
      }
    }

    throw new ParseException("type not found: " + text, 0);
  }
}
