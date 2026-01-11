# Card Matching Game (Java Swing)

A **Java Swing memory card matching game** with an **in-game currency system**. Players match pairs of cards to earn points and currency, which can be spent on multipliers and matchmakers to enhance gameplay. The project demonstrates **object-oriented programming (OOP), GUI design, and event-driven programming** in Java.

---

## Features

- Graphical User Interface built with **Java Swing**
- Memory matching game with **2 rows × 5 columns of cards**
- **In-game currency system** stored in `Save.txt`
- Spend currency on **multipliers** and **matchmakers**
- Dynamic score tracking and performance feedback
- Modular **OOP design**:
  - `MemoryGameLabel.java` – core game logic and grid of buttons
  - `Frame.java` – main application window and screen management
  - `Bank.java` – manages currency and score
  - Separate packages for **buttons**, **labels**, and **frames**
- Randomized card layouts for replayability
- Timer-based UI delays for smooth gameplay

---

## How to Play

1. Launch the application by running `Main.java`.  
2. Click **Play Game** to start a memory matching session.  
3. Flip two cards per turn to find matching pairs.  
4. Earn in-game currency for successful matches.  
5. Use currency in the **Shop** to buy multipliers or matchmakers.  
6. Complete all matches to finish the game and see your score.  
