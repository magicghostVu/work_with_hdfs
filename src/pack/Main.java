package pack;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        String hdfsUrl = "hdfs://localhost:19000/";
        Configuration conf= new Configuration();
        conf.set("fs.defaultFS", hdfsUrl);
        FileSystem fs= FileSystem.get(conf);
        fs.copyFromLocalFile(new Path("C:\\Users\\magic_000\\Desktop\\archive.txt"), new Path("/achive3.txt"));
        System.out.println("Not throw IO exception");
    }
}
