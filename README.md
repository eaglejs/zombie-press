# Zombie-Press

This java application is small, but allows you to keep your machine awake without installing an application, and runs quietly in the background.

### This is not for the faint of heart

It's meant to be something you don't install on your machine so you do need to have some java knowledge to set it up. I did this mostly because I wanted something that isn't bound my admin rights, and as long as you have java sdk installed, you can compile, and run this application without issues. Works in Windows and Unix/Linux based systems. (Works in mac osx as well).

### How do you use it?

- Step 1.) You need to have the Java sdk installed, and assign it to your JAVA PATH. There are plenty of tutorials on this. (search on youtube how to install java sdk on your OS).

- Step 2.) After you have installed Java SDK, and added it to your PATH, use your favorite terminal to navigate to this repository
	- `$ cd /path/to/repository/zombie-press/src`
	- `$ javac Main.java //This will compile your java file into a class file`
	- `$ java Main` 

- Step 3.) You should see a message come up that says "ZombiePress is running... It is sending Ctrl key every 600000ms. Type Ctrl + c to exit"

### You can modify the time!

If you need to modify the time, modify it in the code, and follow step 2 again. I could create a CLI for it, but i'm too lazy. Just update the 'period' variable with the time you want. (denoted in milliseconds).

### Would you like to contribute?
You can do just that? If you want to add a CLI into it. I'm all for it. Fork the repo, and make a pull request and i'll review it.

Enjoy! :)  