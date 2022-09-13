package com.example.toastlibrary

import android.content.Context
import android.widget.Toast

public class ToastMessage {
    public fun createToast(context: Context, message: String){
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}