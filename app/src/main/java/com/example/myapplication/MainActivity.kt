package com.example.myapplication

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var red = 1
    val green = 2
    val blue = 3

    val size22 = 4
    val size26 = 5
    val size30 = 6
    lateinit var color: TextView;
    lateinit var size: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contestmenu)
//        var chkBtn: CheckBox = findViewById<CheckBox>(R.id.chbExtMenu)
//        chkBtn.setOnClickListener {
//            println("log check")
//        }
        size = findViewById<TextView>(R.id.tvSize)
        color = findViewById<TextView>(R.id.tvColor)
        registerForContextMenu(size)
        registerForContextMenu(color)
//        val btn2 = findViewById<Button>(R.id.button);
//        btn2.setOnClickListener {
//            val intent = Intent(this@MainActivity, MainActivity2::class.java)
//            startActivity(intent);
//        }
//        val t1 = findViewById<TextView>(R.id.textView);
//        val chk = findViewById<CheckBox>(R.id.chbExtMenu);

    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) { //val red = 1
//        val green = 2
//        val blue = 3
//
//        val size22 = 4
//        val size26 = 5
//        val size30 = 6
        when (v?.id) {
            R.id.tvColor -> {
                menu?.let {
                    it.add(0, red, 0, "Red")
                    it.add(0, green, 0, "Green");
                    it.add(0, blue, 0, "Blue");
                }
            }
        }
        when (v?.id) {
            R.id.tvSize -> {
                menu?.let {
                    it.add(0, size22, 0, "22");
                    it.add(0, size26, 0, "26");
                    it.add(0, size30, 0, "30");
                }
            }
    }
        super.onCreateContextMenu(menu, v, menuInfo)
    }


    override fun onContextItemSelected(item: MenuItem): Boolean {
        //val red = 1
//        val green = 2
//        val blue = 3
//        val size22 = 4
//        val size26 = 5
//        val size30 = 6

        when (item.itemId) {red -> {
            color.setTextColor(Color.RED);
            color.text= ("Text color = red");
            }}
        when (item.itemId){ green -> {
            color.setTextColor(Color.GREEN);
            color.text = ("Text color = green");
        }}
        when (item.itemId) {blue -> {
            color.setTextColor(Color.BLUE);
            color.text = ("Text color = blue");
        }}
        when (item.itemId){size22 -> {
            size.textSize = (22F);
            size.text = ("Text size = 22");
        }}
        when (item.itemId) {size26 -> {
            size.textSize = 26F;
            size.text = ("Text size = 26");
        }}
        when (item.groupId) {size30 -> {
            size.textSize = 30F;
            size.text = ("Text size = 30");
        }}

        return super.onContextItemSelected(item)
    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        //menu!!.add("menu1");
//        //menu.add("menu2")
////        menu?.let {
////            it.add("menu1");
////            it.add("menu2");
////            it.add("menu3");
////            it.add("menu4");
////        }
        menu?.let{
            it.add(0,1,0,"add")
            it.add(0,2,0,"edit")
            it.add(0,3,3,"delete")
            it.add(1,4,1,"copy")
            it.add(1,5,2,"paste")
            it.add(1,6,4,"exit")
        }
//        //groupid - идентификатор группы, частью которой является пункт меню
//        //itemid - ID пункта меню
//        //order - для задания последовательности показа пунктов меню
        return super.onCreateOptionsMenu(menu)
    }}
//
//    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
//        val chk = findViewById<CheckBox>(R.id.chbExtMenu);
//        menu?.let{
//            it.setGroupVisible(1, chk.isChecked);
//        }
//        print("Log check");
//        return super.onPrepareOptionsMenu(menu)
//    }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        val t1 = findViewById<TextView>(R.id.textView);
//        val sb = StringBuilder()
//        sb.append("Item Menu");
//        sb.append("\r\n groupId: " + (item.groupId).toString());
//        sb.append("\r\n itemId: " + (item.itemId).toString());
//        sb.append("\r\n order: " + (item.order).toString());
//        sb.append("\r\n title: " + item.title);
//        t1.text = sb.toString();
//        return super.onOptionsItemSelected(item)}}


//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        Toast.makeText(this, item.title, Toast.LENGTH_LONG).show();
//        return super.onOptionsItemSelected(item)
//    }
//

//}



//        val t1 = findViewById<TextView>(R.id.text);
//        val button = findViewById<Button>(R.id.button4);
//        val button2 = findViewById<Button>(R.id.button5);
//        val button3 = findViewById<Button>(R.id.button6);
//        val im = findViewById<ImageView>(R.id.imageView2);
//        t1.setBackgroundColor(resources.getColor(R.color.white));
//
//        button.setOnClickListener {t1.setBackgroundColor(resources.getColor(R.color.design_default_color_error))
//        };
//        button2.setOnClickListener {t1.setBackgroundColor(resources.getColor(R.color.green))
//        };
//        button3.setOnClickListener {t1.setBackgroundColor(resources.getColor(R.color.design_default_color_primary_dark))
//        };
//
//        val url = "https://i.pinimg.com/originals/d9/a3/4d/d9a34dc08fa612bcb8bd378c2d7db1f1.jpg";
//        Glide.with(this)
//                .load(url)
//                .into(im);
//
//}
