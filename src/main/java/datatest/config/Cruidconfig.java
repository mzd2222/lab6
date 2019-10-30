package datatest.config;


import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class Cruidconfig {

    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druid() {
        return new DruidDataSource();
    }

    //配置druid监控
//    1.配置一个管理后台的Servlet
    @Bean
    public ServletRegistrationBean<StatViewServlet> servletRegistrationBean() {
        ServletRegistrationBean<StatViewServlet> ben = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");
        Map<String, String> init = new HashMap<>();
        init.put("loginUsername", "admin");
        init.put("loginPassword", "wa131452");
        init.put("allow", "");   //默认接收所有
        init.put("deny", "");   //拒绝
        ben.setInitParameters(init);
        return ben;
    }

    //    2.配置一个监控的filter
    @Bean
    public FilterRegistrationBean<WebStatFilter> webStat() {
        FilterRegistrationBean<WebStatFilter> bean = new FilterRegistrationBean<WebStatFilter>();
        bean.setFilter(new WebStatFilter());

        Map<String, String> init = new HashMap<>();

        init.put("exclusions", "*.js, *.css, /druid/*");

        bean.setInitParameters(init);
        bean.setUrlPatterns(Collections.singletonList("/*"));


        return bean;
    }

}
