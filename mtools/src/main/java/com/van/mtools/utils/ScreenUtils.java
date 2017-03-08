package com.van.mtools.utils;

import android.content.Context;
import android.view.WindowManager;

/**
*屏幕工具类
*/
public class ScreenUtils {

    public static  int  getScreenWith(Context context){
        WindowManager ss = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        return UIUtils.px2dp(context,ss.getDefaultDisplay().getWidth());
    }

    public static  int  getScreenHeight(Context context){
        WindowManager ss = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        return ss.getDefaultDisplay().getHeight();
    }


}
