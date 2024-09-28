package com.example.hw5

class VideoGames(var name: String?,var description: String?,var ImageReasourceID : Int? = null) {
    companion object{
        val Games= mutableListOf(
            VideoGames("MineCraft"
                , "A sandbox game where players explore, build, and survive in a blocky, procedurally generated world"
                ,R.drawable.minecraft
            ),

            VideoGames("Fortnite"
                ,"A battle royale game where players fight to be the last one standing in a vibrant, ever-changing world."
                ,R.drawable.fortnite
            ),

            VideoGames("The First Descendant"
                ,"Cooperative action RPG where players battle against powerful enemies in a futuristic world using unique abilities and weapons"
                ,R.drawable.thefirstdescendant
            )
        )
    }
    override fun toString(): String {
        return name?:""
    }

}
