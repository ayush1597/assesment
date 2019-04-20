package com.ttn.core;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;
import java.util.List;

@Model(adaptables = {Resource.class})
public class
InsightComp {
    @Inject
    private List<InsightCompBean> linkslist;

    public List<InsightCompBean> getList() {
        return linkslist;
    }

}

