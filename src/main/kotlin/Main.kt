import javax.swing.plaf.basic.BasicInternalFrameTitlePane

fun main() {
    var story1 = AncestralStories("katana","Mercy","Risper")
    story1.storyLength("Once upon a time.")
    story1.storyLesson()
    story1.ageGroup()


    var book1 = LibraryCatalogue("Born A Crime","Trevor Noah",100,"New")
    book1.addingNewBook()

}
// 1. **Ancestral Stories:** In many African cultures, the art of storytelling is passed
// down from generation to generation. Imagine you're creating an application that
// records these oral stories and translates them into different languages. The
// stories vary by length, moral lessons, and the age group they are intended for.
// Think about how you would model `Story`, `StoryTeller`, and `Translator`
// objects, and how inheritance might come into play if there are different types of
// stories or storytellers.

// pseudo code:Input-oral stories,
// output-stories in diferrent languages,
// process - stories class with length, moral lessons, and the age group intended for as attributes
// methods-
//objects-story,Storyteller,translator
 class AncestralStories(var story:String,var storyTeller:String,var translator:String){
     fun storyLength(wholeStory:String):Int{
         var words = wholeStory.length()
         return words
     }
    fun storyLesson(){
        var lesson = "Work Hard"
        println("The moral lesson of the story is:${lesson}")
    }

    fun ageGroup(){
        println("The story is for children")
    }

 }

//8. Create a LibraryCatalog class that handles the cataloging and management of
// books in a library. Implement methods to add new books, search for books by
// title or author, keep track of available copies, and display book details.
// Pseudo
// input- books catalogue
// output - managed books- libraryCatalogue class
// process - create libraryCatalogue class with attributes:title,author,copies,state and methods:search,add new books

class LibraryCatalogue(var title:String,var author:String,var copies:Int,var bookState:String){
    fun addingNewBook(){
        println("Books are now 30")
    }
}












