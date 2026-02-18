# To-Do List Application

A simple command-line To-Do List application written in Java that helps you manage your daily tasks efficiently.

## Features

- ✅ **Add Tasks** - Quickly add new tasks to your list
- 📋 **View All Tasks** - Display all your tasks at a glance
- ✔️ **Mark as Complete** - Mark tasks as completed (highlighted in green)
- 🗑️ **Delete Tasks** - Remove tasks you no longer need
- 🎨 **Color-coded Interface** - Enhanced readability with colored text

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- A terminal or command prompt

## Installation

1. Clone or download the `ToDoList.java` file
2. Navigate to the directory containing the file

## How to Run

### Compile the program:
```bash
javac ToDoList.java
```

### Run the application:
```bash
java ToDoList
```

## Usage

When you run the application, you'll see a menu with the following options:

```
==> To-Do List Application <==
Enter '1' For Add Task
Enter '2' For View All Tasks
Enter '3' For Mark Task as Complete
Enter '4' For Delete Task
Enter '5' For Exit
```

### Adding a Task
1. Select option `1`
2. Enter your task description
3. Press Enter

### Viewing All Tasks
1. Select option `2`
2. All tasks will be displayed with their numbers

### Marking a Task as Complete
1. Select option `3`
2. Enter the task number you want to mark as complete
3. The task will be marked with a `[COMPLETED]` tag in green

### Deleting a Task
1. Select option `4`
2. Enter the task number you want to delete
3. The task will be removed from your list

### Exiting the Application
- Select option `5` to exit

## Code Structure

- `tasks`: ArrayList storing all tasks
- `displayManu()`: Displays the main menu
- `AddTask()`: Handles adding new tasks
- `ViewAllTasks()`: Displays all current tasks
- `MarkTaskComplete()`: Marks a task as completed
- `DeleteTask()`: Removes a task from the list

## Example

```
==> To-Do List Application <==
Enter '1' For Add Task
Enter '2' For View All Tasks
Enter '3' For Mark Task as Complete
Enter '4' For Delete Task
Enter '5' For Exit
Enter your choice: 1
Enter the Task: Buy groceries
Task added successfully!

Enter your choice: 2
Your Tasks:
1. Buy groceries

Enter your choice: 3
Enter the Task number to mark as complete: 1
Task 'Buy groceries [COMPLETED]' marked as complete and added to the list.
```

## Notes

- Task numbers start from 1
- Completed tasks remain in the list with a `[COMPLETED]` marker
- Invalid inputs are handled with appropriate error messages
- The application runs in a loop until you choose to exit

## Future Enhancements

Potential features that could be added:
- Save tasks to a file for persistence
- Edit existing tasks
- Set task priorities or due dates
- Search and filter tasks
- Separate completed and pending tasks

**Enjoy managing your tasks! 📝**