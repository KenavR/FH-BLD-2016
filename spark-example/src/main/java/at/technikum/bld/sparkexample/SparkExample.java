package at.technikum.bld.sparkexample;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.VoidFunction;

import java.util.Arrays;
import java.util.List;

public class SparkExample {
    public static void main(String[] args) {

        SparkConf sparkConf = new SparkConf().setAppName("SparkExample").setMaster("local");
        JavaSparkContext ctx = new JavaSparkContext(sparkConf);
        String[] arr = new String[]{"John", "Paul", "Gavin", "Rahul", "Angel"};
        List<String> inputList = Arrays.asList(arr);
        JavaRDD<String> inputRDD = ctx.parallelize(inputList);
        inputRDD.foreach(new VoidFunction<String>() {

            public void call(String input) throws Exception {
                System.out.println(input);

            }
        });
    }
}
