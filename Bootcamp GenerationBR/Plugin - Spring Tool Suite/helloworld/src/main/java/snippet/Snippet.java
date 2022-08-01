package snippet;

public class Snippet {
	spring.jpa.hibernate.ddl-auto=update                        (subindo as informações)
	spring.jpa.database=mysql
	spring.datasource.url=jdbc:mysql://localhost:3306/db_blogpessoal?         createDatabaseIfNotExist=true&serverTimezone=America/Recife_PE&useSSl=false
	spring.datasource.username=root
	spring.datasource.password=root
	spring.jpa.show-sql=true
	
	spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL8Dialect
	
	spring.jackson.date-format=yyyy-MM-dd HH:mm:ss
	spring.jackson.time-zone=Brazil/East
}

