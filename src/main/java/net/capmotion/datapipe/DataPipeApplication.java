package net.capmotion.datapipe;

import net.capmotion.datapipe.controller.rest.ProviderRestController;
import net.capmotion.datapipe.data.dao.impl.ProviderDaoImpl;
import net.capmotion.datapipe.data.repository.ProviderRepository;
import net.capmotion.datapipe.data.repository.model.ProviderJpa;
import net.capmotion.datapipe.services.impl.ProviderServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = {
    ProviderRepository.class,
    ProviderDaoImpl.class
})
@ComponentScan(basePackageClasses = {
    ProviderServiceImpl.class,
    ProviderRestController.class
})
@EntityScan(basePackageClasses = {
    ProviderJpa.class
})
public class DataPipeApplication {

  public static void main(String[] args) {
    SpringApplication.run(DataPipeApplication.class, args);
  }

}
