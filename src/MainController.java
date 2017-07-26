import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.blackiron.research.Research;

@ApplicationPath("WebServices")
public class MainController extends Application{
	@Override
	public Set<Class<?>> getClasses() {
        Set<Class<?>> classSet =  new HashSet<Class<?>>();
        classSet.add(Research.class);
        return classSet;
    }
}
