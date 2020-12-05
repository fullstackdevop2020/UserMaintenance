package au.com.user.maintenance;

import au.com.user.maintenance.rest.UserMaintenanceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import( {UserMaintenanceConfig.class})
public class UserMaintenanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserMaintenanceApplication.class, args);
	}

}
