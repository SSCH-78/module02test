package dbtest;
import db.dbconsumer.*;
import db.dbutility.*;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import java.sql.SQLException;


    public class dbTest {
        DbConnection dbconnect1 = new DbConnection();

        @Test
        public void compare() throws IOException, SQLException, ClassNotFoundException {

            List<String> nameFromTable1=new ArrayList<>();
            List<String> nameFromTable2=new ArrayList<>();
            nameFromTable1=dbconnect1.readDatabase("actor","first_name");
            nameFromTable2=dbconnect1.readDatabase("actors","first_name");

            for(int i=0;i<nameFromTable1.size();i++)
            {
                Assert.assertEquals(nameFromTable1.get(i),nameFromTable2.get(i));
            }
        }
    }

