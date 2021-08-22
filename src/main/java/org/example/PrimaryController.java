package org.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import  java.lang.Math;
import java.util.*;
import java.io.*;
//import java.lang.Math;
//import java.util.*;
//import  java.io.*;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    private double number1;
    private double number2;
    private  double a=1;
    private double npr=1,p,m,r=1;
    private double ncr=1,q,n,s=1,npr1,ncr1=1;
    private String operation;

    @FXML
    private TextField displayField;

    public PrimaryController(){

        displayField=new TextField();
    }
    @FXML
    private void onehandleaction(){
        String oldText=displayField.getText();
        String newText=oldText+"1";
        displayField.setText(newText);
    }
    @FXML
    private void twohandleaction(){
        String oldText=displayField.getText();
        String newText=oldText+"2";
        displayField.setText(newText);
    }
    @FXML
    private void threehandleaction(){
        String oldText=displayField.getText();
        String newText=oldText+"3";
        displayField.setText(newText);
    }
    @FXML
    private void fourhandleaction(){
        String oldText=displayField.getText();
        String newText=oldText+"4";
        displayField.setText(newText);
    }




    @FXML
    private void fivehandleaction(){
        String oldText=displayField.getText();
        String newText=oldText+"5";
        displayField.setText(newText);
    }



    @FXML
    private void sixhandleaction(){
        String oldText=displayField.getText();
        String newText=oldText+"6";
        displayField.setText(newText);
    }



    @FXML
    private void sevenhandleaction(){
        String oldText=displayField.getText();
        String newText=oldText+"7";
        displayField.setText(newText);
    }




    @FXML
    private void eighthandleaction(){
        String oldText=displayField.getText();
        String newText=oldText+"8";
        displayField.setText(newText);
    }



    @FXML
    private void ninehandleaction(){
        String oldText=displayField.getText();
        String newText=oldText+"9";
        displayField.setText(newText);
    }




    @FXML
    private void singlezerohandleaction(){
        String oldText=displayField.getText();
        String newText=oldText+"0";
        displayField.setText(newText);
    }



    @FXML
    private void doublezerohandleaction(){
        String oldText=displayField.getText();
        String newText=oldText+"00";
        displayField.setText(newText);
    }



    @FXML
    private void pointhandleaction(){
        String oldText=displayField.getText();
        String newText=oldText+".";
        displayField.setText(newText);
    }
    @FXML
    private void addhandleaction(){
        String oldText=displayField.getText();
        // String newText=oldText+"+";
        //displayField.setText(newText);
        number1=Double.parseDouble(oldText);
        displayField.clear();

        operation="Add";
    }



    @FXML
    private void subhandleaction(){
        String oldText=displayField.getText();
        // String newText=oldText+"-";
        // displayField.setText(newText);
        number1=Double.parseDouble(oldText);
        displayField.clear();
        operation="Sub";
    }


    @FXML
    private void mulhandleaction(){
        String oldText=displayField.getText();
        number1=Double.parseDouble(oldText);
        displayField.clear();

        operation="Mul";
    }


    @FXML
    private void divhandleaction(){
        String oldText=displayField.getText();
        number1=Double.parseDouble(oldText);
        displayField.clear();

        operation="Div";
    }


    @FXML
    private void squarehandleaction(){
        String oldText=displayField.getText();
        // String newText=oldText+"x^2";
        //displayField.setText(newText);
        number1=Double.parseDouble(oldText);
        operation="Square";
    }


    @FXML//modulashandleaction
    private void modulashandleaction(){
        String oldText=displayField.getText();
        // String newText=oldText+"%";
        //displayField.setText(newText);
        number1=Double.parseDouble(oldText);
        displayField.clear();
        operation="Modolas";
    }


    @FXML//fectrorialhandleaction
    private void fectrorialhandleaction(){
        String oldText=displayField.getText();
        //  String newText=oldText+"x!";
        // displayField.setText(newText);
        number1=Double.parseDouble(oldText);
        //   displayField.clear();
        operation="Fact";
    }
    @FXML
    private void sinhandleaction(){
        String oldText=displayField.getText();
        number1=Double.parseDouble(oldText);
        operation="sin";
    }


    @FXML
    private void coshandleaction(){
        String oldText=displayField.getText();
        number1=Double.parseDouble(oldText);
        operation="cos";
    }

    @FXML
    private void tanhandleaction(){
        String oldText=displayField.getText();
        number1=Double.parseDouble(oldText);
        operation="tan";
    }
    @FXML
    private void log10handleaction(){
        String oldText=displayField.getText();
        number1=Double.parseDouble(oldText);
        // displayField.clear();

        operation="Log1";
    }
    @FXML
    private void log2handleaction(){
        String oldText=displayField.getText();
        number1=Double.parseDouble(oldText);
        // displayField.clear();

        operation="Log2";
    }
    @FXML
    private void ncrhandleaction(){
        String oldText=displayField.getText();
        number1=Double.parseDouble(oldText);
        displayField.clear();

        operation="Ncr";
    }


    @FXML
    private void nprhandleaction(){
        String oldText=displayField.getText();
        number1=Double.parseDouble(oldText);
        displayField.clear();

        operation="Npr";
    }
    @FXML
    private void pihandleaction(){
        String oldText=displayField.getText();
        String  newText=oldText+"3.141516";
        displayField.setText(newText);

    }
    @FXML
    private void ehandleaction(){
        String oldText=displayField.getText();
        String  newText=oldText+"2.718281828";

        displayField.setText(newText);
    }

    @FXML
    private void  clearhandleaction(){
        String oldText=displayField.getText();

        displayField.setText("");


    }

    @FXML
    private void sqrthandleaction(){
        String oldText=displayField.getText();

        number1=Double.parseDouble(oldText);
        // displayField.clear();
        // displayField.getText();

        operation="Sqrt";
    }
    @FXML
    private void xpoweryhandleaction(){
        String oldText=displayField.getText();

        number1=Double.parseDouble(oldText);
        // displayField.clear();
        // displayField.getText();

        operation="power";
    }

    @FXML
    private void absolutehandleaction(){
        String oldText=displayField.getText();

        number1=Double.parseDouble(oldText);
        // displayField.clear();
        // displayField.getText();

        operation="Abs";
    }
    @FXML
    private void lnhandleaction(){
        String oldText=displayField.getText();

        number1=Double.parseDouble(oldText);
        // displayField.clear();
        // displayField.getText();

        // operation="Sqrt";
    }

    @FXML
    private void equelhandleaction(){
        String oldText=displayField.getText();
        // displayField.setText(oldText);
        //displayField.setText(oldText);
        number2=Double.parseDouble(oldText);

        // displayField.setText(String.valueOf(number2));

        double result=0;


        switch(operation)
        {

            case"Add":

                result=number1+number2;

                break;
            case"Sub":
                result=number1-number2;
                break;
            case"Mul":
                result=number1*number2;
                break;
            case"Div":
                result=number1/number2;
                break;
            case"Mod":
                result= number1 % number2;
                break;

            //case "Square":
            //  result=number1*2;
            case"Fact":
                for (int i=1;i<=number1;i++)
                {
                    a=a*i;
                    result=a;
                    displayField.clear();
                }
                break;

            case"Npr":{
                for (int i=1;i<=number1;i++){
                    npr=npr*i;
                    p=npr;
                }

                m=(number1-number2);

                for (int i=1;i<=m;i++){
                    r=r*i;


                }
                result=p/r;
                break;
            }
            case"Ncr":{
                //ncr=npr(n,r)!/r!;
                for (int i=1;i<=number1;i++){
                    ncr=ncr*i;
                    p=ncr;
                }
                n=(number1-number2);

                for (int i=1;i<=n;i++){
                    s=s*i;
                }
                npr1=p/s;
                for (int i=1;i<=number2;i++){
                    ncr1=i*ncr1;
                }
                result=npr1/ncr1;
                break;
            }
            case"Sqrt":
            {
                result=Math.sqrt(number1);
                displayField.clear();
                break;
            }
            case"sin": {
                double radien;
                radien = Math.toRadians(number1);
                result = Math.sin(radien);
                displayField.clear();
                break;
            }
            case"cos":{
                double radien;
                radien=Math.toRadians(number1);
                result=Math.cos(radien);
                displayField.clear();
                break;
            }
            case"tan":{
                double radien;
                if(number1==90){
                    // displayField.setText("Error");
                    break;
                }else{
                    radien=Math.toRadians(number1);
                    result=Math.tan(radien);
                    displayField.clear();
                }
                break;
            }
            case"Log1":{

                result=Math.log10(number1);
                displayField.clear();
                break;

            }
            case"Log2":{

                result=Math.log(number1);
                displayField.clear();
                break;

            }
            case"power":{
                for (int i=1;i<=number2;i++){
                    number1=number1*number1;
                }
                result=number1;
            }
            case"Abs":{
                result=Math.abs(number1);
            }
        }

        // System.out.printf("%f\n",number1);
        displayField.setText(String.format("%.4f",result));


    }



}
