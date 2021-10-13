fun main(args: Array<String>) {
//    Question 3
//    for(i in -5..5){
//        println("The position of y is " +calculateY(3,i,-1))
//    }

//    Question 4
//    for(i in 0..20){
//        var line1 = calculateY(3, i, 5)
//        var line2 = calculateY(4, i, 2)
//        println("Line 1 y intercept is $line1  and line y intercept is $line2")
//
//        if(line1 == line2){
//            println("=====================================================================")
//            println("Lines 1 and 2 intersect at x at point $i")
//            println("The coordinate of intersection is ($i , $line1)")
//            println("=====================================================================")
//        }
//    }

//   Question 5
    //
    intersection(3,5,4,2)
    intersection(2,1,3,3)
    intersection(-2,3,3,-2)


}

fun calculateY(m : Int, x : Int, c : Int) : Int {
    // y = mx + c - formula for a straight line
    return m * x + c
}

fun intersection(mOne : Int, cOne : Int, mTwo : Int, cTwo : Int) : Unit {
    var intercept = (cTwo - cOne)/ (mOne - mTwo)
    for(i in 1..99){
        if(intercept == i ) {
            println("$intercept is the x intercept where the lines intersect")
            return
        }
        if(i == 99)
            println("The lines dont intersect")
    }
}