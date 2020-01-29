package functions

import java.util.*
import kotlin.concurrent.schedule

fun main() {
    printUserInfo(getName(), { "surname : $it" }, getAge())

/*--------------------------------------------------------------------------------------------------------------------*/

//  HOF kullanırken aşağıdaki gibi bir val içine tanımını yaparak da kullanmamız mümkün.Yukarıdaki kullanım ile aynıdır.
    val higherOrderFunction = { surname: String ->
        "surName : $surname"
    }

//  anonymousFuntion olarak yazılabilir
    val anonymousFunction = fun(surName: String): String {
        return "surName $surName"
    }

// Expression olarak aşağıdaki gibi yazılabilir.
    val anonymousFunction2 = fun(surName: String): String = "surName $surName"

    printUserInfo(getName(), higherOrderFunction, getAge())
    printUserInfo(getName(), anonymousFunction, getAge())
/*--------------------------------------------------------------------------------------------------------------------*/


    getItemClickListener { buttonName ->
        println("$buttonName tıklandı")
    }

    val news = News()
    val newsType = NewsType()

//    Higher Order Func. (HOF) parametresi sonda olursa bu parametreyi fonksiyon parantezinin dışına alabiliyoruz.
//    Aşağıdaki blok bunu gösteriyor. HOF tek parametre içeriyorsa bunu *it* keywordu ile kullanabiliyoruz.

//    news.getNewsFromServer("FoxTv", newsType, {
//        println(this.toString())
//    })

    news.getNewsFromServer("FoxTv", newsType) {
        println(this.toString())
    }

}

fun getName(): String {
    return "Recep"
}

fun getAge(): Int = 26

fun printUserInfo(name: String, getSurname: (surName: String) -> String, age: Int): Unit {
    println("name: $name age: $age")

    println(getSurname("Fırıncıoğlu"))
}

fun getItemClickListener(onClick: (buttonName: String) -> Unit) {

    println("Tıklama işlemi başlatılıyor...")

    Timer().schedule(3000) {
        onClick("Login")

        println("Tıklama işlemi bitti.")
    }
}
/*--------------------------------------------------------------------------------------------------------------------*/

class News {
    fun getNewsType(newsType: NewsType): String {
        return when (newsType.toString()) {
            NewsType.breakingNews -> "Breaking"
            NewsType.urgent -> "Urgent"
            NewsType.local -> "Local"
            NewsType.global -> "Global"
            else -> "Normal"
        }
    }
}

class NewsType {
    companion object {
        val breakingNews = "BreakingNews"
        val urgent = "Urgent"
        val local = "Local"
        val global = "Global"
        val normal = "Normal"
    }
}

fun News.getNewsFromServer(channelType: String, newsType: NewsType, getNews: NewsType.(newsType: Int) -> Unit) {
    when (channelType) {
        "KanalD" -> {
            getNews(newsType, 1)
        }
        "ShowTV" -> {
            getNews(newsType, 2)
        }
        "Tv8" -> {
            getNews(newsType, 3)
        }
        "FoxTv" -> {
            getNews(newsType, 4)
        }
        "CNN" -> {
            getNews(newsType, 5)
        }
    }
}


infix fun News.filterName(getfilter: (filterType: String) -> Unit) {

}
