package com.yunhe.Util;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class JDBCUtil {
    public static JdbcTemplate template;
    static {
        template = new JdbcTemplate(new ComboPooledDataSource());
    }
}
