//: Playground - noun: a place where people can play

import UIKit

var str = "Hello, playground"


/* Class */
class Human {
    var hands = "手"
    var feet = "腳"

}
//Inheritance
class 獅 : Human {
    func bark() {
        print("Fight with \(hands)")
    }
    
}

獅().bark()



/* Enum */
enum Status {
    case Success
    case Error
}

let replayStatus = Status.Error

if replayStatus == .Success {
    print("成功")
}
else if replayStatus == .Error {
    print("錯誤")
}

/* Struct */
struct Location {
    let lat:Double
    let lon:Double
}

let Taiwan = Location(lat: 121, lon: 23.5)
print("Taiwan is locate at \(Taiwan.lat) and \(Taiwan.lon)")


/* Optional */
let optionalInt = Int("123")

if let okint = optionalInt {
    //這裡的程式碼一定會是 數字
    print(okint)
}

let okint2 = optionalInt!
okint2









