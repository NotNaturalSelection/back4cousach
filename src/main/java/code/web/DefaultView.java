package code.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.resource.ResourceResolver;
import org.springframework.web.servlet.resource.ResourceResolverChain;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class DefaultView extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        super.addResourceHandlers(registry);
        ReactResourceResolver resolver = new ReactResourceResolver();
        registry.addResourceHandler("/**")
                .resourceChain(true)
                .addResolver(resolver);
    }

    private static class ReactResourceResolver implements ResourceResolver {
        private String reactDir = "/static/";
        private String reactStaticDir = "static";
        private Resource index = new ClassPathResource(reactDir + "index.html");

        @Override
        public Resource resolveResource(HttpServletRequest httpServletRequest, String s, List<? extends Resource> list, ResourceResolverChain resourceResolverChain) {
            return resolve(s);
        }

        @Override
        public String resolveUrlPath(String s, List<? extends Resource> list, ResourceResolverChain resourceResolverChain) {
            try {
                return resolve(s).getURL().toString();
            }catch (IOException e) {
                return resolve(s).getFilename();
            }
        }

        private ArrayList<String> rootStaticFiles = new ArrayList<>();

        public ReactResourceResolver() {
            rootStaticFiles.add("favicon.ico");
            rootStaticFiles.add("asset-manifest.json");
            rootStaticFiles.add("manifest.json");
            rootStaticFiles.add("service-worker.js");
            rootStaticFiles.add("logo192.png");
            rootStaticFiles.add("logo512.png");
        }

        private Resource resolve(String requestPath) {
            if (rootStaticFiles.contains(requestPath) || requestPath.startsWith(reactStaticDir))
               return new ClassPathResource(reactDir + requestPath);
            else return index;
        }
    }
}