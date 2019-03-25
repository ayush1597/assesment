package com.ttn.sling.project.core.service.impl;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;


@ObjectClassDefinition(name = "sudent config service", description = "student configuration class")
public @interface ClassConfigService {

    @AttributeDefinition(name = "Maximumstudents", description = "maximum allowed students", type = AttributeType.INTEGER)
    int getMaxStudents() default 10;

    @AttributeDefinition(name = "StudentPassingMarks", description = "Student Passing Marks", type = AttributeType.INTEGER)
    int getPassingMarks() default 10;

}

