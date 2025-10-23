# 🎰 Lottery Simulator

A Java console application that simulates the Powerball lottery system, allowing users to pick numbers and instantly see if they've won.

## 📋 Features

- **User Number Selection**: Choose 5 numbers between 1-69
- **Random Drawing**: Generates 5 unique white balls (1-69) and 1 red ball (1-26)
- **Automatic Matching**: Compares user numbers against drawn numbers
- **Prize Calculation**: Determines winnings based on official Powerball prize tiers
- **Duplicate Prevention**: Ensures all drawn white balls are unique

## 🎯 Prize Tiers

| Match | Prize |
|-------|-------|
| 5 White + Red | Grand Prize 🎉 |
| 5 White | $1,000,000 |
| 4 White + Red | $50,000 |
| 4 White OR 3 White + Red | $100 |
| 3 White OR 2 White + Red | $7 |
| 1 White + Red OR Red Only | $4 |

## 🛠️ Technologies Used

- **Language**: Java
- **Concepts**: Arrays, Loops, Random Number Generation, Conditional Logic

## 🚀 How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher

### Steps

1. **Clone the repository**
   ```bash
   git clone https://github.com/MuhiburR/Lottery-Simulator.git
   cd Lottery-Simulator
   ```

2. **Compile the program**
   ```bash
   javac Main.java
   ```

3. **Run the simulator**
   ```bash
   java Main
   ```

## 💡 Sample Gameplay

```
Lottery Simulator!
these numbers can range anywhere from 1 - 69
Please enter your lottery 5 numbers:
7
14
21
35
42

White Balls
12
34
21
8
56
Red Ball
9

Unfortunately you didn't win any prizes.
Please try again!
```

## 🧮 How It Works

1. User inputs 5 numbers (1-69)
2. Program generates 5 unique random white balls (1-69)
3. Program generates 1 random red ball (1-26)
4. System compares user's numbers against drawn numbers
5. Prize tier is calculated based on matches
6. Result is displayed to the user

## 📊 Learning Outcomes

This project demonstrates:
- Array manipulation and iteration
- Random number generation with `Math.random()`
- Input validation and user interaction
- Complex conditional logic (nested if-else statements)
- Algorithm design for duplicate checking
- Enhanced for loops for array comparison

## 🔮 Potential Enhancements

- Multiple lottery drawings in one session
- Statistics tracking (total spent vs. winnings)
- Input validation (reject numbers outside 1-69 range)
- Quick pick feature (auto-generate random numbers)
- Historical drawing results
- Probability calculator

## 📝 Note

This is an educational project created during high school to practice Java fundamentals, arrays, and control flow.

## 👤 Author

**Muhibur Rahman**
- GitHub: [@MuhiburR](https://github.com/MuhiburR)

---

*Based on Powerball lottery rules for educational purposes*
*Created as part of learning Java programming*
