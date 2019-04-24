package com.ttn.core.core;

import com.adobe.cq.sightly.WCMUsePojo;
import org.apache.sling.api.resource.Resource;
import java.util.ArrayList;
import java.util.List;

public class MultipleLinks extends WCMUsePojo {
    List<MultiLinksBean> linlkstab2 = new ArrayList();
    List<MultiLinksBean> linlkstab3 = new ArrayList();
    List<MultiLinksBean> linlkstab4 = new ArrayList();
    String validatedlink, result1, result2, result3;
    String  title;

    @Override
    public void activate() throws Exception {
        for (Resource resource : getResource().getChild("linkstab2").getChildren()) {
            result1 = validate(resource.getValueMap().get("linkaction", String.class));
            String path = resource.getValueMap().get("linkaction", String.class);
            String lname = resource.getValueMap().get("linkname", String.class);
            if (lname==null) {
                title = gettitle(path);
            } else {
                title = lname;
            }
            linlkstab2.add(new MultiLinksBean(title, result1));

        }
        for (Resource resource : getResource().getChild("linkstab3").getChildren()) {
            result2 = validate(resource.getValueMap().get("linkaction", String.class));
            String path = resource.getValueMap().get("linkaction", String.class);
            String lname = resource.getValueMap().get("linkname", String.class);
            if (lname==null) {
                title = gettitle(path);
            } else {
                title = lname;
            }
            linlkstab3.add(new MultiLinksBean(title, result2));
        }
        for (Resource resource : getResource().getChild("linkstab4").getChildren()) {
            result3 = validate(resource.getValueMap().get("linkaction", String.class));
            String path = resource.getValueMap().get("linkaction", String.class);
            String lname = resource.getValueMap().get("linkname", String.class);
            if (lname==null) {
                title = gettitle(path);
            } else {
                title = lname;
            }
            linlkstab4.add(new MultiLinksBean(title, result3));
        }
    }

    private String gettitle(String path) {
       String linktext = path + "/jcr:content";
        Resource resource1 = getResourceResolver().getResource(linktext);
        return resource1.getValueMap().get("jcr:title", resource1.getResourceType());
    }

    public String validate(String link) {
        if (link.startsWith("/content")) {
            if (!(link.endsWith(".html"))) {
                validatedlink = link + ".html";
            } else {
                validatedlink = link;
            }
        } else if (!(link.startsWith("https://") || link.startsWith("http://"))) {
            validatedlink = "https://" + link;
        } else {
            validatedlink = link;
        }
        return validatedlink;
    }

    public List<MultiLinksBean> getLinlkstab2() {
        return linlkstab2;
    }

    public List<MultiLinksBean> getLinlkstab3() {
        return linlkstab3;
    }

    public List<MultiLinksBean> getLinlkstab4() {
        return linlkstab4;
    }
}