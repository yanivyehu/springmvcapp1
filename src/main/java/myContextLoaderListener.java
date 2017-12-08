

import javax.servlet.ServletContext;

import org.springframework.web.context.WebApplicationContext;

public class myContextLoaderListener extends org.springframework.web.context.ContextLoaderListener {
	
	public myContextLoaderListener() {
		super();
		System.out.println("[myContextLoaderListener]:running..");
	}

	@Override
	protected WebApplicationContext createWebApplicationContext(ServletContext sc) {
		System.out.println("[myContextLoaderListener]:create WebApplicationContext ");
		// TODO Auto-generated method stub
		return super.createWebApplicationContext(sc);
	}
	
	@Override
	public void closeWebApplicationContext(ServletContext arg0) {
		
		System.out.println("[myContextLoaderListener]: close WebApplicationContext ");
		// TODO Auto-generated method stub
		super.closeWebApplicationContext(arg0);
	}
}
