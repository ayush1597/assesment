package com.ttn.core.core.servlets;

import com.day.cq.commons.jcr.JcrConstants;
import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;
import com.day.cq.wcm.api.WCMException;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;

@Component(service = Servlet.class,
        property = {
                Constants.SERVICE_DESCRIPTION + "=Simple Demo Servlet",
                "sling.servlet.methods=" + HttpConstants.METHOD_GET,
                "sling.servlet.resourceTypes=" + "javamock/components/structure/javamock",
                "sling.servlet.extensions=" + "create"
        })
public class CreatepageServlet extends SlingSafeMethodsServlet {
    String templatePath;
    String pagename;
    String pagetitle;
    String properties;
    String pagepath = "/content/ttnblog";
    String pageName;
    Page page;

    @Override
    protected void doGet(final SlingHttpServletRequest req,
                         final SlingHttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
        templatePath = req.getParameter("templatepath");
        pagename = req.getParameter("pagename");
        pagetitle = req.getParameter("pagetitle");
        properties = req.getParameter("properties");
        final Resource resource = req.getResource();
        resp.getWriter().write("Title = " + templatePath + pagetitle + pagename + properties);
        PageManager pageManager = resource.getResourceResolver().adaptTo(PageManager.class);
        try {
            page = pageManager.create(pagepath, pageName, templatePath, pagetitle);
        } catch (WCMException e) {
            resp.getWriter().write(e.getMessage());
            if (page != null) {
            }
            resp.getWriter().write("page created");
        }
    }
}
