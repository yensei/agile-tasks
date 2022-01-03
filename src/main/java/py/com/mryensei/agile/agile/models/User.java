package py.com.mryensei.agile.agile.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * User
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User{
    private int id;
    private String nick;
    private String name;
    private String surname;
    private String password;    
}