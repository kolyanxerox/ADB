package com.ironsource;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: com.ironsource.pw */
/* loaded from: classes2.dex */
public class C3539pw {
    /* renamed from: a */
    public static void m11460a(Context context, String str) throws Exception {
        m11461a(context, str, null);
    }

    /* renamed from: a */
    public static void m11461a(Context context, String str, String str2) throws Exception {
        if (TextUtils.isEmpty(str)) {
            throw new Exception("url is null");
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        if (!TextUtils.isEmpty(str2)) {
            intent.setPackage(str2);
        }
        context.startActivity(intent);
    }
}
