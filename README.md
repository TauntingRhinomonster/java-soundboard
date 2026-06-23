# Java Soundboard

Have you wanted to have a simple soundboard on your computer that could run whenever you wanted it to? Well, here is a soundboard! It plays funny sounds and noises from popular culture.

## Instructions for Build and Use

Steps to build and/or run the software:

1. Run the following on your computer: `notepad $profile`
2. Enter this into the notepad: `function soundboard { cd [INSERT YOUR PATH TO THE PROJECT HERE]; javac -cp "lib/jnativehook-2.2.2.jar;src" src/Main.java; java -cp "lib/jnativehook-2.2.2.jar;src" Main }`
3. Open up Windows Powershell, and type `soundboard`

Instructions for using the software:

1. Open the soundboard program using my tutorial for building it above ☝🏻
2. Press any key to play a sound
3. For the menu press `Escape`
4. When in the menu, press 1 for inserting a new sound, and 2 for swaping keys (swapping is under development).
5. When inserting a new sound key, enter values like: 'A', 'B', 'Escape', 'Space', 'Tab', '1', '0', etc
6. When inserting a new sound path, enter only .wav files with the path: `src/sounds/[INSERT PATH].wav`
7. To quit, press *CTRL + C*

## Development Environment

To recreate the development environment, you need the following software and/or libraries with the specified versions:

* You need some kind of Shell to run the code in. All computers have one. You just need to find yours.
* You need a Java complier. You can find one here: `https://www.oracle.com/java/technologies/downloads/`
* I clicked on the Windows tab and selected the x64 Installer. After that I restarted my laptop.

## Useful Websites to Learn More

I found these websites useful in developing this software:

* [Oracle JDK Downloads](https://www.oracle.com/java/technologies/downloads/#java17-windows)
* [w3schools "Java" documentation](https://www.w3schools.com/java/default.asp)
* [GitHub Java Native Hook documentation](https://github.com/kwhat/jnativehook) 
* [Google Gemini](https://gemini.google.com/u/1/app) 

## Future Work

The following items I plan to fix, improve, and/or add to this project in the future:

* [X] Allow user to add more sounds
* [ ] Allow the user to edit the sounds dictionary by swapping keys
* [ ] Allow the user to delete sounds from the dictionary
* [ ] Add a random sound button

## Learning Order of Operations

What do you need to learn to understand how to recreate this?

1. [X] Print text and use variables
2. [X] Write methods
3. [X] Create simple classes
4. [X] Use ArrayList and HashMap
5. [X] Read files from folders
6. [X] Use try/catch
7. [X] React to a button click or key press
8. [X] Play one WAV file
9. [X]  Combine key presses + sound files