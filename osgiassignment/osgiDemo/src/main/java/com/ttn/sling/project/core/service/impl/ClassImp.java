package com.ttn.sling.project.core.service.impl;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;

import java.util.List;

@Component(immediate = true, service = ClassConfig.class)
@Designate(ocd = ClassConfigService.class)
public class ClassImp implements ClassConfig {
    int maxStudent;
    int pass_marks;

    @Override
    public boolean isClassLimitReached(List<Student> list) {
        int list_size = list.size();
        if (list_size <= maxStudent) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public int getPassingmarks(ClassConfigService classConfigService) {
        return pass_marks;
    }

    @Activate
    public void activateMethod(ClassConfigService classConfigService) {
        maxStudent = classConfigService.getMaxStudents();
        pass_marks = classConfigService.getPassingMarks();
    }
}
