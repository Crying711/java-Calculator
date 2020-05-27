package sample;
import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCharacterCombination;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.util.Random;

public class Controller<d> {
    double num, ans;
    int cla;


    @FXML
    private TextField text;
    @FXML   private Label lab;



    public void arithem(){
    switch (cla){ //加法
        case  1:
            try {
                ans = num +Double.parseDouble(text.getText());
                text.setText(Double.toString(ans));
                break;
            }catch (Exception e){

                new Thread(){
                    @Override
                    public void run() {
                        Voice.modifyss("错误的值");
                    }
                }.start();
            }

        case  2: //减法
            try {


            ans = num - Double.parseDouble(text.getText());
            text.setText(Double.toString(ans));
            break;}catch (Exception e){

                new Thread(){
                    @Override
                    public void run() {
                        Voice.modifyss("错误的值");
                    }
                }.start();
            }
        case  3: //除法
            try{
            ans = num * Double.parseDouble(text.getText());
            text.setText(Double.toString(ans));
            break;}catch (Exception e){
                new Thread(){
                    @Override
                    public void run() {
                        Voice.modifyss("错误的值");
                    }
                }.start();
            }
        case  4: //乘法
            try {


            ans = num / Double.parseDouble(text.getText());
            text.setText(Double.toString(ans));
            break;}catch (Exception e){
                new Thread(){
                    @Override
                    public void run() {
                        Voice.modifyss("错误的值");
                    }
                }.start();
            }
        case  5: //摩尔
            try {


            ans = num % Double.parseDouble(text.getText());
            text.setText(Double.toString(ans));
            break;}catch (Exception e){
                new Thread(){
                    @Override
                    public void run() {
                        Voice.modifyss("错误的值");
                    }
                }.start();

            }

    }
}




    public void onButtonClick(ActionEvent event) {




        arithem();
        new Thread(){
            @Override
            public void run() {
                Voice.modifyss("等于"+text.getText());
            }
        }.start();

        lab.setText(null);


    }

    public void aonButtonClick(ActionEvent event) {
     text. appendText("0");

        new Thread(){
            @Override
            public void run() {
                Voice.modifyss("0");
            }
        }.start();
    }
    public void bonButtonClick(ActionEvent event) {
     text. appendText("1");

        new Thread(){
            @Override
            public void run() {
                Voice.modifyss("1");
            }
        }.start();
    }
    public void conButtonClick(ActionEvent event) {
        text. appendText("2");

        new Thread(){
            @Override
            public void run() {
                Voice.modifyss("2");
            }
        }.start();
    }
    public void donButtonClick(ActionEvent event) {
        text. appendText("3");

        new Thread(){
            @Override
            public void run() {
                Voice.modifyss("3");
            }
        }.start();
    }
    public void eonButtonClick(ActionEvent event) {
        text. appendText("4");
        Voice.modifyss("4");
        new Thread(){
            @Override
            public void run() {
                Voice.modifyss("4");
            }
        }.start();
    }
    public void fonButtonClick(ActionEvent event) {
        text. appendText("5");

        new Thread(){
            @Override
            public void run() {
                Voice.modifyss("5");
            }
        }.start();
    }
    public void gonButtonClick(ActionEvent event) {
        text. appendText("6");

        new Thread(){
            @Override
            public void run() {
                Voice.modifyss("6");
            }
        }.start();
    }
    public void honButtonClick(ActionEvent event) {
        text. appendText("8");

        new Thread(){
            @Override
            public void run() {
                Voice.modifyss("8");
            }
        }.start();

    }
    public void ionButtonClick(ActionEvent event) {
        text. appendText("9");
        new Thread(){
            @Override
            public void run() {
                Voice.modifyss("9");
            }
        }.start();

    }
    public void zonButtonClick(ActionEvent event) {
        text. appendText("7");

        new Thread(){
            @Override
            public void run() {
                Voice.modifyss("7");
            }
        }.start();

    }
    public void dub(ActionEvent event) {
        text. appendText(".");
        new Thread(){
            @Override
            public void run() {
                Voice.modifyss("小数点");
            }
        }.start();

    }
    public void  add(ActionEvent event) {
       num = Double.parseDouble(text.getText());
       cla =1;
       text.setText("");
       lab.setText(num +"+");

        new Thread(){
            @Override
            public void run() {
                Voice.modifyss("加上");

            }
        }.start();
    }
    public void sub(ActionEvent event) {
        num = Double.parseDouble(text.getText());
        cla =2;
        text.setText("");
        lab.setText(num +"-");
        Voice.modifyss("减去");
        new Thread(){
            @Override
            public void run() {

                Voice.modifyss("减去");
            }
        }.start();
    }
    public void mul(ActionEvent event) {
        num = Double.parseDouble(text.getText());
        cla =3;
        text.setText("");
        lab.setText(num +"*");

        new Thread(){
            @Override
            public void run() {
                Voice.modifyss("乘与");

            }
        }.start();
    }
    public void div(ActionEvent event) {
        num = Double.parseDouble(text.getText());
        cla =4;
        text.setText("");
        lab.setText(num +"/");

        new Thread(){
            @Override
            public void run() {
                Voice.modifyss("除与");

            }
        }.start();
    }
    public void moer(ActionEvent actionEvent) {
        num = Double.parseDouble(text.getText());
        cla = 5;
        text.setText("");
        lab.setText(num +"%");

        new Thread(){
            @Override
            public void run() {

                Voice.modifyss("余");
            }
        }.start();

    }
    public void pa(ActionEvent event) { //百分比
       try {


        num = Double.parseDouble(text.getText());
        ans = num / 100;
        text.setText(Double.toString(ans));


        new Thread(){
            @Override
            public void run() {


                Voice.modifyss("的百分比是"+text.getText());
            }
        }.start();
    }catch (Exception e){
           new Thread(){
               @Override
               public void run() {
                   Voice.modifyss("错误的值");
               }
           }.start();

       }}
    public void X2(ActionEvent event) { //平方
try {

    num = Double.parseDouble(text.getText());
    ans = num * num;


    text.setText(Double.toString(ans));

    new Thread() {
        @Override
        public void run() {

            Voice.modifyss("的平方是" + text.getText());
        }
    }.start();
}catch (Exception e){
    new Thread(){
        @Override
        public void run() {

        }
    }.start();
}}
    public void x1(ActionEvent event) { //x分之一

      try {
          num = Double.parseDouble(text.getText());
          ans = 1 / num;

          text.setText(Double.toString(ans));
          new Thread(){
              @Override
              public void run() {


                  Voice.modifyss("分之一是"+text.getText());

              }
          }.start();
      }catch (Exception e){
          new Thread(){
              @Override
              public void run() {
                  Voice.modifyss("错误的值");
              }
          }.start();
      }



    }
    public void del(ActionEvent event) { //清空
        try {


            text.setText(null);
            lab.setText(null);
            new Thread() {
                @Override
                public void run() {


                    Voice.modifyss("微零");
                }
            }.start();
        }catch (Exception e){
            new Thread(){
                @Override
                public void run() {
                    Voice.modifyss("微零");
                }
            }.start();
        }
    }


