package com.sky.dao;


import lombok.extern.slf4j.Slf4j;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.List;

import static org.mockito.Mockito.mock;

/**
 * @author stliu @ apache.org
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(value = "com.sky")
@EntityScan("com.sky.beans")
//@EnableJpaRepositories("com.easemob.weichat.persistence.jpa")
@EnableTransactionManagement
@Slf4j
public class TestServiceApplication {



}
