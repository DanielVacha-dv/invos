package cz.danes.vyvos.config.db;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@Configuration
//@EnableTransactionManagement
//public class MySql {
//
//    @Bean(name = "mysql")
//    @ConfigurationProperties(prefix = "spring.mysql.datasource")
//    public DataSource dataSourceFis() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "mysqlTemplate")
//    public JdbcTemplate jdbcTemplate(@Qualifier("mysql") DataSource ds) throws SQLException {
//        JdbcTemplate template = new JdbcTemplate(ds);
//        Connection connection = template.getDataSource().getConnection();
//        DatabaseMetaData metaData = connection.getMetaData();
//        return template;
//    }
//}
