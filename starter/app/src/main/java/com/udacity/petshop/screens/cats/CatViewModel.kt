package com.udacity.petshop.screens.cats

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.petshop.models.Cat
import timber.log.Timber

class CatViewModel : ViewModel() {
    // TODO: Figure out how to get images from URLS

    private val _cats = MutableLiveData<List<Cat>>()
    val cats : LiveData<List<Cat>>
        get() = _cats

    init {
        _cats.value = mutableListOf(
            Cat(breed = "Persian",
                coat = "Long",
                size = "Medium",
                shedding = 5,
                vocality = 1,
                intelligence = 2,
                description = "Floofy white sweetie. Some people think they're ugly because of their face. I think those people are ugly."),
            Cat(breed = "Munchkin",
                coat = "Short/long",
                size = "Medium",
                shedding = 3,
                vocality = 2,
                intelligence = 5,
                description = "Cat version of a Dachshund. I like them because they're shorter than me; they feed my ego."),
            Cat(breed = "Bengal",
                coat = "Short",
                size = "Medium",
                shedding = 2,
                vocality = 2,
                intelligence = 5,
                description = "Expensive cat that looks like a leopard. They tend to have chronic diarrhea and pee all over the place. That's your fun fact of the day."),
            Cat(breed = "Ragdoll",
                coat = "Long",
                size = "Large",
                shedding = 4,
                vocality = 2,
                intelligence = 4,
                description = "I remember reading a book when I was 11 that specifically described these cats as \"big-boned,\" so that's what I will do. Ragdolls are big-boned. Also very friendly."),
            Cat(breed = "Siamese",
                coat = "Short",
                size = "Medium",
                shedding = 2,
                vocality = 5,
                intelligence = 5,
                description = "Noisy. That's what they are mostly known for, I think. I mostly know them from The Lady and the Tramp; it didn't leave a very good impression."),
            Cat(breed = "Maine Coon",
                coat = "Long",
                size = "GIANT",
                shedding = 4,
                vocality = 1,
                intelligence = 4,
                description = "The official state cat of Maine, and they all look like HUGE wise old men that want me off their lawn immediately. Good cats."),
            Cat(breed = "Sphynx",
                coat = "Hairless",
                size = "Medium",
                shedding = 1,
                vocality = 4,
                intelligence = 5,
                description = "Sometimes, I wish I was as bald as this cat. I want to make them all tiny sweaters."),
            Cat(breed = "Pixiebob",
                coat = "Short",
                size = "Medium",
                shedding = 4,
                vocality = 3,
                intelligence = 5,
                description = "Some people claim that these domestic cats are just naturally-occurring bobcat hybrids, but they're liars. They're all liars."),
            Cat(breed = "",
                coat = "",
                size = "",
                shedding = 0,
                vocality = 0,
                intelligence = 0,
                description = "")
        ) // TODO: make another cat
    }

    fun onClickBreed(listIndex: Int) {
        // TODO: Get each clicked TextView to bind the data of its object to the CatDetailFragment
        Timber.i(cats.value?.get(listIndex)?.breed ?: "failed")
    }
}