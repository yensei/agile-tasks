package py.com.mryensei.agile.agile.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor  
@AllArgsConstructor  
@ToString
@Entity
@Table(name = "Task")
public class Task{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;
    @Column
    private String title;
    @Column
    private String description;

    private Note[] notes; 
    
    @Enumerated(value = EnumType.STRING)
    @Column
    private Status status;  
}
