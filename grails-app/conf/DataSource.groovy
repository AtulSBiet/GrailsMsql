dataSource {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.provider_class = 'net.sf.ehcache.hibernate.EhCacheProvider'
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.provider_class = 'net.sf.ehcache.hibernate.EhCacheProvider'
}
// environment specific settings
environments {
    development {
        dataSource {
            pooled = true
            driverClassName = "com.mysql.jdbc.Driver"
            username = "root"
            password = ""
            url = "jdbc:mysql://localhost/db"
            dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
            dbCreate = "update" // one of 'create', 'create-drop','update'
            // url = "com.mysql.jdbc.Driver"
        }
    }
    test {
        dataSource {
            pooled = true
            driverClassName = "com.mysql.jdbc.Driver"
            username = "root"
            password = ""
            url = "jdbc:mysql://localhost/db"
            dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
            dbCreate = "update"
            // url = "com.mysql.jdbc.Driver"
        }
    }
    production {
        dataSource {
            pooled = true
            driverClassName = "com.mysql.jdbc.Driver"
            username = "aerokx66w88ov9gx"
            password = "az3gq4mn8h7m0afzdmok01uthqaelo8t"
            url = "jdbc:mysql://192.168.2.202:52284/test"
            dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
            dbCreate = "update"
            // url = "com.mysql.jdbc.Driver;shutdown=true"
        }
    }
}
