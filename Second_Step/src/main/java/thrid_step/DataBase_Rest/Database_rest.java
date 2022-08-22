package thrid_step.DataBase_Rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import thrid_step.Repositories_Rest.Persons_repository_rest;

@Configuration

public class Database_rest {

    private static final Logger logger = LoggerFactory.getLogger(Database_rest.class);



    @Bean
      CommandLineRunner initDatabase(Persons_repository_rest persons_repository_rest) {

        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
            //    Person_rest person1 = new Person_rest("a", "a", "a", "a");
             //   Person_rest person2 = new Person_rest("b", "b", "b", "b");
            //    Person_rest person3 = new Person_rest("c", "c", "c", "c");
            //    logger.info("insert data : " + productRepository_rest.save(person1));
            //    logger.info("insert data : " + productRepository_rest.save(person2));
            //    logger.info("insert data : " + productRepository_rest.save(person3));
            }
        };
    }
}
