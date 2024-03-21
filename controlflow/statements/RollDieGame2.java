package controlflow.statements;

import java.util.Random;

public class RollDieGame2 {

	public static void main(String[] args) {
		//Initialize what we know
				int maxRolls = 5;
				int maxSpaces = 20;
				int currentSpace = 0;
				Random random = new Random();
									
				//After each roll, tell the user which game space they are on and how many more spaces they have to go to win.
				for(int i=0; i<maxRolls; i++) {
					int currentDieRolled = random.nextInt(6) + 1 ;			
					currentSpace += currentDieRolled;
					
					
				//Check if user has won or lost
					if(currentSpace == maxSpaces) {
						currentSpace += currentDieRolled;
						System.out.println("Congratulations. You reached the final space. You win!");
						break;
					}
					else if (currentSpace > maxSpaces) {
						System.out.println("You lost! You went past " +maxSpaces + ".");
						break;				
					} 
					else if(i==maxRolls -1 && currentSpace < maxSpaces){
		                System.out.println("You're on space " + currentSpace + ".");
		                System.out.println("Unfortunately, you didn't make it to all " +
		                        maxSpaces + " spaces. You lose!");
		            }            
					else {
					//Display current position and spaces left
					int spacesToGo = maxSpaces - currentSpace;
					System.out.println("Roll #" + (i+1) + " : You have rolled a " +currentDieRolled + ". You are now on space " +
					currentSpace + " and have " + spacesToGo + " more to go.");
					}
				}
				
				
			}

		}
