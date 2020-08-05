## Задача №1 - "Vk"

### Легенда

Вам поручили создать аналог одной известной социальной сети. В соц.сетях есть посты (и вот так вот случилось, что начать решили с них):

![](assets/vk-regular.png)

Проанализируйте социальную сеть [Vk](https://vk.com/netology). Подумайте, как бы вы спроектировали класс(ы) для хранения данных о посте?

Если у вас по каким-то причинам недоступны сервисы Vk, то воспользуйтесь [PDF-версией страницы](assets/VK.pdf).

Что нужно сделать:
1. Создайте Maven-проект
1. Добавьте в него спроектированный класс(ы) (поместите их в `package` `domain`)
1. Сделайте коммит и установите тег v1
1. Отправьте всё на GitHub

**Важно**: создавать объекты класса и заполнять их данными не нужно (хотя полезно продумать, как и что будет храниться).

Сравните результаты своего проектирования с тем, как это сделали разработчики VK: [документация](https://vk.com/dev/objects/post)

Если у вас по каким-то причинам недоступны сервисы Vk, то воспользуйтесь [PDF-версией страницы](assets/post.pdf)

Обратите внимание: описание объектов приведено в формате JSON (один из самых популярных форматов передачи данных) поскольку предполагается, что API Vk можно использовать на разных языках программирования.

Обратите внимание: в Java не принято классы, служащие для создания объектов, называть во множественном числе (например, `Comments`). Мы предлагаем вам подобные классы называть, например, `CommentsInfo`, а поле в классе `Post` - `commentsInfo`.

<details>
  <summary>Подсказка</summary>
  
  Это должно выглядеть примерно так:
  
  ```java
  // файл Post.java
  public class Post {
    private int id;
    ...
    private CommentsInfo commentsInfo;
    ...
    // + get/set на все поля
  }
  ```
  ```java
  // файл CommentsInfo.java
  public class CommentsInfo {
    private int count;
    private boolean canPost;
    ...
    // + get/set на все поля
  }
  ```
</details>

**Важно**: всегда старайтесь анализировать API популярных сервисов - это поможет вам самим научиться проектировать (обучение на примере).

Дополните при необходимости свой класс отсутствующими полями (при необходимости создайте новые классы). Игнорируйте все поля, тип которых - `array`.

Сделайте коммит и установите тег v2. В комментарии к сдаче ДЗ укажите: почему (по вашему мнению), в описании объектов в Vk оказались поля, которых не было в вашем классе?

Не забывайте, что в Java принято именование в стиле `ownerId`, а не `owner_id`.

P.S. Не думайте, что разработчики Vk сделали всё идеально. Например, подумайте, как лучше хранить значения типа Да/Нет и посмотрите, как это делают они.

Итого:
1. У вас должен быть репозиторий на GitHub, в котором расположен ваш Java-код (автотесты и CI не нужны) и два тега
1. В комментариях к сдаче ДЗ ответ на вопрос "почему (по вашему мнению), в описании объектов в Vk оказались поля, которых не было в вашем классе?" 
