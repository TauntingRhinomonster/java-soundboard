# Java Soundboard

Have you wanted to have a simple soundboard on your computer that could run whenever you wanted it to? Well, here is a soundboard! It plays funny sounds and noises from popular culture.

## Instructions for Build and Use

Steps to build and/or run the software:

1. 
2.
3.

Instructions for using the software:

1. Run the following on your computer: `notepad $profile`
2. Enter this into the notepad: `function soundboard { javac -cp "lib/jnativehook-2.2.2.jar;src" src/Main.java; java -cp "lib/jnativehook-2.2.2.jar;src" Main }`
3. Open up Windows Powershell, and type `soundboard`
4. Press any key and listen to the sound
5. To quit, press *CTRL + C*

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

* [ ] Add a random sound button
* [ ] Allow the user to edit the sounds dictionary to add their own sound files
* [ ] Add more sounds

## Learning Order of Operations

What do you need to learn to understand how to do this?

1. [X] Print text and use variables
2. [X] Write methods
3. [X] Create simple classes
4. [ ] Use ArrayList and HashMap
5. [ ] Read files from folders
6. [ ] Use try/catch
7. [ ] Make a simple Swing window
8. [ ] React to a button click or key press
9. [ ] Play one WAV file
10.[ ]  Combine key presses + sound files