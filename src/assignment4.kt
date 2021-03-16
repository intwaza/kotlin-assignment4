import java.util.*

fun main() {
string("Belyse","Akirachix","bool","lisalab")
    number()
   val student= name("Belyse","Intwaza","Aime")
    println(Arrays.toString(student))
    city()
}
fun string(name:String,school:String,classrom:String,classes:String){
    val string= arrayOf(name, school,classrom,classes)
    println(Arrays.toString(string))
}
fun city(){
    val cities= arrayOf("harare","mumbai","dodoma","jakarita")
   println(cities[0].capitalize()+ " " +cities[1].capitalize()+ " "+ cities[2].capitalize()+" " +cities[3].capitalize())

}
fun number(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    val total= numbers.component2()+numbers.component5()
    println(total)
    var index= numbers.indexOf(158)
    println(index)
    var sorting= numbers.sortedArray()
    for(elements in sorting){
        println(elements)
    }
    }
fun name(name1:String, name2:String, name3:String):Array<String>{
    var names= arrayOf(name1,name2,name3)
    return names
}
