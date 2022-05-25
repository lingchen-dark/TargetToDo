package com.juan.target_todo.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.juan.target_todo.databinding.ActivityMainBinding

/**
 * @author lingchen_dark
 * create_date: 2022/5/24
 * update_date: 2022/5/24
 */
class MainActivity : AppCompatActivity() {
    // 凡是不能立即赋值的变量均要使用lateinit来表示"延后赋值"
    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 使用ViewBinding来绑定界面
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        // 使用val表示一个final的变量, kotlin的get和set方法可以省略成成员变量的写法
        val viewRoot = mainBinding.root
        setContentView(viewRoot)
    }
}