package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.DBUtils;

import java.sql.SQLException;

public class DatabaseStepDefinitions {

    @Given("user connects to the application database")
    public void user_connects_to_the_application_database() {

// Creating database connection using database utility
        DBUtils.createConnection();
    }
    @When("user gets the column {string} from table {string}")
    public void user_gets_the_column_from_table(String columnName, String tableName) {

    //String query = "SELECT "*" FROM jhr_user";
    String query = "SELECT "+columnName+" FROM "+tableName;

    // Running the query by using util class
    DBUtils.executeQuery(query);

    }
    @Then("user reads all column {string} data")
    public void user_reads_all_column_data(String columnName) throws Exception {

        // using result set to get the Object from Database
            DBUtils.getResultset().next();
            Object object1= DBUtils.getResultset().getObject(columnName); // getObject() is used to get database object
            System.out.println("object1="+object1);
      //=================== next data from table
            DBUtils.getResultset().next();
            Object object2= DBUtils.getResultset().getObject(columnName); // getObject()
            System.out.println("object2="+object2);

     //=======================   next data from table
            DBUtils.getResultset().next();
            Object object3= DBUtils.getResultset().getObject(columnName); // getObject()
            System.out.println("object3="+object3);
     //====================================
            DBUtils.getResultset().next();
            Object object4= DBUtils.getResultset().getObject(columnName); // getObject()
            System.out.println("object4="+object4);

        int counter= 5;                // after this object if we want to see all data we can use while loop
          while ( DBUtils.getResultset().next()) { // as long as we can next() in loop we see all data

              DBUtils.getResultset().next();
              Object currentObject= DBUtils.getResultset().getObject(columnName);
              System.out.println("Row" +counter+ "data:" + currentObject);

              counter++;

          }
        System.out.println("Row count:" +counter );
        System.out.println("Row count:" +DBUtils.getRowCount());
    }

}
