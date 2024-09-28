package com.example.hw5

class Shows(var name: String?,var description: String?,var ImageReasourceID : Int? = null) {
    companion object{
        val Shows = mutableListOf(
            Shows(
                "Dexter",
                "A crime drama series that follows Dexter Morgan, a forensic expert who leads a double life as a vigilante serial killer, targeting other criminals who escape justice.",
                R.drawable.dexter
            ),
            Shows(
                "Frieren: Beyond Journey's End",
                "A fantasy anime and manga series that follows Frieren, an elf mage who outlives her heroic companions and embarks on a journey of self-discovery, grappling with her long life and the impact of her past friendships.",
                R.drawable.frieren
            ),
            Shows(
                "Jujutsu Kaisen",
                "An action-packed anime series about Yuji Itadori, a high school student who joins a secret organization of jujutsu sorcerers to combat malevolent curses after becoming the host of a powerful curse himself.",
                R.drawable.jjk
            )
        )

    }
    override fun toString(): String {
        return name?:""
    }

}
