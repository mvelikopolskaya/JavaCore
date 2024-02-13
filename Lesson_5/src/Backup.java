import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class Backup {

    public void copyDirectiory(String filePathSource, String filePathBackup) {
       Path pathSource = Paths.get(filePathSource);
       try {
           Path pathBackup = Files.createDirectory(Paths.get(filePathBackup));
           for(File file : pathSource.toFile().listFiles()){
               Files.copy(Paths.get(file.getPath()), Paths.get(pathBackup + "/" + file.getName()), StandardCopyOption.REPLACE_EXISTING);
           } throw new IOException();
       }catch (IOException e){
           e.getMessage();
       }

    }
}
