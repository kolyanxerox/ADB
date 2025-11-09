package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class p11 {

    /* renamed from: OooOo0o */
    public static MessageDigest f23177OooOo0o;

    /* renamed from: OooOo0O */
    public final Object f23178OooOo0O;

    public p11(int i) {
        switch (i) {
            case 5:
                this.f23178OooOo0O = new C2045se();
                break;
            default:
                this.f23178OooOo0O = new Object();
                break;
        }
    }

    public abstract void o00000(Object obj, long j, byte b);

    public abstract int o000000();

    public abstract void o000000O(long j, byte[] bArr, long j2, long j3);

    public abstract void o000000o(Object obj, long j, boolean z);

    public abstract void o00000O(Object obj, long j, float f);

    public abstract void o00000O0(Object obj, long j, double d);

    public abstract boolean o00000OO(long j, Object obj);

    public abstract AbstractC1787lf o00000Oo();

    public synchronized void o00000o0(Object obj, Executor executor) {
        ((HashMap) this.f23178OooOo0O).put(obj, executor);
    }

    public abstract void o00000oO();

    public synchronized void o0000Ooo(InterfaceC1730jw interfaceC1730jw) {
        for (Map.Entry entry : ((HashMap) this.f23178OooOo0O).entrySet()) {
            ((Executor) entry.getValue()).execute(new wp0(20, interfaceC1730jw, entry.getKey()));
        }
    }

    public abstract float o000OOo(long j, Object obj);

    public abstract double o0O0O00(long j, Object obj);

    public MessageDigest o0OO00O() {
        synchronized (this.f23178OooOo0O) {
            MessageDigest messageDigest = f23177OooOo0o;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    f23177OooOo0o = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f23177OooOo0o;
        }
    }

    public abstract byte o0Oo0oo(long j);

    public abstract void oo0o0Oo(int i, long j);

    public abstract void zzh();

    public /* synthetic */ p11(Object obj) {
        this.f23178OooOo0O = obj;
    }

    public p11(View view) {
        this.f23178OooOo0O = new WeakReference(view);
    }

    public p11(Set set) {
        this.f23178OooOo0O = new HashMap();
        synchronized (this) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C2248xw c2248xw = (C2248xw) it.next();
                synchronized (this) {
                    o00000o0(c2248xw.f25811OooO00o, c2248xw.f25812OooO0O0);
                }
            }
        }
    }
}
