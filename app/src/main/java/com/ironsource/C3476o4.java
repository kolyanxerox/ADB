package com.ironsource;

import android.os.Looper;
import android.util.Log;

/* renamed from: com.ironsource.o4 */
/* loaded from: classes2.dex */
public final class C3476o4 {

    /* renamed from: a */
    public static final a f10603a = new a(null);

    /* renamed from: com.ironsource.o4$a */
    public static final class a {
        private a() {
        }

        /* renamed from: a */
        public final void m11085a() {
            if (kotlin.jvm.internal.OooOo.OooO00o(Looper.myLooper(), Looper.getMainLooper())) {
                Log.e("AssertThread", "ALERT UI THREAD: " + Thread.currentThread().getStackTrace()[4].getMethodName());
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.OooOO0O oooOO0O) {
            this();
        }
    }

    /* renamed from: a */
    public static final void m11084a() {
        f10603a.m11085a();
    }
}
