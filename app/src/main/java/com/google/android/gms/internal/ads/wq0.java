package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public abstract class wq0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public static final CopyOnWriteArrayList f25361OooO00o = new CopyOnWriteArrayList();

    public static void OooO00o(String str) throws GeneralSecurityException {
        Iterator it = f25361OooO00o.iterator();
        if (!it.hasNext()) {
            throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
        }
        it.next().getClass();
        throw new ClassCastException();
    }
}
