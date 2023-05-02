Задание 1
 
1)   Используйте команды операционной системы Linux и создайте две новых директории – «Игрушки для школьников» и «Игрушки для дошколят»
2)   Создайте в директории «Игрушки для школьников» текстовые файлы - «Роботы», «Конструктор», «Настольные игры»
3)   Создайте в директории «Игрушки для дошколят» текстовые файлы «Мягкие игрушки», «Куклы», «Машинки»
4)   Объединить 2 директории в одну «Имя Игрушки»
5)   Переименовать директорию «Имя Игрушки» в «Игрушки»
6)   Просмотреть содержимое каталога «Игрушки».
7)   Установить и удалить snap-пакет. (Любой, какой хотите)
8)   Добавить произвольную задачу для выполнения каждые 3 минуты (Например, запись в текстовый файл чего-то или копирование из каталога А в каталог Б).

    mrivss@mrivss-VirtualBox:~$ mkdir "Игрушки для школьников"
    mrivss@mrivss-VirtualBox:~$ mkdir "Игрушки для дошколят"
    mrivss@mrivss-VirtualBox:~$ cd "Игрушки для школьников"
    mrivss@mrivss-VirtualBox:~/Игрушки для школьников$ touch "Роботы" "Конструктор" "Настольные игры"
    mrivss@mrivss-VirtualBox:~/Игрушки для школьников$ cd
    mrivss@mrivss-VirtualBox:~$ cd "Игрушки для дошколят"
    mrivss@mrivss-VirtualBox:~/Игрушки для дошколят$ touch "Мягкие игрушки" "Куклы" "Машинки"
    mrivss@mrivss-VirtualBox:~$ mkdir "Имя Игрушки" && mv "Игрушки для дошколят"/* "Имя Игрушки" && mv "Игрушки для школьников"/* "Имя Игрушки"
    mrivss@mrivss-VirtualBox:~$ rm -r "Игрушки для дошколят" "Игрушки для школьников"
    mrivss@mrivss-VirtualBox:~$ mv "Имя Игрушки" "Игрушки"
    mrivss@mrivss-VirtualBox:~/Игрушки$ ls -a
    .   ..   Конструктор   Куклы   Машинки  'Мягкие игрушки'  'Настольные игры'   Роботы
    
    mrivss@mrivss-VirtualBox:~/Игрушки$ sudo su
    [sudo] пароль для mrivss: 
    root@mrivss-VirtualBox:/home/mrivss/Игрушки# cd
    root@mrivss-VirtualBox:~# snap find vls
    Название  Версия  Издатель  Примечание  Описание
    svls      v0.2.5  dalance   -           SystemVerilog language server
    root@mrivss-VirtualBox:~# snap install vlc
    vlc 3.0.18 от VideoLAN✓ установлен
    root@mrivss-VirtualBox:~# snap remove vlc
    vlc удалён

    root@mrivss-VirtualBox:~# su mrivss
    mrivss@mrivss-VirtualBox:/root$ cd
    mrivss@mrivss-VirtualBox:~$ nano test.txt
    mrivss@mrivss-VirtualBox:~$ crontab -e
    crontab: installing new crontab
    mrivss@mrivss-VirtualBox:~$ crontab -l
    ...
    */3  * * * * cat /home/mrivss/test.txt > /home/mrivss/test.txt.bak


