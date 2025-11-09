package com.google.android.gms.internal.measurement;

import androidx.collection.ArrayMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class oO0Oo {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final ArrayMap f26756OooO00o = new ArrayMap();

    public static synchronized void OooO00o() {
        ArrayMap arrayMap = f26756OooO00o;
        Iterator it = arrayMap.values().iterator();
        if (it.hasNext()) {
            ((oO0Oo) it.next()).getClass();
            throw null;
        }
        arrayMap.clear();
    }
}
