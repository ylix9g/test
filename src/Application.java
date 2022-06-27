public class Application {

  public static void main(String[] args) {
    // Git - программа выступающая в роли системы контроля версий. Система
    // контроля версий позволяет хранить историю изменений в рамках репозитория
    // т.е. кто внес изменения, когда, какие были изменения.

    // Репозиторий - каталог относительно которого должны отслеживаться
    // изменения системой контроля версий (зачастую это основная папка проекта).

    // git --version - команда для вывода используемой версии программы Git.

    // git init - команда инициализирующая репозиторий в том каталоге в рамках
    // которого вызвана.

    // git status - команда для вывода актуального состояния репозитория т.е.
    // по каким файлам отслеживаются изменения, по каким нет.

    // В репозитории не должны быть файлов и папок специфичных для проекта на
    // локальном устройстве.
    // .idea - папка в которой храниться конфигурации проекта IDEA,
    // конфигурация модулей, конфигурация версии Java и т.д.
    // *.iml - файл с описанием Java модуля для IDEA.
    // Помимо этого в репозитории не должно быть проекта в собранном виде т.е.
    // это информация в репозитории не имеет смысла (папки типа out, target,
    // build и т.д.).

    // git add <files and directories> - добавляет папки и файлы для
    // отслеживания изменений которые должны быть зафиксированы в истории.

    // git config user.name - конфигурационный параметр хранящий имя человека
    // которые делает изменения в рамках репозитория.

    // git config user.email - конфигурационный параметр хранящий email
    // человека которые делает изменения в рамках репозитория.

    // git commit -m <message> - фиксирует в истории изменения актуальные на
    // момент вызова команды с информационным сообщением записанным в `message`.
  }
}
