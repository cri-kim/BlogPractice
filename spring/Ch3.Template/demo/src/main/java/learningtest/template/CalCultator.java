package learningtest.template;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CalCultator {
    public Integer calcSum(String filePath) throws IOException {
        BufferedReaderCallback sumCallback = new BufferedReaderCallback() {
            @Override
            public Integer doSomethingWithReader(BufferedReader br) throws IOException {
                Integer sum = 0;
                String line = null;
                while ((line = br.readLine()) != null) {
                    sum += Integer.valueOf(line);
                }

                return sum;
            }
        };
        return fileReadTemplate(filePath, sumCallback);
    }
    public Integer fileReadTemplate(String filepath
            , BufferedReaderCallback callback)
            throws IOException{
        BufferedReader br = null;
        try {
            br= new BufferedReader(new FileReader(filepath));
            int ret = callback.doSomethingWithReader(br);

            return ret;
        }catch (IOException e){
            throw e;
        }
        finally{
            try {
                br.close();
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public Integer lineReadTemplate(String filepath, LineCallback callback, int intVal)
    throws IOException{
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader((filepath)));
            Integer res = intVal;
            String line = null;
            while((line = br.readLine())!= null){
                res = callback.doSomethingWithLine(line,res);
            }
            return res;
        }catch (IOException e){
            throw e;
        }
        finally {
            try {
                br.close();
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }

    }

    public Integer calcMultiply(String filePath) throws IOException{
        LineCallback multiplyCallback = new LineCallback(){
            @Override
            public Integer doSomethingWithLine(String line, Integer value)
                    throws IOException {
                return value * Integer.valueOf(line);
            }
        };
        return lineReadTemplate(filePath,multiplyCallback,1);
    }
}
