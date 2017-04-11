# Game of Kalah

A web application implementing 6-Stone variant of Game of Kalah
(https://en.wikipedia.org/wiki/Kalah).Game engine is implemented as 
RESTFul WebService exposing following endpoints. 


 Method  |  URL | Action 	
 --- | --- | ---
   POST	| /kalah/play |Updates the game state on a valid move.
   GET |	/kalah/start |	Returns a initialized game.	

Project includes a simple front-end based on JQuery which consumes 
the RESTFul apis and letuser play the game. 

# Technologies Used : 

* Java 8 
* Spring Boot
* Maven
* JQuery
* HTML & CSS


# Usage 


In order to run the application you need Java 8 and Maven.

Please follow these steps.
1) Clone the repository from GitHub.

   $ git clone https://github.com/bhupendrasingh26/kalah-game.git
 
2) Using command line to navigate to the location of pom file.

   $ mvn package && java -jar target\kalah-game-1.0.0.jar

3) Access game using URL :  http://localhost:8080

   
 # ScreenShots 
 
 ![gamestarts](https://cloud.githubusercontent.com/assets/8441446/24905121/6ff63802-1ed0-11e7-8ac6-935b879e9395.JPG)
 
 ![gameplay](https://cloud.githubusercontent.com/assets/8441446/24905120/6ff62d8a-1ed0-11e7-9334-2714a4b1b150.JPG)

 ![awin](https://cloud.githubusercontent.com/assets/8441446/24905119/6ff44dda-1ed0-11e7-867e-1483c8a6eafb.JPG)

 

