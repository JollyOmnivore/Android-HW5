package com.example.hw5

class Foods(var name: String?,var description: String?,var ImageReasourceID : Int? = null) {
    companion object{
        val Foods = mutableListOf(
            Foods(
                "Cane's Caniac Combo",
                "6 Chicken Fingers, Crinkle-Cut Fries, 2 Cane's Sauce, Texas Toast, Coleslaw, Large Fountain Drink/Tea (32 oz.)",
                R.drawable.canes
            ),
            Foods(
                "Chick-fil-a Chicken Sandwich Combo",
                "Chick-fil-A Chicken Sandwich Packaged Meal. Chick-fil-A Chicken Sandwich, a bag of Waffle Potato Chips, and a Chocolate Chunk Cookie",
                R.drawable.chick
            ),
            Foods(
                "Bird Call Deluxe Chicken Sandwich",
                "All-natural crispy chicken, bacon, pepper-jack, tomato, lettuce, and herb mayo",
                R.drawable.birdcall
            )
        )

    }
    override fun toString(): String {
        return name?:""
    }

}
