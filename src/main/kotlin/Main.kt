fun main() {
    var story1 = AncestralStories("katana","Mercy","Risper")
    story1.storyLength("Once upon a time.")
    story1.storyLesson()
    story1.ageGroup()
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









