# Book Shop

## Install Window Builder package in Eclipse
  * Make to required Design

### Download MySQL connector for JAVA
  * Add the path to library
  * Creae DataBase and Table using Xampp

### DataBase Connection
   
```java
  Connection con;
  ResultSet rs;
  PreparedStatement prp;

```
 

```java
try{
  Class.forName("com.mysql.jdbc.cj.Driver");
  con = DriverManager.getConnection("jdbc:mysql://localhost/javacure","root","");
}
catch(ClassNotFoundException e){
  e.printStactTrace();
}
catch(SQLException e){
   e.printStackTrace();
}
```



