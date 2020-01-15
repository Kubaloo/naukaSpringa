package com.example.nauka;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    private String coursePreffix;

    @Override
    public void initialize(CourseCode theCourseCode) {
        coursePreffix = theCourseCode.value();
    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
        boolean result;
        if (theCode != null) {
            result = theCode.startsWith(coursePreffix);

        } else {
            result = false;
        }
        return result;
    }
}
