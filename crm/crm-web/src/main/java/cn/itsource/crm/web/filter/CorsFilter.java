package cn.itsource.crm.web.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description TODO
 * @Author solargen
 * @Date 2019/12/2 11:18
 * @Version v1.0
 **/
public class CorsFilter implements Filter{


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        // 添加参数，允许指定域名和端口访问
        String origin = req.getHeader("Origin");
        if("http://localhost:6001".equalsIgnoreCase(origin)||"http://127.0.0.1:6001".equalsIgnoreCase(origin)){
            resp.setHeader("Access-Control-Allow-Origin", origin);
        }
        // 这个allow-headers要配为*，这样才能允许所有的请求头
        resp.setHeader("Access-Control-Allow-Headers", "*");
        resp.setHeader("Access-Control-Allow-Methods","PUT,POST,GET,DELETE,OPTIONS");
        resp.setHeader("Access-Control-Max-Age", String.valueOf(20*24*60*60));
        chain.doFilter(request, resp);

    }

    @Override
    public void destroy() {

    }
}
