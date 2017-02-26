package com.chaunguyen.configurations;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.chaunguyen.domain"})
@EnableJpaRepositories(basePackages = {"com.chaunguyen.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {

}
