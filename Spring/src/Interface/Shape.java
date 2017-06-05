package Interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public interface Shape extends InitializingBean,DisposableBean {

	
	public void draw();
	public void afterPropertiesSet() throws Exception;
		
		
		public void destroy() throws Exception ;

			
	
}
