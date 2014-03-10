package com.technologicaloddity.sysdeotomcat7.model;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class FormValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(FormModel.class);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		FormModel formModel = (FormModel)obj;
		if(!StringUtils.hasText(formModel.getKey())) {
			errors.rejectValue("key", "key.empty", "key cannot be empty");
		}
		if(!StringUtils.hasText(formModel.getValue())) {
			errors.rejectValue("value", "value.empty" , "value cannot be empty");
		}

	}

}
