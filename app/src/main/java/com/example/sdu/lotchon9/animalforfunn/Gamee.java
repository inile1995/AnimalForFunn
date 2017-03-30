package com.example.sdu.lotchon9.animalforfunn;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collections;

public class Gamee extends AppCompatActivity {


    //Explicit ประการตัวแปร
    Button btn1,btn2,btn3,btn4;
    ImageView questionImageView;
    MediaPlayer mediaPlayer;
    ImageButton volumnImageButton;
    int questionCount = 10;
    ArrayList<Integer> qID = new ArrayList<Integer>();
    String answer; //เก็บคำตอบ
    int score = 0; // เก็บคะแนน

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamee);




        //Intitial View
            btn1 = (Button) findViewById(R.id.btn1);
            btn2 = (Button) findViewById(R.id.btn2);
            btn3 = (Button) findViewById(R.id.btn3);
            btn4 = (Button) findViewById(R.id.btn4);

            questionImageView = (ImageView) findViewById(R.id.imvQuestion);
            volumnImageButton = (ImageButton) findViewById(R.id.imbVolumn);

            for (int i = 1; i <= questionCount; i++) {
                qID.add(i); // จอง พท. หน่อวยความจำ
            }
            Collections.shuffle(qID);
            setQuestion(qID.remove(0));

        }// main Method

    private void setQuestion(Integer qID) { //setQuestion method แสดงผลแต่ละคำถาม
        //ข้อ1
        if (qID == 1){
            answer ="นก";
            questionImageView.setImageResource(R.drawable.bird_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.bird);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("นก");
            choice.add("แมว");
            choice.add("ช้าง");
            choice.add("ม้า");
            Collections.shuffle(choice);

            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }
        //ข้อ2
        if (qID == 2){
            answer ="แมว";
            questionImageView.setImageResource(R.drawable.cat_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.cat);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("แมว");
            choice.add("นก");
            choice.add("ช้าง");
            choice.add("ม้า");
            Collections.shuffle(choice);

            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }
        //ข้อ3
        if (qID == 3){
            answer ="วัว";
            questionImageView.setImageResource(R.drawable.cow_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.cow);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("วัว");
            choice.add("สิงโต");
            choice.add("หมู");
            choice.add("ม้า");
            Collections.shuffle(choice);

            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }
        //ข้อ4
        if (qID == 4){
            answer ="สุนัข";
            questionImageView.setImageResource(R.drawable.dog_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.dog);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("สุนัข");
            choice.add("ช้าง");
            choice.add("วัว");
            choice.add("ม้า");
            Collections.shuffle(choice);

            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }
        //ข้อ5
        if (qID == 5){
            answer ="ช้าง";
            questionImageView.setImageResource(R.drawable.elephant_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.elephant);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("นก");
            choice.add("แมว");
            choice.add("ช้าง");
            choice.add("ม้า");
            Collections.shuffle(choice);

            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }
        //ข้อ6
        if (qID == 6){
            answer ="ม้า";
            questionImageView.setImageResource(R.drawable.horse_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.horse);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ม้า");
            choice.add("วัว");
            choice.add("ช้าง");
            choice.add("แมว");
            Collections.shuffle(choice);

            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }
        //ข้อ7
        if (qID == 7){
            answer ="สิงโต";
            questionImageView.setImageResource(R.drawable.lion_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.lion);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("สิงโต");
            choice.add("วัว");
            choice.add("ช้าง");
            choice.add("หมู");
            Collections.shuffle(choice);

            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }
        //ข้อ8
        if (qID == 8){
            answer ="ยุง";
            questionImageView.setImageResource(R.drawable.mosquito_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.mosquito);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("ยุง");
            choice.add("ช้าง");
            choice.add("ม้า");
            choice.add("แกะ");
            Collections.shuffle(choice);

            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }
        //ข้อ9
        if (qID == 9){
            answer ="หมู";
            questionImageView.setImageResource(R.drawable.pig_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.pig);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("หมู");
            choice.add("ยุง");
            choice.add("ช้าง");
            choice.add("ม้า");
            Collections.shuffle(choice);

            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }
        //ข้อ10
        if (qID == 10){
            answer ="แกะ";
            questionImageView.setImageResource(R.drawable.sheep_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.sheep);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("แกะ");
            choice.add("ยุง");
            choice.add("นก");
            choice.add("สุนัข");
            Collections.shuffle(choice);

            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }
    }// end setQuestion Method แสดงผลคำถามบนหน้า xml

    public void choiceAns(View view){ // choiceAns Method สำหรับตรวจคำตอบ
        Button button = (Button) view;
        String buttonString = button.getText().toString(); //เก็บข้อความบนปุ่มลงตัวแปร buttonString
        if(buttonString.equals(answer)){
            score++;
        }
        if (qID.isEmpty()) { //เช็คว่าทำครบทุกข้อแล้วรึยัง ถ้าทำครลททุกข้อแล้ว
            dialogBoxScore();
        } else {            // ถ้ายังทำไม่ครบ
            setQuestion(qID.remove(0));
        }
    } //end choiceAns method

    public void dialogBoxScore(){ // method แสดงคะแนน
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("สรุปคะแนน");
        builder.setMessage("คุณได้คะแนน" + score + "คะแนน")
        .setCancelable(false)
        .setPositiveButton("Exit:ออกจากเกมส์", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int i) {
                finish();
            }
        }).setNegativeButton("PlayAgain:เล่นอีกครั้ง", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Intent intent = getIntent();
                finish();
                startActivity(intent);
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    } // End dialogBoxScore method

    public void playSound(View view){
        mediaPlayer.start();


    } // End method
} // End Class
