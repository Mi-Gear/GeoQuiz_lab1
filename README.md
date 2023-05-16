# Лабораторная работа №1. «Первое Android-приложение».

Задачи:

Измените уведомление так, чтобы оно отображалось в верхней, а не в нижней части экрана. Для изменения способа отображения уведомления воспользуйтесь функцией setGravity класса Toast. Выберите режим Gravity.TOP. За дополнительнной информацией обращайтесь к документации разработчика по адресу developer. 
android.com/reference/kotlin/android/widget/Toast#setgravity.

Решение задач:

```Kotlin
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
                    Message(applicationContext,"Рутинный пельмень 2")

        }
    }
}
fun Message(con:Context, text: String)
{
    val toast = Toast.makeText(con, text, Toast.LENGTH_LONG)
    toast.setGravity(Gravity.TOP,0,0)
    toast.show()
}
```
![image](https://github.com/Mi-Gear/GeoQuiz_lab1/assets/82881153/7b1bcd71-34b8-4d11-9693-5bd33ae6fda5)
#
# Вывод:

В ходе выполнения данной лабораторной работы я научился создавать Android-приложение, используя программу Android Studio и познакомился с языком Kotlin, в частности поработал с библиотекой Toast, с помощью которой выполнил задание, а именно вызвал всплывающее уведомление, а также, изменил его полжение соответсвенно задачам, а именно сверху. Я очень рад, что у меня есть своё первое Android-приложение!

