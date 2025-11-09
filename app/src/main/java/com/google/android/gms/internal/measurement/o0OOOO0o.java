package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.ArrayMap;

/* loaded from: classes2.dex */
public abstract class o0OOOO0o {

    /* renamed from: OooO00o */
    public static final ArrayMap f26631OooO00o = new ArrayMap();

    public static synchronized Uri OooO00o() {
        ArrayMap arrayMap = f26631OooO00o;
        Uri uri = (Uri) arrayMap.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        arrayMap.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
