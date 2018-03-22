package com.example.asus.mydemo;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.asus.mydemo.view.PresentedByActivity;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener{

    int Sred ,Sgren ,Sbblu, Salpha;
    SeekBar sbrRed, sbrGreen, sbrBlue, sbrAlpha;
    View viewColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sbrRed = (SeekBar) findViewById(R.id.redid);
        sbrGreen = (SeekBar) findViewById(R.id.grenid);
        sbrBlue = (SeekBar) findViewById(R.id.blueid);
        sbrAlpha = (SeekBar) findViewById(R.id.alphaid);
        viewColor = (View) findViewById(R.id.resultColors);

        sbrRed.setOnSeekBarChangeListener(this);
        sbrGreen.setOnSeekBarChangeListener(this);
        sbrBlue.setOnSeekBarChangeListener(this);
        sbrAlpha.setOnSeekBarChangeListener(this);

        registerForContextMenu(viewColor);
    }

    public void updateBackground(){
        Sred = sbrRed.getProgress();
        Sgren = sbrGreen.getProgress();
        Sbblu = sbrBlue.getProgress();
        Salpha = sbrAlpha.getProgress();
        int color = Color.argb(Salpha,Sred,Sgren,Sbblu);
        viewColor.setBackgroundColor(color);
    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        updateBackground();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.iteTransparent:
                sbrAlpha.setProgress(0);
                break;

            case R.id.iteSemiTransparent:
                sbrAlpha.setProgress(128);
                break;

            case R.id.iteOpaque:
                sbrAlpha.setProgress(255);
                break;

            case R.id.iteRed:
                sbrRed.setProgress(255);
                sbrGreen.setProgress(0);
                sbrBlue.setProgress(0);
                break;

            case R.id.iteGreen:
                sbrRed.setProgress(0);
                sbrGreen.setProgress(255);
                sbrBlue.setProgress(0);
                break;

            case R.id.iteBlue:
                sbrRed.setProgress(0);
                sbrGreen.setProgress(0);
                sbrBlue.setProgress(255);
                break;

            case R.id.iteCyan:
                sbrRed.setProgress(0);
                sbrGreen.setProgress(255);
                sbrBlue.setProgress(255);
                break;

            case R.id.iteMagenta:
                sbrRed.setProgress(255);
                sbrGreen.setProgress(0);
                sbrBlue.setProgress(255);
                break;

            case R.id.iteYellow:
                sbrRed.setProgress(255);
                sbrGreen.setProgress(255);
                sbrBlue.setProgress(0);
                break;

            case R.id.iteBlack:
                sbrRed.setProgress(0);
                sbrGreen.setProgress(0);
                sbrBlue.setProgress(0);
                break;

            case R.id.iteWhite:
                sbrRed.setProgress(255);
                sbrGreen.setProgress(255);
                sbrBlue.setProgress(255);
                break;

            case R.id.itePrepor:
                Intent intent = new Intent(this, PresentedByActivity.class);
                startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    //******************* INICIO MENU PRESIONANDO IMAGEN********************

    @Override
    public void onCreateContextMenu(ContextMenu menu,View view,ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu,view,menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.iteTransparent:
                sbrAlpha.setProgress(0);
                break;

            case R.id.iteSemiTransparent:
                sbrAlpha.setProgress(128);
                break;

            case R.id.iteOpaque:
                sbrAlpha.setProgress(255);
                break;

            case R.id.iteRed:
                sbrRed.setProgress(255);
                sbrGreen.setProgress(0);
                sbrBlue.setProgress(0);
                break;

            case R.id.iteGreen:
                sbrRed.setProgress(0);
                sbrGreen.setProgress(255);
                sbrBlue.setProgress(0);
                break;

            case R.id.iteBlue:
                sbrRed.setProgress(0);
                sbrGreen.setProgress(0);
                sbrBlue.setProgress(255);
                break;

            case R.id.iteCyan:
                sbrRed.setProgress(0);
                sbrGreen.setProgress(255);
                sbrBlue.setProgress(255);
                break;

            case R.id.iteMagenta:
                sbrRed.setProgress(255);
                sbrGreen.setProgress(0);
                sbrBlue.setProgress(255);
                break;

            case R.id.iteYellow:
                sbrRed.setProgress(255);
                sbrGreen.setProgress(255);
                sbrBlue.setProgress(0);
                break;

            case R.id.iteBlack:
                sbrRed.setProgress(0);
                sbrGreen.setProgress(0);
                sbrBlue.setProgress(0);
                break;

            case R.id.iteWhite:
                sbrRed.setProgress(255);
                sbrGreen.setProgress(255);
                sbrBlue.setProgress(255);
                break;

            case R.id.itePrepor:
                Intent intent = new Intent(this, PresentedByActivity.class);
                startActivity(intent);
        }
        return super.onContextItemSelected(item);
    }
    //******************* FIN INICIO MENU PRESIONANDO IMAGEN********************

}
