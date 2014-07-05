package com.edgar.web;

  import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class webapp extends AbstractAnnotationConfigDispatcherServletInitializer {
   
    @Override
    protected Class<?>[] getRootConfigClasses(){
        return new Class<?>[0];
    }
    
    @Override
    protected Class<?>[] getServletConfigClasses(){
        return new Class<?>[] {webappconfig.class};
    }
    
    @Override
    protected String[] getServletMappings(){
        return new String[]{
            "/servicios/*"
        };
    }
}
