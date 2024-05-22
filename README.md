Task 2 
Description of the GuessTheNumber Program
The GuessTheNumber program is a simple console-based game written in Java where the player has to guess a randomly generated number between 1 and 100 within five attempts. Here’s a step-by-step description of how the program functions:

Initialization:

The program uses two classes: Scanner for reading user input and Random for generating random numbers.
It generates a random number between 1 and 100 which the player has to guess.
Two variables are initialized: attempts to count the number of guesses made, and score starting at 100 to keep track of the player's score.
Game Start:

The program prints a welcome message informing the player about the range of the number and the number of attempts allowed.
Game Loop:

A while loop runs as long as the number of attempts is less than 5. This ensures the player has up to 5 attempts to guess the number.
User Input and Feedback:

Inside the loop, the player is prompted to enter their guess.
The program reads the player's guess and increments the attempts counter by 1.
It then checks if the guess is too low, too high, or correct:
If the guess is lower than the number to guess, it prints "Too low! Try again." and decreases the score by 10 points.
If the guess is higher than the number to guess, it prints "Too high! Try again." and decreases the score by 10 points.
If the guess is correct, it prints a congratulatory message with the number of attempts taken and the final score, then exits the game using return.
Game End:

If the player fails to guess the number within 5 attempts, the loop ends, and the program prints a message revealing the correct number.
Example Execution
The program starts and generates a random number (e.g., 42).
The player is prompted to guess the number.
The player enters a guess (e.g., 25).
The program responds with "Too low! Try again." and the score is reduced to 90.
The player continues guessing within the allowed attempts.
If the player guesses correctly within 5 attempts, they are congratulated with their score.
If the player fails to guess the number in 5 attempts, the program reveals the correct number and ends.
This simple game provides feedback to the player after each guess, helping them adjust their guesses based on whether they were too high or too low, and encourages them to guess correctly with a scoring system.

Task 3
Description of the ATM Interface Program
The ATMInterface program is a console-based Java application that simulates basic banking functionalities such as registration, login, withdrawal, deposit, money transfer, balance check, and transaction history. Below is a detailed description of the program and how it functions:

Classes and Methods
BankAccount Class:

Attributes:
name, userName, password, accountNo: Store user information.
balance: Stores the user's account balance, initialized to 10000.
transactions: Counter for the number of transactions.
transactionHistory: A string that logs all transactions.
Methods:
register(): Prompts the user to enter their personal details and registers them.
login(): Authenticates the user by verifying the username and password.
withdraw(): Allows the user to withdraw money from their account.
deposit(): Allows the user to deposit money into their account.
transfer(): Allows the user to transfer money to another account.
checkBalance(): Displays the current account balance.
transHistory(): Displays the transaction history.
ATMInterface Class:

Contains the main method which drives the application.
Methods:
takenIntegerInput(int limit): Ensures valid integer input from the user within a specified range.
Program Workflow
Welcome Screen:

The program starts with a welcome message and offers the user the option to either register a new account or exit the program.
Registration:

If the user chooses to register, the register() method is called, prompting the user to enter their name, username, password, and account number.
After successful registration, the user is prompted to log in.
Login:

The login() method is called to authenticate the user by asking for their username and password.
If the credentials are correct, the user is welcomed back, and the main menu is displayed.
Main Menu:

The main menu offers the following options:
Withdraw: Calls the withdraw() method to allow the user to withdraw money. The balance is reduced accordingly, and the transaction is logged.
Deposit: Calls the deposit() method to allow the user to deposit money. The balance is increased accordingly, and the transaction is logged.
Transfer: Calls the transfer() method to transfer money to another recipient. The balance is reduced accordingly, and the transaction is logged.
Check Balance: Calls the checkBalance() method to display the current balance.
Transaction History: Calls the transHistory() method to display the user's transaction history.
Exit: Exits the main menu loop and logs the user out.
Looping and Exiting:

After each transaction, the main menu is displayed again, allowing the user to perform another operation.
The user can exit the program by choosing the exit option from the main menu.
Example Execution
Start the Program:

Display the welcome message and prompt the user to register or exit.
Registration:

User enters their details (name, username, password, account number).
Login:

User is prompted to log in using their username and password.
Main Menu Operations:

User can choose to withdraw, deposit, transfer, check balance, or view transaction history.
Each operation updates the balance and transaction history accordingly.
Exit:

User chooses to exit, ending the program.
This program provides a basic simulation of an ATM interface with essential banking functionalities and helps understand user interaction, input handling, and simple banking operations.






