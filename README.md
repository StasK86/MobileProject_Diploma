# Проект по автоматизации тестирования мобильного приложения [Wikipedia](https://ru.wikipedia.org/)

<p align="center"><a href="https://ru.wikipedia.org"><img src="psv/pictures/Wiki.jpg" align="center" width="500" height="300" alt="Wiki"/></a></p>
Википедия — свободная общедоступная мультиязычная универсальная интернет-энциклопедия, которую может дополнять и редактировать каждый.
Здесь публикуются анонсы лучших статей Википедии на русском языке (а также некоторые Викиновости и избранные медиафайлы из Викисклада).

---

## :notebook: Содержание:

- [Стек технологий](#computer-стек-технологий)
- [Тестовые сценарии](#clipboard-тестовые-сценарии)
- [Сборка в Jenkins](#-сборка-в-jenkins)
- [Команда для запуска](#rocket-команда-для-запуска)
- [Allure отчет](#-allure-отчет)
- [Интеграция с Allure TestOps](#-интеграция-с-allure-testops)
- [Интеграция с Jira](#-интеграция-с-jira)
- [Уведомления в Telegram чат с ботом](#-уведомления-в-telegram-чат-с-ботом)
- [Видео запуска тестов в Selenoid](#-видео-запуска-тестов-в-selenoid)

---

## :computer: Стек технологий

<p align="left">
<a href="https://www.jetbrains.com/idea/"><img src="psv/pictures/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA" title="IntelliJ IDEA"/></a>
<a href="https://www.java.com/"><img src="psv/pictures/Java.svg" width="50" height="50" alt="Java" title="Java"/></a>
<a href="https://github.com/"><img src="psv/pictures/GitHub.svg" width="50" height="50" alt="Github" title="GitHub"/></a>
<a href="https://junit.org/junit5/"><img src="psv/pictures/JUnit5.svg" width="50" height="50" alt="JUnit 5" title="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="psv/pictures/Gradle.svg" width="50" height="50" alt="Gradle" title="Gradle"/></a>
<a href="https://selenide.org/"><img src="psv/pictures/Selenide.svg" width="50" height="50" alt="Selenide" title="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="psv/pictures/Selenoid.svg" width="50" height="50" alt="Selenoid" title="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="psv/pictures/Allure_Report.svg" width="50" height="50" alt="Allure" title="Allure"/></a>
<a href="https://qameta.io/"><img src="psv/pictures/Allure_TO.svg" width="50" height="50" alt="Allure TestOps" title="Allure TestOps"/></a>
<a href="https://www.jenkins.io/"><img src="psv/pictures/Jenkins.svg" width="50" height="50" alt="Jenkins" title="Jenkins"/></a>
<a href="https://www.atlassian.com/ru/software/jira"><img src="psv/pictures/Jira.svg" width="50" height="50" alt="Jira" title="Jira"/></a>
<a href="https://www.telegram.org/"><img src="psv/pictures/Telegram.svg" width="50" height="50"/></a>
</p>

---

## :clipboard: Реализованные проверки:

[Проверка локального запуска ](https://github.com/StasK86/MobileProject_Diploma/blob/master/src/test/java/com/krigersv/tests/LocalTests.java)

- :white_check_mark: Поиск текста в википедии
- :white_check_mark: Проверка статьи
- :white_check_mark: Проверка страниц wiki
- :white_check_mark: Проверка выбора языка
- :white_check_mark: Проверка страницы авторизации

[Проверка удаленного запуска ](https://github.com/StasK86/MobileProject_Diploma/blob/master/src/test/java/com/krigersv/tests/AndroidTests.java)

- :white_check_mark: Поиск в википедии
- :white_check_mark: Проверка ошибки при открытии статьи
- :white_check_mark: Проверка выбора языка
- :white_check_mark: Проверка ошибки при поисковом запросе

---

## :rocket: Запуск автотестов:

#### Локальный запуск тестов из терминала:

```bash
gradle clean local -DdeviceHost=local
```

#### Удаленный запуск тестов в Browserstack:

```bash
gradle clean android -DdeviceHost=stack
```

### <img src="psv/pictures/Jenkins.svg" width="50" height="50"/> Сборка в [Jenkins](https://jenkins.autotests.cloud/job/MobileProject_Jenkins/)

<p align="center">
<img src="psv/screenshots/Screenshot5.png" alt="Jenkins Build" width="1000" height="300">
</p>

---

## <img src="psv/pictures/Allure_Report.svg" width="50" height="50"/> [Allure](https://jenkins.autotests.cloud/job/MobileProject_Jenkins/7/allure/) отчет

### Главная страница отчета

<p align="center">
<img src="psv/screenshots/Screenshot6.png" alt="Allure report" width="1000" height="350">
</p>

### Тест-кейсы

<p align="center">
<img src="psv/screenshots/Screenshot7.png" alt="Test Case" width="1000" height="350">
</p>

### Графики

<p align="center">
<img src="psv/screenshots/Screenshot8.png" alt="Allure-graph" width="1000" height="400">
</p>

---

## <img src="psv/pictures/Allure_TO.svg" width="50" height="50"/> Интеграция с [Allure TestOps](https://allure.autotests.cloud/project/3817/dashboards)

### Dashboards

<p align="center">
<img src="psv/screenshots/Screenshot4.png" alt="TestOps dashboard" width="1000" height="400">
</p>

### Автоматизированные тест-кейсы

<p align="center">
<img src="psv/screenshots/Screenshot2.png" alt="TestOps dashboard" width="1000" height="400">
</p>

### Запуск автоматизированных тестов в **TestOps**

<p align="center">
<img src="psv/screenshots/Screenshot3.png" alt="TestOps launch" width="1000" height="400">
</p>

---

## <img src="psv/pictures/Jira.svg" width="50" height="50"/> Интеграция с [Jira](https://jira.autotests.cloud/browse/HOMEWORK-970)

### Задача в Jira

<p align="center">
<img src="psv/screenshots/Screenshot1.png" alt="TestOps launch" width="1000" height="400">
</p>

#### Содержание задачи

- :heavy_check_mark: Цель
- :heavy_check_mark: Задачи для выполнения
- :heavy_check_mark: Тест-кейсы из Allure TestOps
- :heavy_check_mark: Результат прогона тестов в Allure TestOps

---

## <img src="psv/pictures/Telegram.svg" width="50" height="50"/> Уведомления в Telegram чат с ботом




<p align="center">
<img src="psv/screenshots/Screenshot9.png" alt="TestOps launch" width="500" height="400">
</p>




---

## <img src="psv/pictures/Selenoid.svg" height="50"/> Видео запуска тестов в Selenoid

<p align="center">
<img src="psv/videos/video.gif" alt="TestOps launch" width="800" height="400">
</p>

---




