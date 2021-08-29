
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