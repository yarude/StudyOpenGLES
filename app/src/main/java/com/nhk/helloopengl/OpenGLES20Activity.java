package com.nhk.helloopengl;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

public class OpenGLES20Activity extends Activity
{
    // 作为绘制的容器
    private GLSurfaceView gLView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // 创建并设置该view显示
        gLView = new MyGLSurfaceView(this);
        setContentView(gLView);
    }
}
