package spring.cloud.study.app.client;

import org.springframework.cloud.openfeign.FeignClient;
import spring.cloud.study.contract.StudentService;

@FeignClient(name="student-service")
public interface StudentClient extends StudentService{

}
