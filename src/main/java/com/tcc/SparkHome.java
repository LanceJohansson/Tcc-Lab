package com.tcc;

import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class SparkHome implements SparkApplication{
  @Override
  public void init() {
    get("/hello", (req, res) -> "Hello World");
  }
}