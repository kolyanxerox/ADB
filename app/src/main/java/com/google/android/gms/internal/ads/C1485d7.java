package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.d7 */
/* loaded from: classes2.dex */
public final class C1485d7 {
    public static final void OooO00o(OooOOOo.o0ooOOo o0ooooo, C1386ai c1386ai) {
        File externalStorageDirectory;
        Context context = (Context) c1386ai.f17044OooOo0o;
        if (context == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        String str = (String) c1386ai.f17046OooOoO0;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) c1386ai.f17042OooOo;
        o0ooooo.f13435OooO0o0 = context;
        o0ooooo.f13434OooO0o = str;
        o0ooooo.f13430OooO00o = (String) c1386ai.f17045OooOoO;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        o0ooooo.f13437OooO0oo = atomicBoolean;
        atomicBoolean.set(((Boolean) AbstractC1486d8.f18204OooO0OO.OooOOO()).booleanValue());
        if (((AtomicBoolean) o0ooooo.f13437OooO0oo).get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            o0ooooo.f13429OooO = new File(new File(externalStorageDirectory, "sdk_csi_data.txt").getPath());
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ((LinkedHashMap) o0ooooo.f13432OooO0OO).put((String) entry.getKey(), (String) entry.getValue());
        }
        AbstractC2200wl.f25321OooO00o.execute(new RunnableC1442c1(o0ooooo, 8));
        HashMap map = (HashMap) o0ooooo.f13433OooO0Oo;
        C1521e7 c1521e7 = C1521e7.f18508OooO0OO;
        map.put("action", c1521e7);
        map.put("ad_format", c1521e7);
        map.put("e", C1521e7.f18509OooO0Oo);
    }
}
