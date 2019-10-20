package maze;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Answers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String A;

    private String B;

    private String C;

    private String correctAnswer;
}
