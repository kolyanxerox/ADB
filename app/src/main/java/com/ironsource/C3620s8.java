package com.ironsource;

import java.util.ArrayList;

/* renamed from: com.ironsource.s8 */
/* loaded from: classes2.dex */
public class C3620s8 {

    /* renamed from: a */
    private a f11344a = a.NOT_READY;

    /* renamed from: b */
    private ArrayList f11345b = new ArrayList();

    /* renamed from: c */
    private String f11346c;

    /* renamed from: com.ironsource.s8$a */
    public enum a {
        NOT_READY,
        READY
    }

    public C3620s8(String str) {
        this.f11346c = str;
    }

    /* renamed from: a */
    public synchronized void m11885a() {
        try {
            Object[] array = this.f11345b.toArray();
            for (int i = 0; i < array.length; i++) {
                ((Runnable) array[i]).run();
                array[i] = null;
            }
            this.f11345b.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public synchronized void m11887b() {
        this.f11344a = a.NOT_READY;
    }

    /* renamed from: c */
    public synchronized void m11888c() {
        this.f11344a = a.READY;
    }

    /* renamed from: a */
    public synchronized void m11886a(Runnable runnable) {
        if (this.f11344a != a.READY) {
            this.f11345b.add(runnable);
        } else {
            runnable.run();
        }
    }
}
