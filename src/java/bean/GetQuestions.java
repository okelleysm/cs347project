
package bean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author terrelkl
 */
public class GetQuestions implements Serializable{
    
    String query = "SELECT securityQuestionId, securityQuestion FROM securityQuestions;";
    model.db.DBQuery dbq = new model.db.DBQuery();
    ArrayList<String> data = dbq.doQuery(query);

    public ArrayList<String> getData() {
        return data;
    }

    public void setData(ArrayList<String> data) {
        this.data = data;
    }
    
    public ArrayList<String> securityQuestions() {
        return data;
    }
}
