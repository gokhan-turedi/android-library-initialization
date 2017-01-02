package com.gturedi.awesomelibrary;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.Nullable;

/**
 * Created by gturedi on 3.01.2017.
 */
public class InitProvider extends ContentProvider {

    private static Context ctx;

    public static Context getCtx() {
        return ctx;
    }

    @Override
    public boolean onCreate() {
        ctx = getContext();
        return false;
    }

    @Nullable
    public Cursor query(Uri var1, String[] var2, String var3, String[] var4, String var5) {
        return null;
    }

    @Nullable
    public String getType(Uri var1) {
        return null;
    }

    @Nullable
    public Uri insert(Uri var1, ContentValues var2) {
        return null;
    }

    public int delete(Uri var1, String var2, String[] var3) {
        return 0;
    }

    public int update(Uri var1, ContentValues var2, String var3, String[] var4) {
        return 0;
    }

}