@echo off
REM set the value of class_path to the folder contains your JAR files
set properties_path=prop.properties

java -cp "App_Prod_EncryptApp.jar;lib/*" MainClass