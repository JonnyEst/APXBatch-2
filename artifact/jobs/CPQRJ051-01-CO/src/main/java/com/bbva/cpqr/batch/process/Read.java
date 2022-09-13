package com.bbva.cpqr.batch.process;

import com.bbva.cpqr.lib.r051.CPQRR051;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

public class Read implements Tasklet {

    private String outPath;
    private CPQRR051 cpqrR051;

    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws IOException, ParseException {

      String Path = outPath;

        try (BufferedReader lectura = new BufferedReader(new FileReader(Path))) {
            String strCurrentLine;
            while ((strCurrentLine = lectura.readLine()) != null) {
                System.out.println("---- ESCRIBIO:"+strCurrentLine);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return RepeatStatus.FINISHED;
    }


    public void setCpqrR051(CPQRR051 cpqrR051) {
        this.cpqrR051 = cpqrR051;
    }

    public void setOutPath(String outPath) {
        this.outPath = outPath;
    }
}

