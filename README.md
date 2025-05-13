# SE350 - Assignment 2: Dungeon Game

## Overview

This project implements a text-based dungeon adventure game where players navigate through chambers, collect items, and battle monsters to reach the exit. The game features a robust object-oriented structure with various classes and interfaces that model the game world and mechanics.

## Game Features

- Navigate through interconnected chambers
- Collect and equip items that enhance your character's abilities
- Battle monsters guarding doors using strength or craft skills
- Choose between two character classes with different strengths:
  - Wizard: High craft (4), low strength (1), medium health (10)
  - Warrior: High strength (4), low craft (1), high health (15)

## Project Structure

The project follows a well-designed object-oriented architecture:

- `Game`: Main class that initializes and starts the game
- `TextUI`: Handles user interaction and displays game state
- `Dungeon`: Manages game state and available actions
- `Chamber`: Represents rooms in the dungeon that contain items and doors
- `Door`: Connects chambers and may be guarded by monsters
- `Character` (abstract): Base class for player characters
  - `Warrior`: Specializes in strength-based combat
  - `Wizard`: Specializes in craft-based combat
- `Monster`: Enemies that guard doors and challenge the player
- `Item` (abstract): Base class for collectible objects
  - `Axe`: Provides strength bonus
  - `Shield`: Provides both strength and craft bonuses
- `Action` (interface): Defines possible player actions
  - `Move`: For traveling between chambers
  - `Fight`: For battling monsters
  - `Pick`: For collecting items
  - `PrintError`: For handling errors

## UML Diagram

A comprehensive UML class diagram is provided in the `deliverables` folder. It visualizes all classes, their attributes, methods, and relationships. The diagram was created using Draw.io and is available in both XML and PNG formats:

- `deliverables/UML-Diagram.drawio.png` (Image format)

## How to Run

The game can be run using Maven:

```bash
mvn clean compile exec:java -Dexec.mainClass="dpu.se350.assignment2.Game"
```

Or compile and run manually:

```bash
javac src/main/java/dpu/se350/assignment2/*.java
java -cp src/main/java dpu.se350.assignment2.Game
```

## Gameplay Instructions

- The game will present you with a welcome message and your character information
- For each turn, you'll see:
  - Your current chamber description
  - Available doors (some may be guarded by monsters)
  - Items in the chamber
  - List of possible actions (numbered options)
- Enter the number corresponding to your desired action
- Continue playing until you reach the exit chamber or are defeated by a monster
- You can equip items to enhance your character's attributes

## Development Notes

- The game implements a simple combat system based on dice rolls plus character attributes
- Monsters have either strength or craft (not both), while characters have both
- Doors connect chambers bidirectionally
- The game ends when the player reaches the goal chamber or is defeated

## Credits

Developed by Kellen Siczka for SE350 - Object-Oriented Software Development
DePaul University, Spring Quarter 2025
