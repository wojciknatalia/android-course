package com.example.ramki;

public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts ={
            new Workout("Rozciąganie kończyn", "5 pompek,\n 10 przysiadów."),
            new Workout("Ogólna agonia", "500 pompek,\n 100 przysiadów."),
            new Workout("Tylko dla mieczków", "1 pompka,\n 1 przysiad."),
            new Workout("Siła i dystans", "50 pompek,\n 100 przysiadów.")
    };

    private Workout(String name, String description){
        this.name=name;
        this.description=description;
    }

    public String getDescription(){
        return description;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return this.name;
    }

}
