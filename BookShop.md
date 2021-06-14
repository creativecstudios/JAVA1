# Book Shop

## Install Window Builder package in Eclipse
  * Make to required Design

### Download MySQL connector for JAVA
  * Add the path to library
  * Creae DataBase and Table using Xampp
  * sudo /opt/lampp/lampp start

### DataBase Connection
   
```java
  Connection con;
  ResultSet rs;
  PreparedStatement prp;

```
 

```java
try{
  Class.forName("com.mysql.cj.jdbc.Driver");
  con = DriverManager.getConnection("jdbc:mysql://localhost/javacure","root","");
}
catch(ClassNotFoundException e){
  e.printStactTrace();
}
catch(SQLException e){
   e.printStackTrace();
}
```
### Save method
```java
public void actionPerformer(ActionEvent arg0){
  String name,edition,price;
  
  //namefield,editionfield,pricefield is the id of the inputfields...
  
  //get values from inputfield and store in local variable
  
  name = namefield.getText();
  edition = editionfield.getText();
  price = pricefield.getText();
  
  //now insert the data to database
  try{
       prp = con.prepareStatement("insert into book(name,edition,price)values(?,?,?)");
       prp.setString(1,name)
       prp.setString(2,edition);
       prp.setString(3,price);

       //now execute the mysql query

       prp.executeUpdate();

       //now display the message in dialogbox (i.e) Record Saved

       JOptionPane.showDialogMessage(null,"Recodr saved.");

       //Empty the inputfields

       namefield.setText("");
       editionfield.setText("");
       pricefield.setText("");

       //focus the cursor to the namefield

       namefield.requestFocus();
       }
   catch(SQLException e){
     e.printStackTrace();
   }
}
```






