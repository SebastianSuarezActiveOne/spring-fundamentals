import com.pluralsight.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        //CustomerService service = new CustomerServiceImpl();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);

        CustomerService service = applicationContext.getBean("customerService", CustomerService.class);

        System.out.println(service.findAll().get(0).getFirstName());


    }

}
