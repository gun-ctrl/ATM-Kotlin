import java.util.*

var scanner = Scanner(System.`in`)
val key = 666
val wrongTime = 3
var total = 3000
var flag = false
fun main() {
    //欢迎界面
    println("***********************")
    println("欢迎使用农业银行系统")
    println("***********************")
    println("请输入密码：")
    judge()
}
//密码判断
private fun judge(){
    var input = scanner.nextInt()
    if (input.equals(key)){
       meu()
    }else{
        do {
            println("请重新输入密码：")
        }while (input != key)
    }
    meu()
}
//meu函数 管理菜单
private fun meu(){
    print("1、取款")
    print("2、存款")
    print("3、查询余额")
    print("4、退出")
    var choice = scanner.nextInt()
    //记录输入的数字
    when(choice){
        1 -> draw()
        2 -> deposit()
        3 -> getAccount()
        4 -> println("感谢您的使用，再见！！！")
    }
}
//实现取款功能
private fun draw(){
    do {
        //记录取款金额
        var number = scanner.nextInt()
        //判断取款金额是否小于余额
        flag = number<=total
    if (flag){
        println("取款成功！")
        total -= number
        meu()
    }else{
        println("取款失败！！！")
        println("请重新输入你的取款金额：")
    }
    }while (!flag)
}
//实现存款功能
private fun deposit(){
    println("请输入你的存款金额：")
    //记录存款金额
    var number = scanner.nextInt()
    if (number>0){
        total += number
        println("存款成功！")
        meu()
    }else{
     println("存款失败！！！")
        meu()
    }
}
//实现查询余额功能
private fun getAccount(){
    println("您的账户余额是：$total")
    meu()
}
