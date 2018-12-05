package AI.PaymentTermsCreditScore;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App  extends RepositoryRestMvcConfiguration
{
    public App(ApplicationContext context, ObjectFactory<ConversionService> conversionService) {
		super(context, conversionService);
		// TODO Auto-generated constructor stub
	}

	
}
