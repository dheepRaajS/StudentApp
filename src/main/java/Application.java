import org.academy.studentApp.service.ServiceClassImpl;
import org.academy.studentApp.service.StudentService;

public class Application {

    public static void main(String[] args){
        StudentService service = new ServiceClassImpl();
        System.out.println(service.findAll().get(0).getName());
    }
}
