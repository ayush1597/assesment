package com.ttn.sling.project.core.service.impl;

import java.util.List;

public interface ClassConfig {
    boolean isClassLimitReached(List<Student> list);

    int getPassingmarks(ClassConfigService classConfigService);
}
