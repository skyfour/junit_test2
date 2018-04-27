import com.sky.beans.VisitorUserBlacklistActivityType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Date;

@SpringBootApplication
@EntityScan("com.sky")
@ComponentScan(basePackages = {"com.sky.controller","com.sky.dao","com.sky.dao.impl","com.sky.service"})
public class SpringbootApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringbootApplication.class, args);
        System.out.println(new Date());
    }
}
