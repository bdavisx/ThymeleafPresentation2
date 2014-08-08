package ws.billdavis.thymeleaf.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;
import org.thymeleaf.templateresolver.TemplateResolver;
import ws.billdavis.thymeleaf.Application;

//includeFilters = @Filter(Controller.class), useDefaultFilters = false

//@ImportResource( value = { "classpath:/spring-security-context.xml", } )

@Configuration
@ComponentScan(basePackageClasses = Application.class)
public class WebMVCConfig extends WebMvcConfigurationSupport {

    private static final String MESSAGE_SOURCE = "/WEB-INF/i18n/messages";
    private static final String VIEWS = "/WEB-INF/templates/";

    private static final String RESOURCES_HANDLER = "/resources/";
    private static final String RESOURCES_LOCATION = RESOURCES_HANDLER + "**";

    @Override
    public RequestMappingHandlerMapping requestMappingHandlerMapping() {
        RequestMappingHandlerMapping requestMappingHandlerMapping = super.requestMappingHandlerMapping();
        requestMappingHandlerMapping.setUseSuffixPatternMatch( false );
        requestMappingHandlerMapping.setUseTrailingSlashMatch( false );
        return requestMappingHandlerMapping;
    }

    @Bean(name = "messageSource")
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename( MESSAGE_SOURCE );
        messageSource.setCacheSeconds( 5 );
        return messageSource;
    }

    @Bean
    public TemplateResolver templateResolver() {
        TemplateResolver templateResolver = new ServletContextTemplateResolver();
        templateResolver.setPrefix( VIEWS );
        templateResolver.setSuffix( ".html" );
        templateResolver.setTemplateMode( "HTML5" );
        templateResolver.setCacheable( false );
        return templateResolver;
    }

    @Bean
    public SpringTemplateEngine templateEngine() {
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver( templateResolver() );
        return templateEngine;
    }

    @Bean
    public ThymeleafViewResolver viewResolver() {
        ThymeleafViewResolver thymeleafViewResolver = new ThymeleafViewResolver();
        thymeleafViewResolver.setTemplateEngine( templateEngine() );
        thymeleafViewResolver.setCharacterEncoding( "UTF-8" );
        return thymeleafViewResolver;
    }

    @Override
    public void addResourceHandlers( ResourceHandlerRegistry registry ) {
        registry.addResourceHandler( RESOURCES_HANDLER ).addResourceLocations( RESOURCES_LOCATION );
    }

    @Override
    public void configureDefaultServletHandling( DefaultServletHandlerConfigurer configurer ) {
        configurer.enable();
    }

}
