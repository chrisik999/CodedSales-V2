package codedsales.resources;

import codedsales.exceptions.AccessDeniedExceptionMapper;
import codedsales.exceptions.DataNotFoundExceptionMapper;
import codedsales.exceptions.NotAuthorizedExceptionMapper;
import codedsales.filters.JwtAuthFilter;
import codedsales.filters.PoweredByFilter;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("v2")
public class ApplicationConfig extends Application{

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<>();
        addResources(resources);
        return resources;
    }

    private void addResources(Set<Class<?>> resources) {
        resources.add(ItemResource.class);
        resources.add(UserResource.class);
        resources.add(BusinessResource.class);
        resources.add(CreditResource.class);
        resources.add(BranchResource.class);
        resources.add(AuthResource.class);
        resources.add(ExpenseResource.class);
        resources.add(ProfileResource.class);
        resources.add(SaleResource.class);
        resources.add(StockActivityResource.class);
        resources.add(DataNotFoundExceptionMapper.class);
        resources.add(JwtAuthFilter.class);
        resources.add(PoweredByFilter.class);
        resources.add(NotAuthorizedExceptionMapper.class);
        resources.add(AccessDeniedExceptionMapper.class);
    }
    
    
    
}
