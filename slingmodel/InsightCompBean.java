package com.ttn.core;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class InsightCompBean {

    @Inject
    private String title;


    @Inject
    private String link;

    @Inject
    private String subtitle;
    @Inject
    private String image;

    public String getTitle() {
        return title;
    }


    public String getLink() {
        return link;
    }


    public String getSubtitle() {
        return subtitle;
    }


    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
