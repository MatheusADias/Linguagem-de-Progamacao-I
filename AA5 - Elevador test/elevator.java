/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevator;

/**
 *
 * @author IFSP
 */
public class elevator {
    public boolean doorOpen = false;
    public int currentFloor = 1; // todos começam no primeiro andar
    public final int MAX_FLOOR = 10;
    public final int MIN_FLOOR = 1;
    
    public void openDoor(){
        if (doorOpen == true){
            System.out.println("Door is already opened. Nothing changes.\n");
        } else {
            System.out.println("Door is now opened.\n");
            doorOpen = true;
        }
    }
    public void closeDoor(){
        if (!doorOpen){
            System.out.println("Door is already closed. Nothing changes.\n");
        } else{
            doorOpen = false;
            System.out.println("Door is now closed.\n");
        }
    }
    public void goUp(){
        if (doorOpen == true){ 
            doorOpen = false;
            System.out.println("Oops! The door was opened. There's no problem, I already closed it.");
        }
        if (currentFloor >= MAX_FLOOR){
            System.out.println("You're already in the max floor allowed. Nothing changes.\nCurrent floor: " + currentFloor + "\n");
        } else {
            System.out.println("Going up!");
            currentFloor++;
            System.out.println("Current floor: " + currentFloor + "\n");
        }   
    }
    public void goDown(){
        if (doorOpen == true){
            doorOpen = false;
            System.out.println("Oops! The door was opened. There's no problem, I already closed it.");
        }
        if (currentFloor <= MIN_FLOOR){
            System.out.println("You're in the floor number " + currentFloor + ", you cannot go down. Nothing happens.\n");
        } else {
            System.out.println("Going down!");
            currentFloor--;
            System.out.println("You're now on the floor number " + currentFloor + "\n");
        }
    }
    public void goUntil(int floor){
        if(doorOpen == true){
            doorOpen = false;
            System.out.println("Oops! The door was opened. There's no problem, I already closed it.");
        }
        if(floor < MIN_FLOOR || floor > MAX_FLOOR){
            System.out.println("The floor is invalid. Please, choose a number between 1 and 10.");
        } else {
            System.out.println("Going to the floor number " + floor + "...");
            //Ir para baixo
            if (floor < currentFloor){
                while(floor != currentFloor){
                    goDown();
                }
            System.out.println("Success! You're now on the floor number " + currentFloor + "\n");    
            } else {
                //Ir para cima
                while(floor != currentFloor){
                    goUp();
                }
            System.out.println("Success! You're now on the floor number " + currentFloor + "\n");
            }
        }
    }
}

