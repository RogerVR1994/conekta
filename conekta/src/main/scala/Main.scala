object Main extends App {
  var listOfNumbers = (1 to 100).toList
  println("We have a list of numbers from 1 to 100. Plaease insert a number to remove from the list.")
  var invalidInput = true
  var userNumber = 1
  while (invalidInput) {
    var userInput = scala.io.StdIn.readLine()
    try {
      userNumber = userInput.toInt
      if (userNumber <= 100) {
        invalidInput = false  
      }
      println("Please enter a number between 1 and 100")
    } catch {
      case ex: Exception => {
        println("Please enter a number")
      }
    }
  }
  
  var filteredList = listOfNumbers.filterNot(x => x == userNumber)
  println("Success! You have removed number. Now the list looks as follows:" )
  filteredList.foreach(x => if (x%20 != 0) print(x.toString + ", ") else println(x.toString + ", "))
  var missingNumber = getMissingNumber(filteredList).toString
  println("The missing number in the list is " + missingNumber)
  
  
  def getMissingNumber(numbersList:List[Int]) : Int = {
    var missingNumber = false
    var i = 0
    var previousNumber = 1
    while (missingNumber == false) {
      if (numbersList(i) != previousNumber) {
        missingNumber = true
      }
      previousNumber += 1
      i += 1
    }
    return i
  }
}