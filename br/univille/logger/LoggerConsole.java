package br.univille.logger;

import java.lang.System.Logger.Level;


public class LoggerConsole implements Logger{

    @Override
    public void log(br.univille.logger.Level level, String message) {
        // TODO Auto-generated method stub
        System.out.println("[" + level + "] " + message);
    }
}
