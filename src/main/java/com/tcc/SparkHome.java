package com.tcc;

import spark.Spark;
import spark.Route;
import spark.Request;
import spark.Response;
import spark.servlet.SparkApplication;

public class SparkHome implements SparkApplication{

  @Override
    public void init() {
        Spark.get("/hello", new Route() {
            @Override
            public Object handle(Request request, Response response) {
                return "Yes, Here";
            }
        });
        }
}