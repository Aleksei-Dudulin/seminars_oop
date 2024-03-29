package ComplexCalculatorApp;

import ComplexCalculatorApp.Controllers.iLogger;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Logger implements iLogger {
    private String logFilePath;

    /**
     * Констуктор логгера
     *
     * @param logFilePath путь к файлу логирования
     */
    public Logger(String logFilePath) {
        this.logFilePath = logFilePath;
    }

    /**
     * Геттер для возврата пути к файлу
     *
     * @return
     */
    public String getLogFilePath() {
        return logFilePath;
    }

    /**
     * Реализация функции логирования строки в файл
     *
     * @param messageLog строка для логирования
     */
    @Override
    public void log(String messageLog) {
        try (FileWriter fw = new FileWriter(logFilePath, true)) {
            fw.write(LocalDateTime.now() + " : " + messageLog);
            fw.flush();
        } catch (IOException e) {
            System.out.println("Error. The logging process has not been completed!");
            System.out.println(e.getMessage());
        }
    }
//    public void log(String messageLog) {
//        FileWriter fw = null;
//        try {
//            fw = new FileWriter(logFilePath, true);
//            fw.write(LocalDateTime.now().toString() + " : " + messageLog);
//        } catch (IOException e) {
//            System.out.println("Возникла ошибка при логировании. Логирование не произошло...");
//            System.out.println(e.getMessage());
//        } finally {
//            try {
//                fw.close();
//            } catch (IOException e) {
//                System.out.println("Не удалось закрыть файл логирования - " + logFilePath);
//                System.out.println(e.getMessage());
//            }
//        }
//    }
}
