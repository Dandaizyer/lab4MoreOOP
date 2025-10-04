
# Lab 4 More OOP

A simple text-based game where different fantasy characters fight each other. Each character has unique abilities and fighting style.

## Features
- 4 character types: Hobbit, Elf, King, Knight
- Random character generation
- Turn-based battles
- Special kick abilities for each character

## How setHp should behave when hp < 0?
When HP goes below 0, it should be 0. Characters can't have minus health points.

## What type of pattern is used in CharacterFactory?
Factory Pattern - it creates different character objects without specifying the exact class.

## Refactor code to remove duplication in King and Knight
Created a common class for random stat characters since both King and Knight have similar kick logic and random stats.

## Solution for separating characters and kick strategies
We can use Strategy Pattern - each character has its own kick behavior that can be changed easily.

## How createCharacter is implemented? Can we improve with reflections?
Currently using switch-case. Can improve with reflections to automatically find all character classes without modifying factory when adding new characters.

## Tests
All tests pass - characters created correctly, kick methods work as expected, HP never goes below zero.
