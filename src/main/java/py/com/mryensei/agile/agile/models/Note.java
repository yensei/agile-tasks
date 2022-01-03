package py.com.mryensei.agile.agile.models;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Note
 */
@Data
@NoArgsConstructor  
@AllArgsConstructor  
@ToString  
public class Note {

    

    private int id;
    private String description;
    private User creator;
    private User modifier;
    private Date created;
    private Date modified;    
}