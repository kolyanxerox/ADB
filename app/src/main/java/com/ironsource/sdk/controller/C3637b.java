package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.sdk.controller.C3657v;
import com.ironsource.sdk.utils.Logger;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* renamed from: com.ironsource.sdk.controller.b */
/* loaded from: classes2.dex */
class C3637b {

    /* renamed from: b */
    private static final String f11434b = "b";

    /* renamed from: a */
    private final C3657v.r f11435a;

    public C3637b(C3657v.r rVar) {
        this.f11435a = rVar;
    }

    /* renamed from: a */
    public void m11929a(String str) {
        C3657v.r rVar = this.f11435a;
        if (rVar != null) {
            rVar.m12249c(str);
        }
    }

    /* renamed from: b */
    public void m11931b(String str) {
        C3657v.r rVar = this.f11435a;
        if (rVar != null) {
            rVar.m12250d(str);
        }
    }

    /* renamed from: a */
    public synchronized void m11930a(String str, String str2) throws Exception {
        if (this.f11435a == null) {
            Logger.m12264e(f11434b, "!!! nativeAPI == null !!!");
            return;
        }
        Method declaredMethod = C3657v.r.class.getDeclaredMethod(str, String.class);
        if (declaredMethod.isAnnotationPresent(JavascriptInterface.class)) {
            declaredMethod.invoke(this.f11435a, str2);
        } else {
            throw new AccessControlException("Trying to access a private function: " + str);
        }
    }
}
