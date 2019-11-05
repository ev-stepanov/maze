package maze.entity.evil;

import com.grid.load_riddles.service.RiddleService;
import maze.entity.interfaces.Riddle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class EvilRiddle implements Riddle {
    @Autowired
    private RiddleService riddleService;

    @Override
    public void makeRiddle() {

        final com.grid.load_riddles.entity.Riddle riddle = riddleService.getRiddleById(1L);
        System.out.println(riddle.getRiddle());
        final Scanner scanner = new Scanner(System.in);
        final String answer = scanner.nextLine();
        boolean ans =  answer.equals(riddle.getAnswers().getCorrectAnswer());
    }
}
