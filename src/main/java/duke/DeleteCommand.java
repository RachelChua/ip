package duke;

import java.util.ArrayList;

public class DeleteCommand extends Command {
    @Override
   String execute(String taskName, ArrayList<Task> listOfTasks, Ui ui, Storage storage) {
       TaskList taskList = new TaskList(listOfTasks);
       return taskList.delete(taskName);
   }
}