    public void sql(ActionEvent event) {  //平方根
        try {


        num = Double.parseDouble(text.getText());
        ans = Math.sqrt(num);

        text.setText(Double.toString(ans));
        new Thread(){
            @Override
            public void run() {


                Voice.modifyss("平方根是"+text.getText());
            }
        }.start();}catch (Exception e){
            new Thread(){
                @Override
                public void run() {
                    Voice.modifyss("错误的值");

                }
            }.start();

        }

    }
    public void PI(ActionEvent event) { //乘PI
        try {
            num = Double.parseDouble(text.getText());
            ans = Math.PI * num;


            text.setText(Double.toString(ans));
            new Thread(){
                @Override
                public void run() {

                    Voice.modifyss("乘与π是"+text.getText());
                }
            }.start();

        }catch (Exception e){

            new Thread(){
                @Override
                public void run() {

                    Voice.modifyss("错误的值");
                }
            }.start();
        }


    }
    public void rdm(ActionEvent event) { //随机

        Random random = new Random();

        ans = random.nextInt(100);

        text.setText(Double.toString(ans));

        new Thread(){
            @Override
            public void run() {
                Voice.modifyss("随机数是"+text.getText());
            }
        }.start();

    }
    public void del1(ActionEvent event) { //删除

        int length = text.getText().length();
        int numb =text.getText().length() -1;

        new Thread(){
            @Override
            public void run() {
                Voice.modifyss("backspace");
            }
        }.start();

        String stone;
        if (length > 0){

            StringBuilder back = new StringBuilder(text.getText());
            back.deleteCharAt(numb);
            stone = back.toString();
            text.setText(stone);

        }

    }



    public void ins(KeyEvent keyEvent) throws InterruptedException {
        if (keyEvent.getCode() == KeyCode.NUMPAD0){

            new Thread(){
                @Override
                public void run() {
                    Voice.modifyss("0");
                }
            }.start();

        }else  if (keyEvent.getCode() == KeyCode.NUMPAD1) {

            new Thread(){
                @Override
                public void run() {
                    Voice.modifyss("1");
                }
            }.start();
        }
        else  if (keyEvent.getCode() == KeyCode.NUMPAD2) {

            new Thread(){
                @Override
                public void run() {
                    Voice.modifyss("2");
                }
            }.start();
        }
        else  if (keyEvent.getCode() == KeyCode.NUMPAD3) {

            new Thread(){
                @Override
                public void run() {
                    Voice.modifyss("3");
                }
            }.start();
        }
        else  if (keyEvent.getCode() == KeyCode.NUMPAD4) {
            new Thread(){
                @Override
                public void run() {
                    Voice.modifyss("4");
                }
            }.start();



        }
        else  if (keyEvent.getCode() == KeyCode.NUMPAD5) {
            new Thread(){
                @Override
                public void run() {
                    Voice.modifyss("5");
                }
            }.start();


        }
        else  if (keyEvent.getCode() == KeyCode.NUMPAD6) {
            new Thread(){
                @Override
                public void run() {
                    Voice.modifyss("6");
                }
            }.start();


        }
        else  if (keyEvent.getCode() == KeyCode.NUMPAD7) {
            new Thread(){

                @Override
                public void run() {
                    Voice.modifyss("7");
                }
            }.start();

        }
        else  if (keyEvent.getCode() == KeyCode.NUMPAD8) {


            new Thread(){
                @Override
                public void run() {
                    Voice.modifyss("8");
                }
            }.start();

        }
        else  if (keyEvent.getCode() == KeyCode.NUMPAD9) {
            new Thread(){
                @Override
                public void run() {
                    Voice.modifyss("9");
                }
            }.start();

        }
        else  if (keyEvent.getCode() == KeyCode.SOFTKEY_0) {
            new Thread(){
                @Override
                public void run() {
                    Voice.modifyss("0");
                }
            }.start();

        }
        else  if (keyEvent.getCode() == KeyCode.BACK_SPACE) {
            new Thread(){
                @Override
                public void run() {
                    Voice.modifyss("删除");
                }
            }.start();

        }
    }


    public void inschar(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.C){
            Voice.modifyss("微0");
            text.setText(null);
            lab.setText(null);
        }else if (keyEvent.getCode() == KeyCode.PLUS){
            Voice.modifyss("微0");
            text.setText(null);
            lab.setText(null);

         }

    }


}
