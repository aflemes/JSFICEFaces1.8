/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.icesoft.faces.component.inputfile.FileInfo;
import com.icesoft.faces.component.inputfile.InputFile;

import javax.faces.event.ActionEvent;
/**
 *
 * @author skyli
 */
public class user {

    private FileInfo currentFile;

    public FileInfo getCurrentFile() {
        return currentFile;
    }

    public void uploadActionListener(ActionEvent actionEvent) {
        InputFile inputFile = (InputFile) actionEvent.getSource();
        currentFile = inputFile.getFileInfo();
    }    

}

