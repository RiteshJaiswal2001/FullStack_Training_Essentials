package com.myapp.spring.config;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.myapp.spring.domain.Movie;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.myapp.spring")
@EnableAspectJAutoProxy
public class AppConfig {
    @Bean("movies1")
    List<Movie> movies1(){
        return List.of(
            new Movie("1", "Inception", "Science Fiction", "A thief enters dreams to steal secrets."),
            new Movie("2", "Interstellar", "Science Fiction", "Explorers search for a new home beyond the stars."),
            new Movie("3", "The Matrix", "Science Fiction", "A hacker discovers the hidden reality of his world."),
            new Movie("4", "The Godfather", "Crime", "The aging head of a crime family passes control to his son."),
            new Movie("5", "Goodfellas", "Crime", "A young man rises through the ranks of an organized crime family.")
    );
    }

    @Bean("movies2")
    List<Movie> movies2(){
        return List.of(
            new Movie("1", "Passenger", "Science Fiction", "A thief enters dreams to steal secrets."),
            new Movie("2", "Gravity", "Science Fiction", "Explorers search for a new home beyond the stars."),
            new Movie("3", "The Matrix", "Science Fiction", "A hacker discovers the hidden reality of his world."),
            new Movie("4", "The Godfather", "Crime", "The aging head of a crime family passes control to his son."),
            new Movie("5", "NightCrawler", "Crime", "A young man rises through the ranks of an organized crime family.")
    );
    }
    @Bean
    DataSource dataSource(){
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setDriverClassName("org.jdbc.PostgreSql.Driver");
        dataSource.setJdbcUrl("jdbc:postgresql://neondb_owner:npg_oemHZ8RnWuO0@ep-dry-breeze-az3hdykr.c-3.ap-southeast-1.aws.neon.tech/neondb");
        dataSource.setMaximumPoolSize(10);
        dataSource.setMinimumIdle(2);
        dataSource.setAutoCommit(false);
        return dataSource;

    }
}
