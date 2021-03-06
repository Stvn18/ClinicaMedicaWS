package gt.umg.clinica.logs;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 
 * @author Steven
 */
public class FiltroLogs implements Filter {
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        ConfiguracionLogs.agregarLlave();
        try {
            chain.doFilter(request, response);
        } finally {
            ConfiguracionLogs.removerLlave();
        }

    }

    @Override
    public void destroy() {

    }
    
    
}