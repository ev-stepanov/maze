package maze;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Riddle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer level;

    private String riddle;

    @OneToOne
    @JoinColumn(name = "answer")
    private Answers answers;
}
