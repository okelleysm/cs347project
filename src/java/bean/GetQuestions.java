
package bean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author terrelkl
 */
public class GetQuestions{
    
    String query = "SELECT securityQuestionId, securityQuestion FROM securityQuestions;";
    model.db.DBQuery dbq = new model.db.DBQuery();
    ArrayList<String> questions = dbq.executeQuery(query);

    public ArrayList<String> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<String> questions) {
        this.questions = questions;
    }

}
