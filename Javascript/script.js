
const input = prompt("Choose a Soccerteam and see team player(s) example: Fenerbahce, Antwerpen, , Brugge, Anderlecht.");
document.getElementById("iterator").innerHTML += 
`<h2>===== ${input} SoccerPlayer(s) =====</h2>`;


//Array soccerPlayers --- SoccerPlayer has a name and team.
var soccerPlayers = [
    new SoccerPlayer("Eray","Fenerbahce"),
    new SoccerPlayer("Rosier","Fenerbahce"),
    new SoccerPlayer("Oguzhan","Fenerbahce"),
    new SoccerPlayer("Yusuf","Fenerbahce"),
    new SoccerPlayer("Marcos","Antwerpen"),
    new SoccerPlayer("Huseyin","Antwerpen"),
    new SoccerPlayer("Lukaku","Antwerpen"),
    new SoccerPlayer("Dida","Brugge"),
    new SoccerPlayer("Pirlo","Brugge"),
    new SoccerPlayer("Axelle","Anderlecht")
    ];


//Pure function - no side effects
function SoccerPlayer(name, team){

    this.name= name;
    this.team = team;
   
   } 

//Function for printing result as a String
   SoccerPlayer.prototype.toString = function(){
    return `${this.name} ${this.team}`
}

var elSoccerPlayers = soccerPlayers[Symbol.iterator]();


//Creating filter and printing the name of the SoccerPlayer that has same team
elSoccerPlayers.sortTeam = function(team){
    console.log(`%c${input} SoccerPlayer(s): `,"font-size:15px");

// forof array 
   for (const soccerPlayer of this) {
       if(soccerPlayer.team == team){
           console.log(`${soccerPlayer.name.toString()}`);
           document.getElementById("soccerPlayerUl").innerHTML += 
           `<li>${soccerPlayer.name.toString()}</li>
           <p>-----------------------------------------------</p>`;
       }
       
   }
    
}
// Get value from prompt(team name) sort soccer player name by team
elSoccerPlayers.sortTeam(`${input}`);


// ENGLISH

/* WHY ITERATOR ? */

/*

-- Purpose --
Iterator is a behavioral design pattern that lets you traverse elements of a collection without exposing its underlying representation (list, stack, tree...). 

-- Problem --
Collections are one of the most used data types in programming. Nonetheless, a collection is just a container for a group of objects.
Most collections store their elements in simple lists. However, some of them are based on stacks, trees, graphs and other complex data structures.

-- Solution --
The main idea of the Iterator pattern is to extract the traversal behavior of a collection into a separate object called an iterator.

All iterators must implement the same interface. This makes the client code compatible with compatible with any collection type or any traversal algorithm as long as there’s a proper iterator.
If you need a special way to traverse a collection, you just create a new iterator class, without having to change the collection or the client.
*/


// NEDERLANDS

/* WAAROM ITERATOR ? */

/*

-- Doel --
Iterator is een behavioral design pattern waarmee je elementen van een collectie kunt doorkruisen zonder de onderliggende representatie (list, stack, tree...) te leggen.

-- Problem --
Verzamelingen zijn een van de meest gebruikte gegevenstypen bij het programmeren. Niettemin is een verzameling slechts een container voor een groep objecten.
De meeste collecties slaan hun elementen op in eenvoudige lijsten. Sommige zijn echter gebaseerd op stacks, trees, graphs en andere complexe datastructuren.

-- Oplossing --
Het belangrijkste idee van het Iterator pattern is om het verplaatsingsgedrag van een verzameling te extraheren in een afzonderlijk object dat een iterator wordt genoemd.

Alle iterators moeten dezelfde interface implementeren. Dit maakt de clientcode compatibel en compatibel met elk verzamelingstype of elk traversal-algoritme, zolang er een goede iterator is.
Als u een speciale manier nodig heeft om een ​​verzameling te doorkruisen, maakt u gewoon een nieuwe iteratorklasse, zonder de verzameling of de client te hoeven wijzigen.
*/