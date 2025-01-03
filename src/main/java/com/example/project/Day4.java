package com.example.project; 
import java.util.Random; 
public class Day4 { 
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"}; 
    public static class Reindeer { 
        private String name; 
        private int speed; 
        private int runDuration; 
        private int restDuration; 
        private int distance; 
        private int run; 
        private int rest;
            public Reindeer(String name, int speed, int runDuration, int restDuration) { 
                this.name=name; 
                this.speed=speed; 
                this.runDuration=runDuration; 
                this.restDuration=restDuration; 
                run=runDuration; 
                rest=restDuration; } 
            public int getDistanceTraveled(){ 
                return distance;
            }
            public String getName() {
                return name;
            } 
            public void simulateSecond(){ 
                if (run>0) { 
                    run--; distance+=speed; 
                } else if (rest>0) { 
                    rest--; 
                } if (rest==0) { 
                    run=runDuration; rest=restDuration; 
                } 
            } 
        } 
            public static String simulateRace(int time, Reindeer[] reindeers){ 
                for (int i=0; i<time; i++) { 
                    for (Reindeer reindeer : reindeers) { 
                        reindeer.simulateSecond(); 
                } 
            } 
                String winner=" "; 
                int max=0; 
                for (Reindeer reindeer : reindeers) { 
                if(reindeer.getDistanceTraveled()>max) { 
                    max=reindeer.getDistanceTraveled(); winner=reindeer.getName();  
                } 
            } return winner; 
        } 
        public static void main(String[] args) { 
            Day4.Reindeer[] reindeers = {new Day4.Reindeer("Dasher", 100, 5, 2), new Day4.Reindeer("Dancer", 120, 4, 3), new Day4.Reindeer("Prancer", 70, 6, 1) }; 
            System.out.println(simulateRace(100, reindeers)); 
        } 
    }