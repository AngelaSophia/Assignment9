fun main ()  {
var names=evenIndex(listOf("Ayugi","Sophia","Laura","Browlian","Everline","Thomas","Grace","Vallary","Charles","Abeid"))
    println(names)
    Personage()
    println(averageHeights(listOf(2.3,1.2,3.4,5.6,7.8,4.0) as MutableList<Double>))
    personal()
    var cars= listOf(
        Car("KES109R",200),
        Car("KRA205R",100)
    )
    println(car(listOf(200,100)))
}

fun evenIndex(word:List<String>):List<String>{
    var names= mutableListOf<String>()
       for (y in word){
           if (word.indexOf(y)%2==0){
               names.add(y)
           }
       }
   return names
}
fun averageHeights(heights:MutableList<Double>):Double{
    var avar=heights.average()
    var total=heights.sum()
    println(total)
    return avar
}
data class person(var name:String,var age:Int,var height:Double,var weight:Double)
      fun Personage ()  {
      var personObject= listOf(
          person("Ayugi",56,7.8,72.0),
          person("Everline",48,6.5,78.0),
          person("Laura",5,3.4,25.0)
      )
  var descendingPresenage=personObject.sortedByDescending { person -> person.age }
println(personObject)
  }
data class Person(var name:String,var age:Int,var height:Double,var weight:Double)
fun personal () {
    var personObject = mutableListOf(
        person("Ayugi", 56, 7.8, 72.0),
        person("Everline", 48, 6.5, 78.0),
        person("Laura", 5, 3.4, 25.0)

    )
    personObject.addAll(
        listOf(
            person("Irine", 30, 2.3, 72.1),
            person("Brawlian", 6, 2.3, 20.1),
        )
    )
println(personObject)
}

data class Car(var registration:String, var mileage:Int)
fun car(mileage: List<Int>):Int{
    var x= mileage.average().toInt()
    return x
}





