package com.amaurypm.general

import android.app.Activity
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso

fun Activity.color(@ColorRes color: Int) = ContextCompat.getColor(this, color)

fun Any?.isNull() = this == null

fun Activity.toast(text: String, length: Int = Toast.LENGTH_SHORT){
    Toast.makeText(this, text, length).show()
}

fun ImageView.loadGlide(url: String){
    if(url.isNotEmpty()){
        Glide.with(this.context).load(url).into(this)
    }
}

fun ImageView.loadPicasso(url: String){
    if(url.isNotEmpty()){
        Picasso.get().load(url).into(this)
    }
}

fun EditText.onTextChanged(listener: (String) -> Unit){
    this.addTextChangedListener(object: TextWatcher {
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

        }

        override fun afterTextChanged(p0: Editable?) {
            listener(p0.toString())
        }

    })
}
