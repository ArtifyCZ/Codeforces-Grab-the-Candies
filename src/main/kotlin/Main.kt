// solution for https://codeforces.com/contest/1807/problem/B
fun main() {
    (1..readln().toInt()).forEach { _ ->
        readln().toInt()
        val a = readln().split(" ").map { it.toInt() }
        val sumEven = a.filter { it % 2 == 0 }.sum()
        val sumOdd = a.filter { it % 2 == 1 }.sum()
        println(if(sumOdd < sumEven) "YES" else "NO")
    }
}
