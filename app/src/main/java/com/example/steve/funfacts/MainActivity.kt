package com.example.steve.funfacts

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {
    var FunFacts: FunFacts? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        FunFacts = FunFacts()
        relativeLayout {

            val textView = textView {                                                               //Creates TextView
                id = 1
                text = "Fact: "
                textSize = 24f
            }

            button {                                                                                //Creates Button
                id = 2
                text = "Click here for Fact"
                textSize = 24f
                onClick {                                                                           //OnClick Method
                    run( {                                                                         //Lamda Function
                     textView.text = FunFacts!!.facts[
                             (Math.random() * FunFacts?.facts!!.size
                                     ).toInt()]
                }   )
                  }


                }.lparams{
                below(textView)
            }
            }
        }

    }




