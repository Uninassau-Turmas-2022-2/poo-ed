fun main() {

    var c = mutableListOf(5.12, 4.8, 4.6, 5.2, 3.5, 5.0)
    var profit = 0.0
    var f_i = 0
    var l_i = 1
    var i_c = 0
    var i_v = 1

    while (l_i != c.size) {
        if (profit < (c[l_i] - c[f_i])){
            profit = c[l_i] - c[f_i]
            i_c = f_i
            i_v = l_i
        }
        if (c[l_i] < c[f_i]) {
            f_i = l_i
        }
        l_i++
    }
    println("Compra: $i_c Venda: $i_v Ganho: $profit")
}